# Insetion Sort
## 1.Soru
[22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
## Çözüm
### Insertion Sort, bir dizi içindeki elemanları küçükten büyüğe (veya büyükten küçüğe) sıralayan bir sıralama algoritmasıdır. Aşamalarını sırasıyla yazalım:

Verilen dizi: [22, 27, 16, 2, 18, 6]
1.Adım: [22, 27, 16, 2, 18, 6] (İlk eleman sıralanmış kabul edilir.)
2.Adım: [22, 27, 16, 2, 18, 6] (1. eleman, 0. elemandan'dan büyük olduğu için yer değiştirilir.)
3.Adım: [16, 22, 27, 2, 18, 6] (16, sağ tarafında kalan elemanlarla kıyaslanır küçükse sağ tarafa geçer.)
4.Adım: [2, 16, 22, 27, 18, 6] (2, 16'dan küçük olduğu için 16 ile yer değiştirir. 2, 22'den küçük olduğu için 22 ile de yer değiştirir. 2, 27'den de küçük olduğu için 27 ile yer değiştirir.)
5.Adım: [2, 18, 16, 22, 27, 6] (18, sırasıyla sağındaki elemanlarla kıyaslanır küçükse sağa geçer değilse bulunduğu konumda kalır.)
6.Adım: [2, 18, 6, 16, 22, 27] (6, ya da yukarıdaki yer değiştirme işlemleri uygulanır.)

Sıralanmış dizi: [2, 6, 16, 18, 22, 27]

## 2.Soru
Big-O gösterimini yazınız.
## Çözüm
Big-O Gösterimi: N elemanlı bir diziyi sıralamak için ortalama olarak O(n^2) adım atılır.

## 3.Soru
Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız
1. Average case: Aradığımız sayının ortada olması
2. Worst case: Aradığımız sayının sonda olması
3. Best case: Aradığımız sayının dizinin en başında olması.

## Çözüm
18 sayısı dizinin 3. elemanı olduğu için Average Case ile arama yapmak bu sayı için daha avantajlıdır.
