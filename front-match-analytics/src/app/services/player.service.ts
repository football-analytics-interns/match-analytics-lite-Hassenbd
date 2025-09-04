import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from '../models/player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private readonly http: HttpClient) { }

   url:string="http://localhost:8080/";

   public getAllPlayers():Observable<Player[]>{
    const urlPlayers=`${this.url}/player`;
    return this.http.get<Player[]>(urlPlayers);
   }
}
