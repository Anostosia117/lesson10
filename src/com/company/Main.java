package com.company;

import lesson10.Author;
import lesson10.Book;

public class Main {

    public static void main(String[] args) {
        Author oldos = new Author("Олдос", "Хаксли");
        Author lacan = new Author("Жак", "Лакан");
        Book newWorld = new Book("О дивный новый мир", oldos , 1931);
        Book psychosis = new Book("Семинар 3. Психозы", lacan, 2014);
        System.out.println(newWorld);
        System.out.println(psychosis);
        System.out.println(newWorld.equals(psychosis));
        System.out.println(psychosis.equals(psychosis));
        System.out.println(oldos.equals(lacan));
        System.out.println(oldos.equals(oldos));
        System.out.println(oldos.hashCode());
        System.out.println(lacan.equals(oldos));
        System.out.println(lacan.equals(lacan));
        System.out.println(lacan.hashCode());
        System.out.println(newWorld.hashCode());
        System.out.println(psychosis.hashCode());
    }
}