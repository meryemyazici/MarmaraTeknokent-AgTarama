package martekstaj;

import java.io.IOException;
import java.net.InetAddress;

public class pingAtma {

    public static boolean pingAt(String hedefAdress) {

        emailAtma mail = new emailAtma();
        try {
            InetAddress inetAddress = InetAddress.getByName(hedefAdress);

            // ping gonderme
            boolean reachable = inetAddress.isReachable(1000); // 1 saniye 

            if (reachable) {
                //System.out.println(hedefAdress + " erisilebilir.");
                return true;
            } else { //erisilir ise true               
                mail.gerceklesme(hedefAdress);
                return false;
            }
        } catch (IOException e) {
            System.err.println("Ping hatası: " + e.getMessage());
            return false;
        }
    }
}


