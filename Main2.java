package b_Zadania_Domowe.a_Dzien_4;

//W pliku `Main2.java` stwórz metodę o sygnaturze `static int count(String fileName)`.
//
//1. Uzupełnij ciało metody tak, aby zliczyła i zwracała ilość słów z pliku.

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        try {
            System.out.println(count("countChars.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static int count(String fileName) throws FileNotFoundException {
        Path path = Paths.get("/home/damian/Desktop/Kurs Java Web Developer/" +
                "Java Podstawy/Ćwiczenia/KRA_JEE_W_01_Podstawy/b_Zadania_Domowe/a_Dzien_4/"+fileName);
        File f = new File(String.valueOf(path));
        int counter = 0;
        Scanner scan = new Scanner(f);
        while(scan.hasNext()){
            System.out.println(scan.next());
            counter++;
        }
        return counter;
    }

}
