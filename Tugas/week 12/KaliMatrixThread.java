public class KaliMatrixThread extends Thread {
    // show time lapse
    

    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] matrixC;
    private int row;
    private int col;

    public KaliMatrixThread(int[][] matrixA, int[][] matrixB, int[][] matrixC, int row, int col) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.matrixC = matrixC;
        this.row = row;
        this.col = col;
    }

    @Override
    public void run() {
        for (int k = 0; k < 100; k++) {
            matrixC[row][col] += matrixA[row][k] * matrixB[k][col];
        }
    }

    public int[][] getMatrixC() {
        return matrixC;
    }

    public void setMatrixC(int[][] matrixC) {
        this.matrixC = matrixC;
    }

    public int[][] getMatrixA() {
        return matrixA;
    }

    public void setMatrixA(int[][] matrixA) {
        this.matrixA = matrixA;
    }

    public int[][] getMatrixB() {
        return matrixB;
    }

    public void setMatrixB(int[][] matrixB) {
        this.matrixB = matrixB;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public static void main(String[] args) {
        //multiply matrix with thread
        long startTime = System.currentTimeMillis();
        int[][] matrixA = new int[100][100];
        int[][] matrixB = new int[100][100];
        int[][] matrixC = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
                matrixB[i][j] = (int) (Math.random() * 10);
            }
        }
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
        
        //create thread
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                threads[i] = new KaliMatrixThread(matrixA, matrixB, matrixC, i, j);
            }
        }

        //start thread
        for (int i = 0; i < 100; i++) {
            threads[i].start();
        }

        //print matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }

        //show time lapse
        long endTime = System.currentTimeMillis();
        long timeLapse = endTime - startTime;
        System.out.println("Time Lapse: " + timeLapse + " ms");
        //show memory usage
        System.out.println("Memory Usage: "
                + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024 + " MB");
        // show how many threads are running
        System.out.println("Running Threads: " + Thread.activeCount());
    }
}
