package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends Pelaa{

    private static Scanner lukija = new Scanner(System.in);

    @Override
    protected String pelaa() {
            
        System.out.println("Toisen pelaajan siirto: ");
        tokanSiirto = lukija.nextLine();
      
        return tokanSiirto;
    }
}