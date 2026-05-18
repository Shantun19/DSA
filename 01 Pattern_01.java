/*

*****
*****
*****
*****
*****

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        printPatterns(rows , cols);
    }
    
    public static void printPatterns(int rows , int cols) {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
