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
  players:Player[]=[
    {id:1,name:"hasse",team:"est",position:"milieu"},
    {id:3,name:"hasse",team:"est",position:"milieu"},
    {id:2,name:"hasse",team:"est",position:"milieu"},
  ];


  ngOnInit(): void {
    // this.playerService.getAllPlayers().subscribe((players)=>{
    //   this.players=players
    // })
  }

  constructor(private readonly playerService:PlayerService){}


}
