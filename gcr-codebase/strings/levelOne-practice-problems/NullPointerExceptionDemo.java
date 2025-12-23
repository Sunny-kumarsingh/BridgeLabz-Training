

public class NullPointerExceptionDemo {

    // NullPointerException
    public static void generateException() {
        String text = null;  
        System.out.println(text.length()); 
    }

    // NullPointerException handleException
    public static void handleException() {
        String text = null;

        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {

        //  generates exception
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Program stopped due to Runtime Exception");
        }

        //handles exception
        handleException();
    }
}
