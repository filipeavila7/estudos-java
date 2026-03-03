package src.estudos.javacore.runtime.dominio;

// criar exceção personalizada
// herda de exception
public class LoginInvalidoException extends Exception {

    // sobrecarregar o construtor, caso não tenha mensagem ele usa uma padrao, mas vc pode criar a sua pois esta sobrecarregado
    public LoginInvalidoException() {
        super("login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    } 
    
}
