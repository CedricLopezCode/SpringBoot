import { Injectable } from '@angular/core';
import { HttpClient  } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Conducteur } from '../model/conducteur';

@Injectable({
  providedIn: 'root'
})
export class ConducteurService {

  private urlSite = 'http://localhost:8083';

  constructor(private http: HttpClient) { }

  /*RRRR de CRUD */
  listeAllConducteurs(): Observable<Conducteur[]>{
    return this.http.get<Conducteur[]>(`${this.urlSite}/listeAllConducteurs/api`);
  }
  /*CCCC de CRUD */
  createConducteur(condAAjouter: object): Observable<object>{
    return this.http.post(`${this.urlSite}/ajoutConducteur/api`, condAAjouter);
  }
  /*UUUU de CRUD */
  recupCondAModif(idCondAModifier: number): Observable<Conducteur>{
    return this.http.get<Conducteur>(`${this.urlSite}/recupCondAModif/api/${idCondAModifier}`);
  }
  /*DDDD de CRUD */
  deleteConducteur(idCondASupp: number): Observable<Conducteur[]>{
    return this.http.get<Conducteur[]>(`${this.urlSite}/pageConducteur/api`);
  }


}
