import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConducteurComponent } from './conducteur/conducteur.component';
import { VehiculeComponent } from './vehicule/vehicule.component';
import { AssociationComponent } from './association/association.component';
import { FormModifCondComponent } from './conducteur/form-modif-cond/form-modif-cond.component';

const routes: Routes = [
  { path: 'pageConducteur', component: ConducteurComponent },
  { path: 'pageVehicule', component: VehiculeComponent},
  { path: 'pageAssociation', component: AssociationComponent},
  { path: 'updateCond:/id', component: FormModifCondComponent}
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
