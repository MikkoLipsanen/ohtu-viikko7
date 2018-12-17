
package ohtu.kivipaperisakset;


public class Peli implements Komento{
    
    
    public static Komento luoKaksinpeli(){
        Komento komento = new KPSPelaajaVsPelaaja();
        return komento;
    }
    
    public static Komento luoHelppoYksinpeli(){
        Komento komento = new KPSTekoaly();
        return komento;
    }
    
    public static Komento luoVaikeaYksinpeli(){
        Komento komento = new KPSParempiTekoaly();
        return komento;

    }

    @Override
    public void suorita() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
