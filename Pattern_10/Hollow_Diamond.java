public class Hollow_Diamond {

    
    public static void upperPart(int n, int i) {
        if (i > n) return;

        
        printSpaces(n - i);
        
        if (i == 1) {
            System.out.print("*");
        } else {
            System.out.print("*");
            printSpaces(2 * (i - 1) - 1);
            System.out.print("*");
        }
        System.out.println();

        
        upperPart(n, i + 1);
    }

    
    public static void lowerPart(int n, int i) {
        if (i <= 0) return;

        
        printSpaces(n - i);
        
        if (i == 1) {
            System.out.print("*");
        } else {
            System.out.print("*");
            printSpaces(2 * (i - 1) - 1);
            System.out.print("*");
        }
        System.out.println();

        
        lowerPart(n, i - 1);
    }

    
    public static void printSpaces(int n) {
        if (n == 0) return;
        System.out.print(" ");
        printSpaces(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Size of the diamond
        upperPart(n, 1);  // Print upper part
        lowerPart(n - 1, n - 1);  // Print lower part
    }
}
