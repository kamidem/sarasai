
package sarasai;


public class Klaida extends RuntimeException {

    public Klaida() {
    }

    public Klaida(String message) {
        super(message);
    }

    public Klaida(String message, Throwable cause) {
        super(message, cause);
    }

    public Klaida(Throwable cause) {
        super(cause);
    }
    
    
}
