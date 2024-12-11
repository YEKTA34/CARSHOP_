# CARSHOP
 
Özet
CarShop uygulaması, kullanıcıların araçları listeleyebileceği, detaylarını inceleyebileceği ve seçtikleri araçları sepete ekleyebileceği bir mobil uygulamadır. Uygulama, kullanıcı dostu bir arayüzle araç bilgilerini sunar ve araçların toplam fiyatını hesaplayarak bir alışveriş deneyimi sunar. Android platformu için geliştirilmiş bu uygulama, LiveData, ViewModel, RecyclerView, ve Navigation Component gibi modern Android teknolojilerini kullanır.
Giriş
Araç alışverişi, online alışveriş platformlarında hızla büyüyen bir alan olmuştur. Kullanıcıların araç detaylarına erişebileceği ve ihtiyaç duydukları araçları sepete ekleyip satın alma sürecine yönlendirebileceği bir mobil uygulama geliştirilmiştir. Bu proje, araç bilgilerini kullanıcıya sunmayı, kullanıcıların sepetlerini yönetebilmelerini sağlamayı ve modern Android geliştirme yöntemlerini uygulamayı amaçlamaktadır.
Uygulama, basit bir araç alışverişi simülasyonu sunar ve kullanıcı etkileşimlerini kolaylaştırmak için akıllı veri yönetim tekniklerinden yararlanır.
Yöntem
Kullanılan Teknolojiler:
 Programlama Dili: Kotlin
 UI: XML Layout + ViewBinding
 State Management: LiveData ve ViewModel
 Veri Yönetimi: Room Veritabanı
 Navigasyon: Navigation Component
 RecyclerView: Listeleme için kullanılmıştır.
Uygulama Akışı:
1. FeedFragment:
a. Kullanıcı, listelenen araçları görür.
b. Bir araca tıklayarak detay ekranına gider.
2. AracDetayFragment:
a. Araç bilgileri gösterilir.
b. Kullanıcı "Sepete Ekle" butonuna basarak aracı sepete ekler.
3. SepetFragment:
a. Kullanıcı, sepete eklenen araçları ve toplam fiyatı görür.
Deneysel Sonuçlar
Görseller:
1. FeedFragment:
a. Araç listesi RecyclerView ile düzgün şekilde gösterilmiştir.
b. Kullanıcılar bir araca tıkladığında detay ekranına başarıyla yönlendirilmiştir.
2. AracDetayFragment:
a. Araç bilgileri eksiksiz olarak gösterilmiştir.
b. "Sepete Ekle" butonu ile seçilen araç başarıyla sepete eklenmiştir.
3. SepetFragment:
a. Sepete eklenen araçlar listelenmiş ve toplam fiyat doğru şekilde hesaplanmıştır.
Performans:
 Uygulama, canlı veri güncellemeleri ve hızlı geçişler sunmuştur.
 Modern Android yapıları sayesinde hata oranı düşük tutulmuştur.
Sonuç
Bu projede, kullanıcıların araç alışveriş deneyimini kolaylaştıran bir uygulama geliştirilmiştir. Android geliştirme için en iyi uygulama yöntemleri takip edilerek performanslı ve kullanıcı dostu bir deneyim sağlanmıştır. Gelecekte, kullanıcıların araçlar arasında karşılaştırma yapabilmesi ve satın alma işlemlerini simüle edebilmesi gibi yeni özellikler eklenebilir.
Kaynakça
1. Android Developer Documentation: https://developer.android.com
2. Kotlin Programming Language: https://kotlinlang.org
3. Jetpack Components Overview: https://developer.android.com/jetpack
