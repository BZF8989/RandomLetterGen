/**
 *
 * testing random character generator
 *
 * Created by Bill on 3/14/2018.
 */
public class Test {

    private static final int NUMOFLETTERS = 20;


    public static void main(String [] args){

        System.out.println("Testing...");

        System.out.println("SINGLE==================================================================");

        System.out.println("Lower case generator: " + RandomLettersGenerator.singleLowerCaseGenerator());
        System.out.println("Upper case generator: " + RandomLettersGenerator.singleUpperCaseGenerator());
        System.out.println("Any case generator: " + RandomLettersGenerator.singleAnyCaseGenerator());

        System.out.println("MULTI==============================================================");

        System.out.println("Lower case generator: " + RandomLettersGenerator.numberOfLowerCaseLetters(NUMOFLETTERS));
        System.out.println("Upper case generator: " + RandomLettersGenerator.numberOfUpperCaseLetters(NUMOFLETTERS));
        System.out.println("Any case generator: " + RandomLettersGenerator.numberOfAnyCaseLetters(NUMOFLETTERS));

        System.out.println("RANGE================================================================");

        System.out.println("Lower case generator: " +
                RandomLettersGenerator.numberOfLowerCaseLetters('a','y', NUMOFLETTERS));
        System.out.println("Upper case generator: " +
                RandomLettersGenerator.numberOfUpperCaseLetters('A', 'Y', NUMOFLETTERS));
        System.out.println("Any case generator: " +
                RandomLettersGenerator.numberOfAnyCaseLetters('A', 'y', NUMOFLETTERS));



    }



}
