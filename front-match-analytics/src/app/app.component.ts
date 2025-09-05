import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PlayerTableComponent } from "./player-table/player-table.component";
import { ChartComponent } from "./chart/chart.component";
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet,CommonModule, PlayerTableComponent, ChartComponent]
})
export class AppComponent {
  title = 'front-match-analytics';
}
