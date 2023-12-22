/**
 * LAB 3 PRACTICAL
 * Name: Lungu David
 * SID: 18122108
 * Instructor: Mr M. Chuibuluma
 * Date: 26.03.2021
 * DICE ROLLING
 * QUESTION 1
 */

import java.util.Random;

public class RollDiceApp {
    public static void main(String[] args) throws Exception {
        //Creating an objet of the Random Class
        Random number = new Random();
        
        //Array Frequency counter
        int[] frequency = new int[11];
        //Sum Array Containing the possible sum of the two dice rolls
        int[] sumArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        //Rollin the two dices 36000000 times and keep track of the random values using a for...loop
        for(int counter = 1; counter <= 36000000; counter++){
            //Initializing dice variables
            int dice1 = number.nextInt(6) + 1;
            int dice2 =  number.nextInt(6) + 1;
            int sumOfDice = dice1 + dice2;
            //Increasing the frequency each time a a sum is the same.
            ++frequency[sumOfDice - 2];
            /**
            //Using a switch statement
            switch(sumOfDice){
                case 2:
                ++frequency[0];
                break;
                case 3:
                ++frequency[1];
                break;
                case 4:
                ++frequency[2];
                break;
                case 5:
                ++frequency[3];
                break;
                case 6:
                ++frequency[4];
                break;
                case 7:
                ++frequency[5];
                break;
                case 8:
                ++frequency[6];
                break;
                case 9:
                ++frequency[7];
                break;
                case 10:
                ++frequency[8];
                break;
                case 11:
                ++frequency[9];
                break;
                case 12:
                ++frequency[10];
                break;
                default:
                break;
            }   //End of Switch
            */

        }   //End of loop

        //Printing the sum and frequency
        System.out.printf("%S\t\t%S%n", "Sum", "Frequency");
        for(int counter2 = 0; counter2 < frequency.length; counter2++){
            System.out.printf("%2d\t\t%d%n", sumArray[counter2], frequency[counter2]);
        }
    }
}
