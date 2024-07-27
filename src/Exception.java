public class Exception {
    public int myUncheckedException(int sum) {

        if (sum > 10000) {
            try {
                myUncheckedException();
            } catch
            (UncheckedException e) {
                e.printStackTrace();
            }
        }
    }
}
