import { Component, OnInit } from '@angular/core';
import { Player } from '../models/player';
import { PlayerService } from '../services/player.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-player-table',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './player-table.component.html',
  styleUrl: './player-table.component.css'
})
export class PlayerTableComponent implements OnInit{
  players:Player[]=[];
  loading = false;
  errorMessage = '';

  constructor(private readonly playerService:PlayerService){}


  ngOnInit(): void {
    this.loadData();
  }

  loadData(): void {
    this.loading = true;
    this.errorMessage = '';

    this.playerService.getAllPlayers().subscribe({
      next: (players) => {
        this.players = players;
        this.loading = false;
      },
      error: (err) => {
        console.error('Erreur API', err);
        this.errorMessage = 'Impossible de charger les joueurs.';
        this.loading = false;
      }
    });
  }




}
