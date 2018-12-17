package ohtu.kivipaperisakset;


public class KPSParempiTekoaly extends Pelaa{
    
    TekoalyParannettu tekoaly = new TekoalyParannettu(20);   
    
    @Override
    protected String pelaa() {
        
        tekoaly.asetaSiirto(ekanSiirto);
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return(tokanSiirto);
    }

   
}
