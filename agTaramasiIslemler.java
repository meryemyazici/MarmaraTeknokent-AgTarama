package martekstaj;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class agTaramasiIslemler implements Runnable {

    private final String ilk3ByteIp;
    private final int birlerBas;

    public agTaramasiIslemler(String ilk3ByteIp, int birlerBas) {
        this.ilk3ByteIp = ilk3ByteIp;
        this.birlerBas = birlerBas;
    }

    @Override
    public void run() { // Thread calistiginda otomatik cagrilir
        Tarama(ilk3ByteIp, birlerBas); // Tarama metodunu cagriyor

    }

    public static void Tarama(String ilk3ByteIp, int birlerBas) {
        for (int i = birlerBas; i < 256; i += 10) { // birler basamagi 10'ar 10'ar arttirdik
            try {
                InetAddress host = InetAddress.getByName(ilk3ByteIp + i); // IP adresi olusturduk
                if (host.isReachable(1000)) { // ip adresine erisilebilir ise cihaz 1 saniyede yanit verecek

                    String hostname = "localhost";
                    String sqlInstanceName = "LAPTOP-KT3GSJ4P"; // Bilgisayar adı
                    String sqlDatabase = "martekstaj";  // SQL Server veritabani adi
                    String sqlUser = "sa";
                    String sqlPassword = "sasa"; // sa hesabinin parolasi

                    String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                            + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

                    // Baglantiyi ac
                    try ( Connection conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword)) {

                        // SQL sorgusu olustur
                        String sql = "INSERT INTO agTaramaSQL (HostAddress, HostName) VALUES (?, ?)";

                        try ( PreparedStatement preparedStatement = conn.prepareStatement(sql)) {

                            // SQL sorgusunun parametreleri
                            preparedStatement.setString(1, host.getHostAddress()); // veri tabanina hostAddress'i iletir
                            preparedStatement.setString(2, host.getHostName()); // veri tabanina hostName'i iletir

                            // SQL sorgusu INSERT olmasindan dolayi executeUpdate()  
                            int resultSet = preparedStatement.executeUpdate(); // SQL sorgusunu calistir sonuc al

                            if (resultSet > 0) { // veri tabanina en az 1 veri eklendiyse
                                //System.out.println("veri tabanina basariyla eklendi");
                            } else {
                                //System.out.println("veri tabanina eklenmedi");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                } else {
                    //System.out.println("erisilemez: " + host.getHostAddress());
                }

            } catch (IOException ignored) {

            }

        }
    }

}
