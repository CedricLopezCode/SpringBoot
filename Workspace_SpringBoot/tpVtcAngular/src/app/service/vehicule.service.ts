import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Vehicule } from '../model/vehicule';

@Injectable({
  providedIn: 'root'
})
export class VehiculeService {

  private urlSite = 'http://localhost:8083';

  constructor(private http: HttpClient) { }

  /*RRRR de CRUD */
  listeAllVehicules(): Observable<Vehicule[]>{
    return this.http.get<Vehicule[]>(`${this.urlSite}/listeAllVehicules/api`);
  }
  /*CCCC de CRUD */
  createVehicule(vehiAAjouter: object): Observable<object>{
    console.log(vehiAAjouter);
    return this.http.post(`${this.urlSite}/ajoutVehicule/api`, vehiAAjouter);

  }
  /*UUUU de CRUD */
  recupVehiculeAModifier(idVehiAModifier: number): Observable<Vehicule>{
    return this.http.get<Vehicule>(`${this.urlSite}/vehiculeAModifier/api/${idVehiAModifier}`);
  }
  /*DDDD de CRUD */
  deleteVehicule(idCondASupp: number): Observable<Vehicule[]>{
    return this.http.get<Vehicule[]>(`${this.urlSite}/pageVehicule/api`);
  }

}
