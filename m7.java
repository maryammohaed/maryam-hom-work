public class m7 {
    public static int sumofintegers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i ++ ) {
            sum += i * i;
        }
        return sum;
    }
    public static void main(String [] args) {
        int num = 8;
        int   result = sumofintegers(num);
        System.out.println("sum of squares: " + result);
    }
    }