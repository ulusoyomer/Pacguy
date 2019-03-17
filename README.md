# Pacguy
Simple Game like PACMAN. Coding is Java
## Geliştirilme Ortamı
Java Geliştirme Ortamı Bulunan **NetBeans** ile yazıldı.<br>
![NetBeans Resmi](https://github.com/ulusoyomer/Pacguy/blob/master/Readmeimg/NetBeans.png)
<br>
### Kullanılan Kütüphaneler
JAVA dilinde bulunan ve grafiksel kullanıcı ara yüzü geliştirmekte kullanılan **SWING** kütüphanesi ve Java Programlama dilinin, 
platformdan bağımsız, görsel kullanıcı arayüzü üretimini sağlayan araç kütüphanesi olan **AWT**
Kullanıldı

#### Giriş Ekranı
![Giriş Ekranı](https://github.com/ulusoyomer/Pacguy/blob/master/Readmeimg/girisekrani.PNG)<br>
Karşımıza gelene ekranda giriş müziğimiz çalmaya başlar ve görsellik katmak amacı ile karakterimiz ve hayaletlerimiz sonsuz bir döngü ile
sag ve sola gitmeye başlar
#### Oyun Modları
2 Tane farklı harita olmak üzere 3 tane zorluk seçeneğimiz bulunmaktadır. Easy Medium Hard ilk haritamızın zorluk seçenekleridir. Seçilen
zorluğa göre hayaletlerimizin hareket hızı artmaktadır.<br>
2. Harita butonuna tıklanırsa 2. haritamız ekrana gelicektir.
#### İlk Haritamız
![İlk Harita](https://github.com/ulusoyomer/Pacguy/blob/master/Readmeimg/ilkharita.PNG)<br>
Oyunumuzun amacı yeşil renkteki yemlerin üzerinden geçerek hayaletlere yakalanmadan bütün yemleri bitirmektir.Yem yedikçe puanımız *1* artar
fakat hayaletlere yakalanırsak 2 saniye bekleyip ilk doğduğumuz yere ışınlanırız.
<br>
**Oyun Bitiş Ekranı** <br>
![Can Biterse](https://github.com/ulusoyomer/Pacguy/blob/master/Readmeimg/ilkharitaolum.PNG)<br>
**Can Barımız ve Skrumuz**<br>
![Can Barımız ve Skorumuz](https://github.com/ulusoyomer/Pacguy/blob/master/Readmeimg/Can.PNG)<br>
Canımız azaldıkça solda gözüken karakterimizin resmi azlır ve ortadaki sayımızda azalır. Eğer hayaletlere yakalanırsak puanımızdan 10 puan
çıkarılır.<br>
#### İkinci Haritamız
![İkinci Haritamız](https://github.com/ulusoyomer/Pacguy/blob/master/Readmeimg/ikinciharita.PNG)<br>
![İkinci Haritamız](https://github.com/ulusoyomer/Pacguy/blob/master/Readmeimg/ikinciharita2.PNG)<br>
Bu haritamızdada ilk haritadaki bütün kurallar geçerli olup labirent sistemi ile oynanılır.Labirent sistemi karakterimiz yol ayrımlarına
gelmedikçe iki farklı yöne gidebilmektedir.<br>
Sol ve Sag tarftaki açıklıklar ise klasik **PACMAN** oyununda olduğu gibi bizi sol açıklığa ışınlamak veya sol açıklığa ışınlamak içindir.
<br>**Her iki haritamızdada yem yedikçe ve öldükçe müzik çalmaya başlar.**<br>
**Her iki haritamızdaki hayaletler rastgele hareket etmektedir.**
