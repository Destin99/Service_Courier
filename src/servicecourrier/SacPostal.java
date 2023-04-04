/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicecourrier;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author FOUDA
 */
public class SacPostal {

    private final Date date;
    private final List<Courrier> Courriers;

    public SacPostal(Date date) {
        Courriers = new ArrayList<>();
        this.date = date;
    }

    public void addCourrier(Courrier c) {
        Courriers.add(c);
    }

    public float total() {
        float somme = 0;
        for (Courrier c : Courriers) {
            somme += c.tarif();
        }
        return somme;
    }

    @Override
    public String toString() {
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        String r = "\n Date : " + sd.format(this.date);
        for (Courrier c : Courriers) {
            r += c + "\n";
        }
        return r;
    }

    public List<Courrier> getCourriers() {
        return Courriers;
    }
    

}
