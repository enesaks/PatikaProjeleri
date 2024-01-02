package com.example.exceptionhandl;

import java.util.InputMismatchException;
import java.util.Scanner;;

public class Main {    
    public static void main(String[] args) throws Exception {
        System.err.println("Program Başladı");
        
        //Unchaked Exeptions ; Programın derlenmesi sırasında bulunamayan fakat çalıştığında tespit edilen hatalardır.

        Scanner input = new Scanner(System.in);
        System.out.println("A Sayısını Giriniz : ");

        //int a = input.nextInt();

        int a = 2,b = 10;

        if(a == 0){
            System.out.println("Bir Sayı sıfıra Bölünmez !!");
        }
        System.out.println(b / a);

        System.err.println("Program bitti.");


        connectTCMB();


        // TRY / CATH  (Hata Yakalama) 

        try{
            int x = 10, y = 0;

            y = input.nextInt();
            System.out.println(x / y); 
            System.out.println("Bölme işlemi bitti");

        }/*catch(Exception e){
            System.out.println("Hata Yakalandı !!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }*/
        // burda oluşan hataya göre catch blokları bu hataları yakalayarak o işlemin yyapılmasını sağlıyo.
        catch(ArithmeticException e){
            System.out.println("Aritmetik hata alındı!");
        }
        catch(InputMismatchException e){
            System.out.println("Yanlış veri girildi.");
        }finally {// Ne hata alırsan al bu bloğu çalıştır.
            System.out.println("Bu kısım kesinlikle çalışıcak");
        }


        //THROW Hata fırlatma...
        System.out.println("Yaşınızı giriniz.");
        int age = input.nextInt();
        checkAge(age);



    }
    public static void connectTCMB(){
        //...
        System.out.println("Merkez bankası kurlarına erişiliyor.");
    }

    public static void checkAge(int age) throws AgeCheckException {//Exeption  kullanmak için.
        if (age < 18){
            //throw new ArithmeticException("Yaşınız Tutmuyor");
            //throw new Exception("Yaşnız Tutmuyor");
            throw new AgeCheckException("Hata yakalandı");
        }
        System.out.println("yaşı Uygundur...");
    }


}