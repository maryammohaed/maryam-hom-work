import java.security.KeyStore;

public class m4 {
    public static void GameEntry(String[] args) {
        int number = 6;
        System.out.println(isEven(number));
    }

    public static boolean isEven(int i) {

        if ((i & 1) == 0) {
            return true;
        }else {
            return false;
        }
    }
}