import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Association } from '../model/association';
import { Conducteur } from '../model/conducteur';
import { Vehicule } from '../model/vehicule';

@Injectable({
  providedIn: 'root'
})
export class AssociationService {

  private urlSite = 'http://localhost:8083';

  constructor(private http: HttpClient) { }

  /*RRRR de CRUD */
  listeAllAssociations(): Observable<Association[]>{
    return this.http.get<Association[]>(`${this.urlSite}/listeAllAssociations/api`);
  }
  listeConducteursSansVehicule(): Observable<Conducteur[]>{
    return this.http.get<Conducteur[]>(`${this.urlSite}/listeConducteursSansVehicule/api`);
  }
  listeVehiculeSansConducteur(): Observable<Vehicule[]>{
    return this.http.get<Vehicule[]>(`${this.urlSite}/listeVehiculeSansConducteur/api`);
  }
  /*CCCC de CRUD */
  createAssociation(assocAAjouter: object): Observable<object>{
    console.log(assocAAjouter);
    return this.http.post(`${this.urlSite}/ajoutAssociation/api`, assocAAjouter);
  }
  /*UUUU de CRUD */
  updateAssociation(idCondAModifier: number): Observable<Association[]>{
    return this.http.get<Association[]>(`${this.urlSite}/pageAssociation/api`);
  }
  /*DDDD de CRUD */
  deleteAssociation(idCondASupp: number): Observable<Association[]>{
    return this.http.get<Association[]>(`${this.urlSite}/pageAssociation/api`);
  }
}
