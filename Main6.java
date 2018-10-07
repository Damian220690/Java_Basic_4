package b_Zadania_Domowe.a_Dzien_4;

//W pliku `Main6.java` stwórz metodę o sygnaturze `static boolean checkFileExist()`.
//
//1. Uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku.
//2. Sprawdzi czy plik istnieje a następnie wypisze `true` lub `false`

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        System.out.println(checkFileExist());
    }

    static boolean checkFileExist(){
        System.out.println("Please enter file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        Path path = Paths.get("/home/damian/Desktop/Kurs Java Web Developer/" +
                "Java Podstawy/Ćwiczenia/KRA_JEE_W_01_Podstawy/b_Zadania_Domowe/a_Dzien_4/"+fileName);

        boolean condition = Files.exists(path);
        return condition;
    }

}
