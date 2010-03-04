/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wdh;

/**
 *
 * @author rhisld
 */
public class EmptyBoxes {

    public static void main(String[] args) {
        int givenType1 = 11;
        int givenType2 = 8;
        int givenType3 = 8;
        int givenIterations = 2;
        int desiredEmptyBoxes = 102;
        int currentEmptyBoxes = 0;
        int totalBoxes = givenType1;

        // Try counting up through the number of type1 boxes
        for (int t1 = 1; t1 <= givenType1; t1++) {
            currentEmptyBoxes = givenType1 - t1;
            // If we have already blown the desired number of empty boxes
            if (currentEmptyBoxes > desiredEmptyBoxes) {
                break;
            }

            for (int t2 = 1; t2 <= givenType1; t2++) {
            }


        }
        System.out.println("");
        System.out.println("test");
    }
}
