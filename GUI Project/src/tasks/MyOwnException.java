package tasks;

public class MyOwnException extends Exception {
    public MyOwnException () {

    }

    public MyOwnException (String message) {
        super (message);
    }

    public MyOwnException (Throwable cause) {
        super (cause);
    }

    public MyOwnException (String message, Throwable cause) {
        super (message, cause);
    }
    
    public static void main(String[] arg) throws MyOwnException {
    	throw new MyOwnException("Exception");
    }
}

