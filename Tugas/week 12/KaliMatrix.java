public class KaliMatrix{
    public static void main(String[] args) {
        //get time before start
        long startTime = System.currentTimeMillis();

        // create matrix
        int[][] matrixA = new int[100][100];
        int[][] matrixB = new int[100][100];

        //insert values
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
                matrixB[i][j] = (int) (Math.random() * 10);
            }
        }
        
        //print matrix A and B
        System.out.println("Matrix A");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix B");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(matrixB[i][j] + " ");
            }
            System.out.println();
        }
        
        //multiply matrix A and B
        int[][] matrixC = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrixC[i][j] = 0;
                for (int k = 0; k < 100; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        //print matrix
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }

        //get time after finish
        long endTime = System.currentTimeMillis();

        //show time lapse
        System.out.println("Time lapse: " + (endTime - startTime) + " ms");
        //show memory usage
        System.out.println("Memory Usage: "
                + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024 + " MB");
        
        System.out.println("Running Threads: " + Thread.activeCount());
    }
}