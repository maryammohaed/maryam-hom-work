public class m6 {
    public static int
    sumofintegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {

            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 11;
        int sum = sumofintegers(n);
        System.out.println("sum of positive integers less than or equal to" + n + "is:" + sum);
    }
}