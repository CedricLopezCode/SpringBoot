import { Conducteur } from "./conducteur";
import { Vehicule } from "./vehicule";

export class Association {
    id !: number;
    conducteur !: Conducteur;
    vehicule !: Vehicule
}
