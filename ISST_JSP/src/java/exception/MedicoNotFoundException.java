package exception;

public class MedicoNotFoundException extends Exception {
	private static final long serialVersionUID = 4156679651884326238L;

    public MedicoNotFoundException() {
    }

    public MedicoNotFoundException(String msg) {
        super(msg);
    }
}
