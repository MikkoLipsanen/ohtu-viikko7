package ohtu.kivipaperisakset;

public class KPSTekoaly extends Pelaa{

    private Tekoaly tekoaly = new Tekoaly();
    
    @Override
    protected String pelaa() {
 
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: "+tokanSiirto);
        return(tokanSiirto);

    }


}