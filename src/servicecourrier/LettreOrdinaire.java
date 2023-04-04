/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicecourrier;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author FOUDA
 */
public class LettreOrdinaire extends Courrier {

    public LettreOrdinaire(int numCourrier, Date dateReception, int poids, String service, boolean express) {
        super(numCourrier, dateReception, poids, service, express);
    }

    @Override
    public float tarifNormal() {
        if(this.poids <= 50){
            return 200;
        }else{
            return 300;
        }
    }

    @Override  // Veut dire redéfinition
    public float tarifExpress() {
        return this.tarifNormal() + (25 * this.poids);
    }
    
    @Override
    public String toString(){
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        return "\n\t Lettre ordinaire" +"\n Numéro courrier : "+this.numCourrier+"\n Date reception : " +  sd.format(this.dateReception) + "\n Service : " + this.service + "\n Poids : "
                + this.poids + "g" + "\n Express : " + ((this.express)? "Oui":"Non") + "\n Tarif : " + this.tarif() + "FCFA";
    }
}
