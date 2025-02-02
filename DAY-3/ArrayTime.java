public class ArrayTime {
    public static void main(String[] args) {
        int[][] stocks = {
            {10, 100}, 
            {12, 110},
            {14, 120},
            {16, 130}
        };
        
        for (int i = 0; i < stocks.length; i++) {
            System.out.println("Time: " + stocks[i][0] + ", Stock Value: " + stocks[i][1]);
        }
    }
}

