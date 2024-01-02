package com.example.exceptionhandl;

public class AgeCheckException extends Exception{

    public AgeCheckException(String message){
        super(message);
        System.out.println("Yaş hatası alındı !");
    }

    @Override
    public String toString(){
        return "AgeCheck Sınıfına ait exceptiondır ! ";
    }

}
