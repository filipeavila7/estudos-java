package src.estudos.javacore.runtime.test;

import java.util.Scanner;


import src.estudos.javacore.runtime.dominio.LoginInvalidoException;

public class LoginIvalidoExceptionTest1 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "shipin";
        String senhaDB = "1234";

        System.out.print("usuario: ");
        String userLIdo = teclado.nextLine();
        System.out.print("senha: ");
        String senhaLido = teclado.nextLine();

        if(!usernameDB.equals(userLIdo) || !senhaDB.equals(senhaLido)){
            // mensagem personalizada, basta colocar dentro do construtor
            throw new LoginInvalidoException("login invalido burrão");
        }

        System.out.println("usuario logado com sucesso");
    }
}
