public class Main {

    public static void main(String[] args) {
        printTheGrid();
    }


    public static class sudokuGrid {
        static int userGrid[][] = new int[][] { // [horizontal][vertical]
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        static int experimentGrid[][] = new int[9][9];
        //static String posibilitiesGrid[][] = new String[9][9];
        printTheGrid(experimentGrid);
    }


    public static void printTheGrid(int[][] blah) { // "blah" can be called anything
        System.out.println(" "); // Creates some room at the top
        for (int i = 0; i < 9; i++) { // How many rows
            for (int j = 0; j < 9; j++) { // How many numbers per row
                System.out.print(blah[i][j] + " ");
            }
            System.out.println("*"); // Returns after each row is printed
        }
    }

    public static boolean isItValid(int x, int y, int[][] bleep) {
        String temp = " ";
        for(int i = 0; i < 9; i++) {
            temp += bleep[i][y]; // horizontal
        }
        return true;
    }
}
