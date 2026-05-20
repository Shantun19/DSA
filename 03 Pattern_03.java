/*

*****
****
***
**
*

*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        printPattern02(5 , 5);
    }
    
    public static void printPattern02(int row , int cols) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                if(j <= (cols-1)-i) System.out.print("*");
            }
            System.out.println();
        }
    }
}
