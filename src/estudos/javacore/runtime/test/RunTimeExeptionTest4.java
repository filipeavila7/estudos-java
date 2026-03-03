package src.estudos.javacore.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExeptionTest4 {
    public static void main(String[] args) {
        // capturando multiplas execôes
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch(IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        } catch(IllegalArgumentException e){
            System.out.println("dentro do IllegalArgumentException");
        } catch(ArithmeticException e){
            System.out.println("dentro do ArithmeticException ");
        } catch(RuntimeException e){
            System.out.println("dentro da RuntimeException "); // mais generico por ultimo para não explodir, pois ambas as exemption são filhas de runtime
        }

        try { // obrigado a tratar caso use o metodo
            talvezLanceExepetion();
        } catch (SQLException | FileNotFoundException e) { // pegar 2 execoes na msm linha 
            
        } 
    }


    private static void talvezLanceExepetion() throws SQLException, FileNotFoundException{ // obriga quem chamar o metodo a tratar as exeções pois são do tipo checked

    }
}
