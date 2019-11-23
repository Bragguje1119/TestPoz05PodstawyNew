import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {

    public static Double cenaBrutto(Double cena) {
        return cena*1.23;
    }

    public static void main (String [] args) {
        HashMap<String, Double> owoce = new HashMap<> ();
        owoce.put ("jablko", 2.5);
        owoce.put ("banan", 4.8);
        owoce.put ("gruszka", 6.29);
        List <String> nazwyOwocow = new ArrayList<> ();
        nazwyOwocow.add ("jablko");
        nazwyOwocow.add ("banan");
        nazwyOwocow.add ("gruszka");


        Double cenaSumaryczna = 0.0;
        for(Integer i =0; i<3; i++) {
            String owoc = nazwyOwocow.get (i);
            cenaSumaryczna += cenaBrutto (owoce.get (owoc));
        }
        System.out.println ("Cena Twoich zakupów to: " +cenaSumaryczna.toString ());
    }

}
