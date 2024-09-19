package com.praktikum;

public class DemoKonversiSuhu {

    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        System.out.println("Hasil Konversi Suhu dari 30 Celcius ke Fahrenheit adalah: " + konversi.celciusToFarenheit(30));
        System.out.println("Hasil Konversi Suhu dari 30 Celcius ke Reamur adalah: " + konversi.celciusToReamur(30));
        System.out.println("Hasil Konversi Suhu dari 30 Fahrenheit ke Reamur adalah: " + konversi.fahrenheitToReamur(30));
    }
}