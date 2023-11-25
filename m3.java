public class m3{
    public static boolean
    isMultiple(long n, long m){
        if (m == 0){

            return false;
        }
        return n % m == 0;
    }
    public static void main(String [] args){
        long n = 12;
        long m = 3;

        boolean  isNMultipleofm = isMultiple(n,m);
        System.out.println("Is" +n );
        System.out.println("multiple of +m");
    }
}


