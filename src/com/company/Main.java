package com.company;

import lesson10.Author;
import lesson10.Book;

public class Main {

    public static void main(String[] args) {
        Author oldos = new Author("Олдос", "Хаксли");
        /*System.out.println(oldos.getFirstName() + " " + oldos.getLastName());*/
        Author lacan = new Author("Жак", "Лакан");
        /*System.out.println(lacan.getFirstName() + " " + lacan.getLastName());*/
        Book newWorld = new Book("О дивный новый мир", oldos , 1931);
        /*System.out.println(newWorld.getNameOfBook() + " " + newWorld.getAuthor().getFirstName() + " "+ newWorld.getAuthor().getLastName() +" "+ newWorld.getYearOfPublishing());*/
        Book psychosis = new Book("Семинар 3. Психозы", lacan, 2014);
   /*     System.out.println(psychosis.getNameOfBook() + " " + psychosis.getAuthor().getFirstName() + " "+ psychosis.getAuthor().getLastName() +" "+ psychosis.getYearOfPublishing());
        newWorld.setYearOfPublishing(1932);
        System.out.println("Ошибка. О дивный новым мир была написана в " + newWorld.getYearOfPublishing() + " году");
        System.out.println(newWorld);*/
        System.out.println(psychosis);
        System.out.println(newWorld.equals(psychosis));
        System.out.println(newWorld.hashCode());
        System.out.println(psychosis.hashCode());
    }

}