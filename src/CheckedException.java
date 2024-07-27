public class CheckedException extends Exception {

    public void myCheckedException(int a, int b) {
        throw CheckedException ();
            if (a > b) {
                throw new CheckedException("Fist number is more than secon  number.");}
        try {
           myCheckedException(a, b);
        }
        catch (CheckedException e) {
            System.out.println("Exception");
        }
    }
}