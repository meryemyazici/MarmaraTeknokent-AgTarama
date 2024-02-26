Bu projenin amacı, Java programlama dili kullanılarak bir ağ güvenlik uygulaması geliştirmektir. Proje, kullanıcıların güvenli bir şekilde sisteme giriş yapabilmelerini sağlayan bir kullanıcı doğrulama sistemi ile başlar. Ardından, ağdaki cihazları yönetebilen ve izleyebilen bir yönetici arayüzü sunar. Bu arayüz, ağdaki cihazların IP adreslerini tarar, yeni cihazları ekler, var olanları veritabanına kaydeder ve kullanıcı arayüzünde gösterir. Ayrıca, belirli bir IP adresine ping atma özelliği ile erişilemeyen cihazları tespit eder ve bu durumu e-posta yoluyla bildirir.

Proje, ağ taraması ve izleme işlevselliğini gerçekleştirmek için çoklu iş parçacığı (thread) yöntemini kullanır. Bu yöntem, ağdaki cihazları hızlı ve etkili bir şekilde tarayarak ağ güvenliğinin sağlanmasına yardımcı olur. Ağ taraması sırasında olası güvenlik açıkları veya erişim sorunları tespit edildiğinde, sistem otomatik olarak bu durumu kullanıcılara bildirir, böylece sorunlara hızlı bir şekilde müdahale edilir ve ağ güvenliği korunur.

Bu proje, ağ güvenliğinin sağlanması ve ağ yönetiminin kolaylaştırılması için önemli bir araç sunar. Kullanıcı dostu arayüzü ve otomatik bildirim özellikleri sayesinde, ağ yöneticileri sorunları hızlı bir şekilde tespit edebilir ve çözebilir, böylece ağın güvenliği ve performansı artırılır.


-src dosyasının içinde .java uzantılı dosyalar , sql dosyasının içinde .sql uzantılı bulunmaktadır. 

-login.java ve yoneticiIslemleri.java uzantılı dosyalar jFrame yani gui arayüzünün bağlanmasını içermektedir.

-login class'ında kullanıcı adı ve şifreyi veri tabanındaki verilerle eşleşenlerin girmesine izin verildi.

-yoneticiIslemleri class'ında cihazımızın IP adresini taradık. Daha sonra ağa bağlı cihazları önce veritabanına yazdırıp ordan Ağa Bağlı Cihazlar tablosuna yansıttık. Sıfırla ve ekle butonları da aynı şekilde hem veri tabanına yazdırdı hem tabloya. Ping Atanacak IP butonuyla da girilen IP adresine erişilemediği vakit maile bildirim düştü.

-agTaramasi, agTaramasiIslemler class'ında thread oluşturuldu. 0-9 aralığında 10 thread oluşturduk ve birler basamağına göre ağ taramasını gerçekleştirdik.
