import com.sun.jdi.FloatValue;

import java.util.Scanner;

public class m1 {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }
    public static void inputAllBaseTypes() {
        Scanner Scanner = new Scanner(System.in);

        //input differnt base types
        System.out.print("Enter an integer: ");
        int intvalue = Scanner.nextInt();

                System.out.print("Enter a floating -point number: ");
                float floatvalue = Scanner.nextFloat();

                System.out.print("Enter a double-precision number:");

                double doublevalue = Scanner.nextDouble();

                System.out.print("Enter character: ");
                char charvalue = Scanner.next().charAt(0);

                System.out.print("Enter boolean value (true,false): ");
                boolean booleanvalue = Scanner.nextBoolean();
                System.out.println("Entered values");
                System.out.println("Integer: " + intvalue);
                System.out.println("Float: " + floatvalue);
                System.out.println("Double: "+ doublevalue);
               System.out.println("Character: " + charvalue);
              System.out.println("Boolean: " + booleanvalue);
        Scanner.close();
}
}
