package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        /* diilerde sayı artıkça istediğimiz değerleri bulmak zorlaşıyor.
        int[] a = new int[5000];

        for (int i = 0; i < a.length; i++){
            if (a[i] == 123){
                //Aranan değer
            }
        }*/

        // Hashset
        // *Boyut vermiyoruz kendi kendine genişliyo

        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(1);
        hSet.add(2);
        hSet.add(3);
        hSet.add(4);
        hSet.add(4);

        for (Integer sayi : hSet){
            System.out.println(sayi);
        }



    }
}