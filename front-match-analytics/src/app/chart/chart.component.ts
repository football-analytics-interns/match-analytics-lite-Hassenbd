import { AfterViewInit, Component, ElementRef, Input, OnInit, ViewChild } from '@angular/core';

import {
  Chart, registerables
} from 'chart.js';
import { PlayerService } from '../services/player.service';
Chart.register(...registerables);
@Component({
  selector: 'app-chart',
  standalone: true,
  imports: [],
  templateUrl: './chart.component.html',
  styleUrl: './chart.component.css',
})
export class ChartComponent implements AfterViewInit,OnInit {
  chart:any;
  @ViewChild('canvas') canvas!: ElementRef<HTMLCanvasElement>;
   @Input() chartId!: string;
  ngAfterViewInit(): void {
    this.chart=new Chart(this.canvas.nativeElement,this.config);
  }

  ngOnInit(): void {
    this.loadData();
  }

  constructor(private readonly playerService:PlayerService){}


  loadData(): void {
  this.playerService.getAllPlayers().subscribe({
    next: (players) => {
      this.config.data.labels = players.map(p => p.playerName);

      this.config.data.datasets[0].data = players.map(p => p.goals);
      this.config.data.datasets[1].data = players.map(p => p.assists);

      if (this.chart) {
        this.chart.update();
      }
    },
    error: (err) => {
      console.error('Erreur API', err);
    }
  });
}



  public config:any={
    type:'bar',
  data : {
    labels: [],
    datasets: [
      {
        label: 'Goals',
        data: [],
        backgroundColor: 'red',
        borderWidth: 1,
      },
      {
        label: 'Assists',
        data: [],
        backgroundColor: 'blue',
        borderWidth: 1,
      },
    ],
  }
}
}
