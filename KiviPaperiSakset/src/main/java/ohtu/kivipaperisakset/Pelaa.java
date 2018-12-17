/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class Pelaa implements Komento{

    Tuomari tuomari = new Tuomari();
    private static Scanner lukija = new Scanner(System.in);
    protected String ekanSiirto;
    protected String tokanSiirto;
    
    
    @Override
    public void suorita() {
        System.out.println("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = lukija.nextLine();
        tokanSiirto = pelaa();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);

            System.out.println("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = lukija.nextLine();

            tokanSiirto = pelaa();
        }

        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    protected abstract String pelaa();

}




