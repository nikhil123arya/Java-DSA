package com.nikhil;

public class Main {

    public static void main(String[] args) {
//        pattern1(4);
        pattern12(4);
//        pattern5(5);
    }

//  Q.12      0 0 0 0 0 0 0 0 0
//            0 1 1 1 1 1 1 1 0
//            0 1 2 2 2 2 2 1 0
//            0 1 2 3 3 3 2 1 0
//            0 1 2 3 4 3 2 1 0
//            0 1 2 3 3 3 2 1 0
//            0 1 2 2 2 2 2 1 0
//            0 1 1 1 1 1 1 1 0
//            0 0 0 0 0 0 0 0 0

    static void pattern12(int n) {
        n= 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex =Math.min(Math.min(row,col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


//    Q.11            1
//                  2 1 2
//                3 2 1 2 3
//              4 3 2 1 2 3 4
//            5 4 3 2 1 2 3 4 5
//              4 3 2 1 2 3 4
//                3 2 1 2 3
//                  2 1 2
//                    1

    static void pattern11(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? 2*n - row: row;
            for (int spaces = 0; spaces < n-c; spaces++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

//    Q.10    E
//            DE
//            CDE
//            BCDE
//            ABCDE

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 65+n-row; col < 65+n ; col++) {
                System.out.print((char)col);
            }
            System.out.println();
        }
    }
//    Q.9     A
//            AB
//            ABC
//            ABCD
//            ABCDE
//            ABCDEF

    static void pattern9(int n) {
        for (int row = 65; row <= 65+n; row++) {
            for (char col = 65; col <= row ; col++) {
                System.out.print((char)col);
            }
            System.out.println();
        }
    }

//    Q.8             1
//                  2 1 2
//                3 2 1 2 3
//              4 3 2 1 2 3 4
//            5 4 3 2 1 2 3 4 5

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
//    Q.7         *
//               * *
//              * * *
//             * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *

    static void pattern7(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRows = row > n ? 2*n - row: row;

            int noOfSpaces = n - totalColInRows;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Q.6             1
//                  2 3 2
//                3 4 5 4 3
//              4 5 6 7 6 5 4
//            5 6 7 8 9 8 7 6 5

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            int d = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(d + " ");
                d++;
            }
            for (int col = d-2; col >= row ; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

//    Q.5     *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *

    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRows = row > n ? 2*n - row: row;
            for (int col = 0; col < totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    Q.4     1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every single row run the col
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                for (col = 1; col <= row; col++) {
                    System.out.print(col + " ");
                }
                //when row is printed, we need to add a new line
                System.out.println();
            }
        }
    }

//    Q.3     * * * * *
//            * * * *
//            * * *
//            * *
//            *

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every single row run the col
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
            //when row is printed, we need to add a new line
            System.out.println();
        }
    }
//    Q.2     *
//            * *
//            * * *
//            * * * *
//            * * * * *

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every single row run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when row is printed, we need to add a new line
            System.out.println();
        }
    }

//    Q.1     * * * * *
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every single row run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            //when row is printed, we need to add a new line
            System.out.println();
        }
    }

}