package martekstaj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sqlLogin {

    private String kullaniciAdi;
    private String sifre;

    public sqlLogin(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }

    public boolean LoginSQL() {
        String hostname = "localhost";
        String sqlInstanceName = "LAPTOP-KT3GSJ4P"; // Bilgisayar adi
        String sqlDatabase = "martekstaj";  // SQL Server veritabani adi
        String sqlUser = "sa";
        String sqlPassword = "sasa"; // sa hesabinin parolasi

        try {
            // JDBC sürücüsünü yükle
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Veritabanina baglanti URL si olusturulur
            String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                    + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase;

            // Bağlanti acilir
            try ( Connection conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword)) {
                // SQL sorgusu 
                String sql = "SELECT * FROM login WHERE kullaniciAdi = ? AND sifre = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, kullaniciAdi); // veri tabanina kayitli 1. parametre alinir
                preparedStatement.setString(2, sifre);  // veri tabanina kayitli 2. parametre alinir

                // Sorguyu calistir ve sonucu al
                // executeQuery() veri cekmede  kullanilir
                try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                    // ilk satir kontrol edilir
                    if (resultSet.next()) {
                        return true; // kullanici adi ve sifre eslesir ise
                    } else {
                        //System.out.println("Kullanıcı Adı veya Şifre Hatalı.");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
