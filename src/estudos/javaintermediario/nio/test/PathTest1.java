package src.estudos.javaintermediario.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest1 {
    public static void main(String[] args) {
    Path p1 =  Paths.get("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\pasta");
    Path p2 =  Paths.get("C:\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo", "teste.py");
    Path p3 =  Paths.get("C:", "\\Users\\shipin dovu\\Documents\\teste\\src\\estudos\\arquivo\\pasta");
    Path p4 =  Paths.get("C:", "Users", "shipin dovu", "Documents", "teste", " src","estudos", "arquivo", "pasta");
    System.out.println(p1.getFileName());
    System.out.println(p2.getFileName());
    System.out.println(p3.getFileName());
    System.out.println(p4.getFileName());
    }

    
}
