package b_Zadania_Domowe.a_Dzien_4;

//W pliku `Main1.java` stwórz metodę o sygnaturze `static int count(String fileName)`.
//
//1. Uzupełnij ciało metody tak, aby zliczała i zwracała ilość znaków z pliku.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

// moze org.apache.commons.lang3.StringUtils;
public class Main1 {

    public static void main(String[] args) {
        count("countChars.txt");
    }

    static int count(String fileName){
        Path path = Paths.get("/home/damian/Desktop/Kurs Java Web Developer/" +
                "Java Podstawy/Ćwiczenia/KRA_JEE_W_01_Podstawy/b_Zadania_Domowe/a_Dzien_4/"+fileName);
        StringBuffer sb = new StringBuffer();
        try {
            for(String line : Files.readAllLines(path)){
                sb.append(line);
            }
            String modified = sb.toString().replaceAll("\\s","");
            System.out.println(modified.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
