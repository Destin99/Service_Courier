/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicecourrier;

import java.util.Date;

/**
 *
 * @author FOUDA
 */
public abstract class Courrier {
    protected int numCourrier;
    protected Date dateReception;
    protected int poids;
    protected String service;
    protected boolean express;

    public Courrier(int numCourrier, Date dateReception, int poids, String service, boolean express) {
        this.numCourrier = numCourrier;
        this.dateReception = dateReception;
        this.poids = poids;
        this.service = service;
        this.express = express;
    }
    
    /*
    NB: Le constructeur sert à léguer les propriétés aux classes filles.
    */
    
    public abstract float tarifExpress();
    public abstract float tarifNormal();
    public float tarif(){
        if(this.express){
            return this.tarifExpress();
        }else{
            return this.tarifNormal();
        }
    }

    public String getService() {
        return service;
    }
    
    
    
}
