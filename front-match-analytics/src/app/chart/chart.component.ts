import {
  AfterViewInit,
  Component,
  ElementRef,
  Input,
  OnInit,
  ViewChild,
} from '@angular/core';

import { Chart, registerables } from 'chart.js';
import { PlayerService } from '../services/player.service';
import { CommonModule } from '@angular/common';
Chart.register(...registerables);
@Component({
  selector: 'app-chart',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './chart.component.html',
  styleUrl: './chart.component.css',
})
export class ChartComponent implements AfterViewInit, OnInit {
  chart: any;
  loading = false;
  errorMessage = '';
  @ViewChild('canvas', { static: false })
  canvas!: ElementRef<HTMLCanvasElement>;
  @Input() chartId!: string;
  ngAfterViewInit(): void {
    if (this.canvas) {
      this.chart = new Chart(this.canvas.nativeElement, this.config);
    }
  }

  ngOnInit(): void {
    this.loadData();
  }

  constructor(private readonly playerService: PlayerService) {}

  loadData(): void {
    this.loading = true;
    this.errorMessage = '';
    this.playerService.getAllPlayers().subscribe({
      next: (players) => {
        this.loading = false;
        this.config.data.labels = players.map((p) => p.playerName);

        this.config.data.datasets[0].data = players.map((p) => p.goals);
        this.config.data.datasets[1].data = players.map((p) => p.assists);

        if (this.chart) {
          this.chart.update();
        }
      },
      error: (err) => {
        console.error('Erreur API', err);
        this.errorMessage = 'Error APi : Cannot get data';
        this.loading = false;
      },
    });
  }

  public config: any = {
    type: 'bar',
    data: {
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
    },
  };
}
