import java.util.Scanner;

public class unlimitedDiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend (integer): ");
        int divi = scanner.nextInt();
        System.out.print("Enter the divisor (integer): ");
        int div = scanner.nextInt();
        System.out.print("Enter the number of decimal places: ");
        int dpc = scanner.nextInt();
        String res = decdiv(divi, div, dpc);
        System.out.println("Result: " + res);
    }

    static String decdiv(int divi, int div, int dp) {
        if (divi == 0) {
            return "Division by zero is not allowed.";
        }
        int intp = div / divi;
        int rem = div % divi;
        StringBuilder res = new StringBuilder();
        res.append(intp);
        if (dp > 0) {
            res.append(".");
            for (int i = 0; i < dp; i++) {
                rem *= 10;
                int dD = rem / divi;
                res.append(dD);
                rem %= divi;
            }
        }
        return res.toString();
    }
}