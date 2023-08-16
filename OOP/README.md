Hayvanat Bahçesi Ödevi

![Hayvanat Bahçesi Diagramı](https://github.com/enesaks/PatikaProjeleri/blob/main/OOP/HayvanatBahcesiOdevi/HayvanatBah%C3%A7esiDiagram%C4%B1.png)

Bir hayvanat bahçesindeki hayvanlar hakkındaki bilgileri takip etmek için bir sistem tasarlıyorsunuz.

Hayvanlar:
Atlar (atlar, zebralar, eşekler vb.),
Kedigiller (kaplanlar, aslanlar vb.),
Kemirgenler (sıçanlar, kunduzlar vb.) gibi gruplardaki türlerle karakterize edilir.
Hayvanlar hakkında depolanan bilgilerin çoğu tüm gruplamalar için aynıdır.
tür adı, ağırlığı, yaşı vb.
Sistem ayrıca her hayvan için belirli ilaçların dozajını alabilmeli => getDosage ()
Sistem Yem verme zamanlarını hesaplayabilmelidir => getFeedSchedule ()
Sistemin bu işlevleri yerine getirme mantığı, her gruplama için farklı olacaktır. Örneğin, atlar için yem verme algoritması farklı olup, kaplanlar için farklı olacaktır.

Polimorfizm modelini kullanarak, yukarıda açıklanan durumu ele almak için bir sınıf diyagramı tasarlayın.

Uçuş Yönetim Sistemi Ödevi

![Uçüş Yönetim Sistemi](https://github.com/enesaks/PatikaProjeleri/blob/main/OOP/U%C3%A7%C3%BC%C5%9FY%C3%B6netimSistemiOdev/U%C3%A7u%C5%9FY%C3%B6netimSistemi.png)

Uçuşların ve pilotların yönetimi için bir sistem tasarlayın.

Hava yolu şirketleri uçuşları gerçekleştirir. Her hava yolunun bir kimliği vardır.
Hava yolu şirketi, farklı tipteki uçaklara sahiptir.
Uçaklar çalışır veya onarım durumunda olabilir.
Her uçuşun benzersiz kimliği, kalkacağı ve ineceği havaalanı, kalkış ve iniş saatleri vardır.
Her uçuşun bir pilotu ve yardımcı pilotu vardır ve uçağı kullanırlar.
Havaalanlarının benzersiz kimlikleri ve isimleri vardır.
Hava yolu şirketlerinin pilotları vardır ve her pilotun bir deneyim seviyesi mevcuttur.
Bir uçak tipi, belirli sayıda pilota ihtiyaç duyabilir.
Bu sistemi tasvir eden Class(Sınıf) diyagramını çiziniz

Online Film Sistemi Ödevi

![Online Film Sistemi](https://github.com/enesaks/PatikaProjeleri/blob/main/OOP/OnlineFilmSistemiOdev/OnlineFilmSistemi.png)

Online film satan veya kiralayan uygulamanın sistemini tasarlayın.

Uygulamada filmler listelenebilir, sıralanabilir ve kullanıcılar uygulamaya abone olabilir.
Kullanıcılar abonelik için sistem üzerinden kredi satın alır.
Sadece abone olan kullanıcılar, kredileri ile film kiralayabilir ve kiraladığı filmin kredi bedeli kadar hesabından düşülür.
Normal kullanıcılar ve aboneler film satın alabilirler.
Eğer film mevcut değil ise talep edilebilir.
Bu sistemi tasvir eden Class(Sınıf) diyagramını çiziniz.
