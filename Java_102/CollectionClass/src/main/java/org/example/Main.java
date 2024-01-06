package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {


//        //diilerde sayı artıkça istediğimiz değerleri bulmak zorlaşıyor.
//        int[] a = new int[5000];
//
//        for (int i = 0; i < a.length; i++){
//            if (a[i] == 123){
//                //Aranan değer
//            }
//        }
//
//        //         **Hashset**
//        // *Boyut vermiyoruz kendi kendine genişliyo
//
//        HashSet<Integer> hSet = new HashSet<>();
//        hSet.add(1);
//        hSet.add(2);
//        hSet.add(3);
//        hSet.add(4);
//        hSet.add(4);
//
//        System.out.println(hSet.isEmpty()); // Boş mu onu kontrol eder.
//        System.out.println(hSet.contains(1)); // içinde yazılan değerin olup olmadıpını döner.
//        hSet.remove(3); // silmek istediğimiz değeri girip sileriz.
//        hSet.clear(); // Tamamını siler.
//
//        for (Integer sayi : hSet){
//            System.out.println(sayi);
//        }
//
//
////        Itertor -> Collection listelerinde gezmeyi sağlar.
//
//        Iterator<Integer>  itr = hSet.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//
//
//        //     **LinledHashSet**
//        // HasSet ten farklı olarak tüm öğeler arasında çift bağlantılı bir liste tutarak sıralı bır hasSet yapısıdır.
//
//        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
//
//        lSet.add(1);
//        lSet.add(2);
//        lSet.add(3);
//        lSet.add(4);
//
//
//        Iterator<Integer> itr = lSet.iterator();
//
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        // TreeSet

        //Burada Notları karşılaştırarak sıralama yapar.
        //TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator().reversed());


        //Burada ise adları karşılaştırarak bir sıralama yapar.
//        TreeSet<Student> students = new TreeSet<>(new orderNameComparator());
//
//
//        students.add(new Student("Zeynep", 100));
//        students.add(new Student("Ahmet", 70));
//        students.add(new Student("Enes", 55));
//        students.add(new Student("Ali", 60));
//
//        for (Student stu : students){
//            System.out.println(stu.getAd());
//        }
//
//
        //AarrayList

        //Hash'lerden farklı olarak hashlendemedn tutulduğu için girdiğimiz sırada basılıyor.
        //Birden fazla aynı değeri tutar.
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(null);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(5);

        Iterator<Integer> itr = arrayList.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        for (Integer sayı : arrayList){
            System.out.println(sayı);
        }

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));

        System.out.println(arrayList.indexOf(2)); //2 değerinin indexini verir

        System.out.println(arrayList.indexOf(3)); //  3 ten birden fazla olduğu için ilk bulunduğu indexi verir.
        System.out.println(arrayList.lastIndexOf(3)); // 3 ün son bulunduğu indexi verir.

        arrayList.add(2, 10); //2. indexe 10 değerini ekler. :)

        System.out.println(arrayList.contains(10)); // 10 değerinin içinde olup olmadığını döner. :)
        arrayList.remove(1); // 1. indexteki elemanı siler.




    }
}