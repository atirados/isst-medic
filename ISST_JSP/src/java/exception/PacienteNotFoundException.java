package exception;

public class PacienteNotFoundException extends Exception {

	private static final long serialVersionUID = 4156679691884326238L;

    public PacienteNotFoundException() {
    }

    public PacienteNotFoundException(String msg) {
        super(msg);
    }
}