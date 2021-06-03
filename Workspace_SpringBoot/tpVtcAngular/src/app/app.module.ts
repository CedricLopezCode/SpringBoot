import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { ContenuComponent } from './contenu/contenu.component';
import { ConducteurComponent } from './conducteur/conducteur.component';
import { VehiculeComponent } from './vehicule/vehicule.component';
import { AssociationComponent } from './association/association.component';
import { HomeComponent } from './home/home.component';
import { ReadCondComponent } from './conducteur/read-cond/read-cond.component';
import { FormCondComponent } from './conducteur/form-cond/form-cond.component';
import { ReadVehiculeComponent } from './vehicule/read-vehicule/read-vehicule.component';
import { FormVehiculeComponent } from './vehicule/form-vehicule/form-vehicule.component';
import { ReadAssociationComponent } from './association/read-association/read-association.component';
import { FormAssociationComponent } from './association/form-association/form-association.component';
import { FormModifCondComponent } from './conducteur/form-modif-cond/form-modif-cond.component';
import { FormModifVehiculeComponent } from './vehicule/form-modif-vehicule/form-modif-vehicule.component';
import { FormModifAssociationComponent } from './association/form-modif-association/form-modif-association.component';
import { ListeCondssVehiComponent } from './association/liste-condss-vehi/liste-condss-vehi.component';
import { ListeVehissCondComponent } from './association/liste-vehiss-cond/liste-vehiss-cond.component';

import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    ContenuComponent,
    ConducteurComponent,
    VehiculeComponent,
    AssociationComponent,
    HomeComponent,
    ReadCondComponent,
    ReadVehiculeComponent,
    FormVehiculeComponent,
    ReadAssociationComponent,
    FormAssociationComponent,
    FormModifCondComponent,
    FormModifVehiculeComponent,
    FormModifAssociationComponent,
    ListeCondssVehiComponent,
    ListeVehissCondComponent,
    FormCondComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
