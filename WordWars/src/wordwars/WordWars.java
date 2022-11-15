/*
 * Programmer: Austin Goff 19004941
 * Program: WordWars
 * Date: 8/28/2019
 * Description: A word elimination game
 */
package wordwars;

import java.util.Scanner; //import scanner

public class WordWars {

    //declaring public variables
    public static String strSelection;
    public static String strFirstName, strSecondName, strPlayerTurn;
    public static String strWordChoice = "";
    public static String strAlphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
    public static String strLetterUsed = "";
    public static int intPlayer = 1;
    public static String strWordAgreement;
    public static String strVowels;
    public static boolean strNewAlphabet = true;
    public static int intScoreOne = 0, intScoreTwo = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the WORD WARS game.");
        System.out.println("Press (1) To start the game.");
        System.out.println("Press any other key to exit the game");

        System.out.print("Enter your selection: ");
        strSelection = sc.next();
        if (strSelection.equals("1")) { //continues the program
            System.out.println("*****************************************");
            System.out.print("Enter player 1 name: ");
            strFirstName = sc.next();
            System.out.print("Enter player 2 name: ");
            strSecondName = sc.next();

            System.out.println("LETS PLAY WORD WARS!!!");
            //while loop for the game
            while (!strWordChoice.equals("???")) {
                strPlayerTurn();
                System.out.println("Alphabet letters left: " + newAlphabet());
                System.out.print(strPlayerTurn + " enter your word: ");
                strWordChoice = sc.next();

                //agreeing on word
                System.out.println("Enter (y) yes if both players agree on word");
                strWordAgreement = sc.next();

                //continues the program
                if (strWordAgreement.equals("y")) {
                    //for loop for letters being used
                    for (int intCount = 0; intCount < strLetterUsed.toCharArray().length; intCount++) {
                        if (strWordChoice.contains(strLetterUsed.toCharArray()[intCount] + "")) {
                            strNewAlphabet = false;
                        }
                    }
                    strVowels = "aeiou";
                    //loop through variables
                    for (int intCount = 0; intCount < strWordChoice.toCharArray().length; intCount++) {
                        if (strVowels.contains(strWordChoice.toCharArray()[intCount] + "")) {
                            strWordChoice = strWordChoice.replace((strWordChoice.toCharArray()[intCount] + ""), "");
                        }
                    }

                } else { //if invalid word
                    System.out.print(strPlayerTurn + " enter your word: ");
                    strWordChoice = sc.next();

                    System.out.println("Enter (y) yes if both players agree on word");
                    strWordAgreement = sc.next();

                    strVowels = "aeiou";
                    //loop through variables
                    for (int intCount = 0; intCount < strWordChoice.toCharArray().length; intCount++) {
                        if (strVowels.contains(strWordChoice.toCharArray()[intCount] + "")) {
                            strWordChoice = strWordChoice.replace((strWordChoice.toCharArray()[intCount] + ""), "");
                        }
                    }
                }
            }
        } else {
            System.exit(0); //exits the program
        }
        Score(); //method to print score
    }

    public static String newAlphabet() { //change alphabet each turn
        if (strNewAlphabet == true) {
            //for loop for alphabet
            for (int intCount = 0; intCount < strAlphabet.toCharArray().length; intCount++) {
                //capture letters already used
                if (strWordChoice.contains(strAlphabet.toCharArray()[intCount] + "")) {
                    strLetterUsed += (strAlphabet.toCharArray()[intCount] + "");
                    strAlphabet = strAlphabet.replace((strAlphabet.toCharArray()[intCount] + ""), "*");
                }
            }
        } else {
            System.out.println("YOU ENTERED A WORD THAT CONTAINS A LETTER THAT IS"
                    + " USED OR IS NOT VALID. PLEASE ENTER ANOTHER WORD!"); //enter new word

        }
        return strAlphabet;
    }

    public static void strPlayerTurn() { //name of player and calculate score
        if (intPlayer == 1) {
            strPlayerTurn = strFirstName;
            intPlayer += 1;

            for (int intCount = 0; intCount < strWordChoice.length(); intCount++) {
                if (Character.isLetter(strWordChoice.charAt(intCount))) {
                    intScoreOne++;
                } else {
                }
            }

        } else {
            strPlayerTurn = strSecondName;
            intPlayer -= 1;

            for (int Count = 0; Count < strWordChoice.length(); Count++) {
                if (Character.isLetter(strWordChoice.charAt(Count))) {
                    intScoreTwo++;
                }
            }
        }
    }

    public static void Score() { //print result
        if (intScoreOne > intScoreTwo) {
            System.out.println("WINNER OF THE GAME IS " + strFirstName + " with a score of: " + intScoreOne);
            System.out.println("YOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!" + "\n"
                    + "THE GAME IS NOW OVER. THANKYOU FOR PLAYING WORD WARS!!!");
        }
        if (intScoreOne < intScoreTwo) {
            System.out.println("WINNER OF THE GAME IS " + strSecondName + " with a score of: " + intScoreTwo);
            System.out.println("YOUR NAME HAS BEEN SAVED TO THE HALL OF FAME!!!" + "\n"
                    + "THE GAME IS NOW OVER. THANKYOU FOR PLAYING WORD WARS!!!");
        }
    }
}
