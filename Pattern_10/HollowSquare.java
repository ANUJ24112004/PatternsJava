public class HollowSquare {

    public static void printLine(int size, int current) {
        if (current == 0) return;
        if (current == 1 || current == size) {
            printStars(size);
        } else {
            System.out.print("*");
            printSpaces(size - 2);
            System.out.print("*");
        }
        System.out.println();
        printLine(size, current - 1);
    }

    public static void printStars(int count) {
        if (count == 0) return;
        System.out.print("*");
        printStars(count - 1);
    }

    public static void printSpaces(int count) {
        if (count == 0) return;
        System.out.print(" ");
        printSpaces(count - 1);
    }

    public static void main(String[] args) {
        int size = 5;
        printLine(size, size);
    }
}
