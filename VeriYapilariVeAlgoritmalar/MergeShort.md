## 1.Soru
[16,21,11,8,12,22] -> Merge Sort

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

### Çözüm
1.Adım: Diziyi ikiye bölüyoruz.
Sol yarı: [16, 21, 11]     |      Sağ yarı: [8, 12, 22]

2.Adım: Sol ve sağ yarıları ayrı ayrı Merge Sort'a gönderiyoruz.
Sol yarı: [11, 16, 21]     |     Sağ yarı: [8, 12, 22]

3.Adım: İki yarıyı birleştirerek sıralı bir dizi oluşturuyoruz.
Merge: [8, 11, 12, 16, 21, 22]


## 2. Soru
Big-O gösterimini yazınız.
### Çözüm
Big-O Gösterimi: Merge Sort algoritmasının zaman karmaşıklığı O(n log n)'dir
