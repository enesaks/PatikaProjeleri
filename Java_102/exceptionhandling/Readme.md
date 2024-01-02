# Hata Yönetimi (Exception Handling)

**Kodalar** [Main.java](https://github.com/enesaks/PatikaProjeleri/blob/main/Java_102/exceptionhandling/src/main/java/com/example/exceptionhandl/Main.java)


**İstisna Durum Nedir? (Exception)**

İstisna durum, İngilizce exception diye ifade edilir. Programın normal akışını beklenmeyen şekilde hatalı şekilde kesen durumlara karşılık gelir. 

**Unchecked Exceptions** : Programın derlenmesi sırasında bilinemeyen ancak program çalıştığı esnada ortaya çıkan hata tiplerdir.

**Checked Exceptions** : Derleme aşamasında tespit edilen hatalardır.Bu hataların alınabileceği önceden bilinir.

**Throwable** : Exception hiyerarşinin en üstündeki sınıftır. 

**Error** : Programdaki ciddi hatalı temsil eder. JVM tarafından iletilen uygulama dışında oluşan hatalardır. Bu tip hatalar da "Unchecked Exceptions" tipindedir.

**Exception** : Kullanıcı tanımlı Exception sınıfları dahil olmak üzere tüm Exception alt sınıflarının ATA sınıfıdır. "RuntimeException" dışındaki tüm Exception hataları "Checked Exceptions" tipindedir. 

**RuntimeException**: Geçersiz ya da hatalı bir işlem sonucunda uygulamada oluşan hatalardır. Bunlar da JVM tarafından fırlatılır. "Unchecked Exceptions" kategorisine girer.

Hata durumlarını yönetmek için **2** yöntem vardır ;

* Try-catch blokları ile hatayı alınacağı tahmin edilen yerde kontrol altına alabiliriz veya
* Hatayı throws anahtar kelimesi ile çağrıldığı bir üst noktaya fırlatarak, çözümün orada yapılmasını zorunlu hale getiririz.

**Java’daki Bazı Hata Sınıfları**

* ArithmeticException: Sıfıra bölme başta olmak üzere matematiksel hataları belirtir.
* ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
* ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
* IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
* IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
* NullPointerException: Henüz değer ataması yapılmamış değişkenler üzerinde işlem yapmaya çalışıldığında fırlatılır. Java’da en çok karşılaşılan hatalardan biridir. Bu hataya karşı önlem almak için yaptığımız kontrollere null kontrolü (null-check) denir.
* NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
* UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.
