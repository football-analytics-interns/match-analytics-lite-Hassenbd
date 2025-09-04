import { AfterViewInit, Component, ElementRef, Input, ViewChild } from '@angular/core';

import {
  Chart, registerables
} from 'chart.js';
Chart.register(...registerables);
@Component({
  selector: 'app-chart',
  standalone: true,
  imports: [],
  templateUrl: './chart.component.html',
  styleUrl: './chart.component.css',
})
export class ChartComponent implements AfterViewInit {
  chart:any;
  @ViewChild('canvas') canvas!: ElementRef<HTMLCanvasElement>;
   @Input() chartId!: string;
  ngAfterViewInit(): void {
    console.log(this.chartId);
    this.chart=new Chart(this.canvas.nativeElement,this.config);
  }

  public config:any={
    type:'bar',
  data : {
    labels: ['A', 'B', 'C', 'B','E'],
    datasets: [
      {
        label: 'Goal',
        data: [2, 1, 0, 1, 5],
        backgroundColor: 'red',
        borderWidth: 1,
      },
      {
        label: 'Assists',
        data: [2, 1, 0, 5, 0],
        backgroundColor: 'blue',
        borderWidth: 1,
      },
    ],
  }
}
}
