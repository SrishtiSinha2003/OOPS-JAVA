public class StarPattern{
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7) {
                printStars(1); 
            } else if (i == 4) {
                printStars(3); 
            } else if (i == 6) {
                printStars(5); 
            } else if (i == 8) {
                printStars(7); 
            }
        }
    }
    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}