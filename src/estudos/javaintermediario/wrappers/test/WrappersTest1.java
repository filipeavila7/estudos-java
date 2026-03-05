package src.estudos.javaintermediario.wrappers.test;

// Wrappers são classes que representam tipos primitivos como objetos.

public class WrappersTest1 {
    public static void main(String[] args) {
        // todos os tipos primitivos que temos
        byte bytep = 1;
        short shortp = 1;
        int intp = 1;
        long longp = 1;
        float floatp = 1;
        double doublep = 1;
        char charp = 1;
        boolean booleanp = true;

        // wrappers --> autoboxing
        Byte bytew = 1;
        Short shortw = 1;
        Integer intw = 1;
        Long longw = 1L;
        Float floatw = 1F;
        Double doublew = 1D;
        Character charw = 'W';
        Boolean booleanw = true;



        int i = intw; // umboxing ir de wrapper para um tipo primitivo

        Integer intw2 = Integer.parseInt("1");
        Boolean truew = Boolean.parseBoolean("True");

        System.out.println(truew);

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isUpperCase('A'));
    }
}
