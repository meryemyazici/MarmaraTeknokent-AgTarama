package martekstaj;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class agTaramasi {

    static final int threadSayisi = 10;
    private static String bilgisayarIp;
    private static String ilk3ByteIp;

    public static void main(String[] args) throws UnknownHostException {
        cihazIpAdresim();
        threadOlustur();
    }

    public static void cihazIpAdresim() throws UnknownHostException {
        InetAddress pcIp = InetAddress.getLocalHost();
        setBilgisayarIp(pcIp.getHostAddress()); // cihazimizin ip adresini stringe cevirir

        int x = bilgisayarIp.lastIndexOf(".");   //sondaki ilk noktaya kadar     
        setIlk3ByteIp(getBilgisayarIp().substring(0, x + 1)); //x+1 sebebi son . yi da alsin
        //System.out.println("ip adresimin ilk 3 byte'i:  " + getIlk3ByteIp());

    }

    public static void threadOlustur() {
        Thread[] threads = new Thread[threadSayisi];
        for (int i = 0; i < threadSayisi; i++) {
            int tIndex = i;
            System.out.println("thread " + tIndex + "birler basamagi " + tIndex + " tarayacak");
            threads[i] = new Thread(new agTaramasiIslemler(getIlk3ByteIp(), tIndex)); // Thread'i dizinin ilgili indisine atayın
            threads[i].start();
        }
        for (int i = 0; i < threadSayisi; i++) {
            try {
                threads[i].join(); // Thread'in bitmesini bekle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getBilgisayarIp() {
        return bilgisayarIp;
    }

    public static void setBilgisayarIp(String bilgisayarIp) {
        agTaramasi.bilgisayarIp = bilgisayarIp;
    }

    public static String getIlk3ByteIp() {
        return ilk3ByteIp;
    }

    public static void setIlk3ByteIp(String ilk3ByteIp) {
        agTaramasi.ilk3ByteIp = ilk3ByteIp;
    }

}
