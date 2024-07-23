
public class UncheckedException extends RuntimeException {

    public int myUncheckedException(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum = +i;
        }
        return sum;

            if (sum > 10000) {
                try {
                    myUncheckedException();
                } catch
                (UncheckedException e) {
                    e.printStackTrace();
                }
                }}}


