-src dosyasının içinde .java uzantılı dosyalar , sql dosyasının içinde .sql uzantılı bulunmaktadır. 


-login.java ve yoneticiIslemleri.java uzantılı dosyalar jFrame yani gui arayüzünün bağlanmasını içermektedir.


-login class'ında kullanıcı adı ve şifreyi veri tabanındaki verilerle eşleşenlerin girmesine izin verildi.


-yoneticiIslemleri class'ında cihazımızın IP adresini taradık. Daha sonra ağa bağlı cihazları önce veritabanına yazdırıp ordan Ağa Bağlı Cihazlar tablosuna yansıttık. Sıfırla ve ekle butonları da aynı şekilde hem veri tabanına yazdırdı hem tabloya. Ping Atanacak IP butonuyla da girilen IP adresine erişilemediği vakit maile bildirim düştü.


-agTaramasi, agTaramasiIslemler class'ında thread oluşturuldu. 0-9 aralığında 10 thread oluşturduk ve birler basamağına göre ağ taramasını gerçekleştirdik.
