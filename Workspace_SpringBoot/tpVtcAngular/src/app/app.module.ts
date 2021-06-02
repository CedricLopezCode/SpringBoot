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

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    ContenuComponent,
    ConducteurComponent,
    VehiculeComponent,
    AssociationComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
