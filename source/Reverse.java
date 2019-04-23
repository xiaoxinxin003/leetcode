import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

class Reverse {
    
    public static void main(String[] args) {
        int num = 1534236469;
        // reverse(num);
        print("Reverse num " + num + " is :" + reverseNum(num));
    }

    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
    Example 1:
    Input: 123
    Output: 321

    Example 2:
    Input: -123
    Output: -321
    
    Example 3:
    Input: 120
    Output: 21
     * @param args
     */
    private static int reverseNum(int input) {
        return printNumOneByOne(input);
    }

    private static int printNumOneByOne(int input) {
        int symbol = input > 0?1:-1;
        input = symbol *input;
        int reversed = 0;
        int temp;
        if (input > Integer.MAX_VALUE/2) return reversed;
        while (input > 0) {
            reversed *= 10;
            temp = input % 10;
            reversed += temp;
            input = input / 10;
        }
        return symbol * reversed;
    }

    private static void print(String str) {
        System.out.print(str + "\n");
    }

    private static void reverse(int input) {
        int reversed = 0;
        int temp;
        while (input > 0) {
            reversed *= 10;
            temp = input % 10;
            print("temp == " + temp);
            reversed += temp;
            print("reversed == " + reversed);
            input = input / 10;
            print("input == " + input);
        }
    }
}