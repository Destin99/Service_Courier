/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicecourrier;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author FOUDA
 */
public class ServiceCourrier {

    /**
     */
    public static void effacer() {
        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException excpt) {
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        }
    }

    public static void lettre(SacPostal s) {
        System.out.println("\n\t\t Lettre");
        String r;
        Scanner lect = new Scanner(System.in);
        System.out.print("Lettre express ? Y = oui | N = non : ");
        r = lect.next();
        if (r.equals("Y")) {
            System.out.print("\n Numéro du courrier : ");
            int num = lect.nextInt();
            System.out.print("\n Date réception (jj/mm/yy) : ");
            String d = lect.next();
            Date date = new Date(d);
            System.out.print("\n Poids : ");
            int p = lect.nextInt();
            System.out.print("\n Service : ");
            String serv = lect.next();
            s.addCourrier(new LettreOrdinaire(num, date, p, serv.toUpperCase(), true));
        } else {
            System.out.print("\n Numéro du courrier : ");
            int num = lect.nextInt();
            System.out.print("\n Date réception (jj/mm/yy) : ");
            String d = lect.next();
            Date date = new Date(d);
            System.out.print("\n Poids : ");
            int p = lect.nextInt();
            System.out.print("\n Service : ");
            String serv = lect.next();
            s.addCourrier(new LettreOrdinaire(num, date, p, serv.toLowerCase(), false));

        }
        System.out.print("\n\t\t Continuez...");
        Short pause = lect.nextShort();
        effacer();

    }

    public static void lettreRecommande(SacPostal s) {
        System.out.println("\n\t\t Lettre");
        String r;
        Scanner lect = new Scanner(System.in);
        System.out.print("Lettre express ? Y = oui | N = non : ");
        r = lect.next();
        if (r.equals("Y")) {
            System.out.print("\n Numéro du courrier : ");
            int num = lect.nextInt();
            System.out.print("\n Date réception (jj/mm/yy) : ");
            String d = lect.next();
            Date date = new Date(d);
            System.out.print("\n Poids : ");
            int p = lect.nextInt();
            System.out.print("\n Service : ");
            String serv = lect.next();
            s.addCourrier(new LettreRecommande(num, date, p, serv.toLowerCase(), true));
        } else {
            System.out.print("\n Numéro du courrier : ");
            int num = lect.nextInt();
            System.out.print("\n Date réception (jj/mm/yy) : ");
            String d = lect.next();
            Date date = new Date(d);
            System.out.print("\n Poids : ");
            int p = lect.nextInt();
            System.out.print("\n Service : ");
            String serv = lect.next();
            s.addCourrier(new LettreRecommande(num, date, p, serv.toLowerCase(), false));

        }
        System.out.print("\n\t\t Continuez...");
        Short pause = lect.nextShort();
        effacer();

    }

    public static void colis(SacPostal s) {
        System.out.println("\n\t\t Lettre");
        String r;
        Scanner lect = new Scanner(System.in);
        System.out.print("Lettre express ? Y = oui | N = non : ");
        r = lect.next();
        if (r.equals("Y")) {
            System.out.print("\n Numéro du courrier : ");
            int num = lect.nextInt();
            System.out.print("\n Date réception (jj/mm/yy) : ");
            String d = lect.next();
            Date date = new Date(d);
            System.out.print("\n Poids : ");
            int p = lect.nextInt();
            System.out.print("\n Service : ");
            String serv = lect.next();
            s.addCourrier(new Colis(num, date, p, serv.toLowerCase(), true));
        } else {
            System.out.print("\n Numéro du courrier : ");
            int num = lect.nextInt();
            System.out.print("\n Date réception (jj/mm/yy) : ");
            String d = lect.next();
            Date date = new Date(d);
            System.out.print("\n Poids : ");
            int p = lect.nextInt();
            System.out.print("\n Service : ");
            String serv = lect.next();
            s.addCourrier(new Colis(num, date, p, serv.toLowerCase(), false));

        }
        System.out.print("\n\t\t Continuez...");
        Short pause = lect.nextShort();
        effacer();

    }
    
    public static void affranchirCourrier(SacPostal s) {
        System.out.println("\n\t\t Affranchir Courrier \n\n");
        Scanner lect = new Scanner(System.in);
        System.out.println(s);
        System.out.print("\n\t\t Continuez.....");
        Short pause = lect.nextShort();
        effacer();
        
    }
    
    public static void totalAffranchissement(SacPostal s) {
        System.out.println("\n\t\t Total Affranchissement Courrier \n\n");
        Scanner lect = new Scanner(System.in);
        System.out.print("\nNombre de courrier : "+s.getCourriers().size());
        System.out.print("\nTotal afrranchissement : "+s.total());
        System.out.print("\n\t\t Continuez.....");
        Short pause = lect.nextShort();
        effacer();
        
    }

    public static void menuPrincipal(SacPostal s) {
        System.out.println("\n\t\t * \t\t\t\t*");
        System.out.println("\t\t\t COURRIERS ");
        System.out.println("\n\t\t * \t\t\t\t * \n\n");
        System.out.println("\n\t1- Lettre ordinaire");
        System.out.println("\n\t2- Lettre recommandée");
        System.out.println("\n\t3- Colis");
        System.out.println("\n\t4- Affranchir les courriers");
        System.out.println("\n\t5- Coût total d'affranchissement");
        System.out.println("\n\t6- Coût mensuel d'affranchissement");
        System.out.print("\t\t\t\t\n\n\t\t\t\t\t\tVotre choix : ");
        Scanner lect = new Scanner(System.in);
        int choix = lect.nextInt();
        switch (choix) {
            case 1:
                effacer();
                lettre(s);
                menuPrincipal(s);
                break;
            case 2:
                effacer();
                lettreRecommande(s);
                menuPrincipal(s);
                break;
            case 3:
                effacer();
                colis(s);
                menuPrincipal(s);
                break;
            case 4:
                effacer();
                affranchirCourrier(s);
                menuPrincipal(s);
                break;
            case 5:
                effacer();
                totalAffranchissement(s);
                menuPrincipal(s);
                break;
        }
    }

    public static void main(String[] args) {
        menuPrincipal(new SacPostal(new Date()));
    }

}
