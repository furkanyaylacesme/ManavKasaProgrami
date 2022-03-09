package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        int armutKilo = scanner.nextInt();
        System.out.print("Elma kaç kilo ? : ");
        int elmaKilo = scanner.nextInt();
        System.out.print("Domates kaç kilo ? : ");
        int domatesKilo = scanner.nextInt();
        System.out.print("Muz kaç kilo ? : ");
        int muzKilo = scanner.nextInt();
        System.out.print("Patlıcan kaç kilo ? : ");
        int patlicanKilo = scanner.nextInt();

        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);
        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}
