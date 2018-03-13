import java.util.Random;

/**
 *
 * Generates random letters, various methods produce different letters
 *
 *
 *
 * Created by Bill on 3/11/2018.
 * Last Updated on 3/12/2018
 */
public class RandomLettersGenerator {

    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";

    private static final int NUMOFLOWERCASE = LOWERCASE.length();

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final int NUMOFUPPERCASE = UPPERCASE.length();

    private static final int DIFFERENCE = 'a'-'Z'+1;

    private static Random r = new Random();


    /*
      ==================================================================================================
                                                SINGLE LETTERS
      ==================================================================================================
     */




    /**
     * Generates a single lower case letter, returns as a char
     * @return a single randomly chosen lower case letter
     */
    public static char singleLowerCaseGenerator(){
        return LOWERCASE.charAt(r.nextInt()%NUMOFLOWERCASE);
    }

    /**
     * Generates a single upper case letter, returns as a char
     * @return a single randomly chosen upper case letter
     */
    public static char singleUpperCaseGenerator(){
        return UPPERCASE.charAt(r.nextInt()%NUMOFUPPERCASE);
    }

    /**
     * Generates a single lower case letter between start and end, inclusive, returns as a char
     * @param start beginning of range
     * @param end end of range, inclusive
     * @return a single randomly chosen lower case letter between start and end, 0 otherwise
     */
    public static char singleLowerCaseGenerator(char start, char end){
        if(start == end)
            return start;
        if(start > end || start < 'a' || end > 'z')
            return 0;
        else
            return LOWERCASE.charAt(start + r.nextInt(end - start + 1));
    }

    /**
     * Generates a single upper case letter between start and end, inclusive, returns as a char
     * @param start beginning of range
     * @param end end of range, inclusive
     * @return a single randomly chosen lower case letter between start and end, 0 otherwise
     */
    public static char singleUpperCaseGenerator(char start, char end){
        if(start == end)
            return start;
        if(start > end || start < 'A' || end > 'Z')
            return 0;
        else
            return UPPERCASE.charAt(start + r.nextInt(end - start + 1));
    }


    /**
     * Generates a single letter, returns as char
     * @return a single randomly chosen letter
     */
    public static char singleAnyCaseGenerator(){
        return r.nextInt()%2==0 ? singleLowerCaseGenerator() : singleUpperCaseGenerator();
    }


    /**
     * Generates a single letter between start and end, inclusive, returns as a char
     * @param start beginning of range
     * @param end end of range, inclusive
     * @return a single randomly chosen letter between start and end, 0 otherwise
     */
    public static char singleAnyCaseGenerator(char start, char end){
        if(start == end)
            return start;
        if(start > end || start < 'A' || end > 'z')
            return 0;
        else if(start < 'Z' && end > 'a'){
            int range = end - start - DIFFERENCE;
            int randomNumber = r.nextInt(range);
            if(randomNumber + start > 'Z'){
                return LOWERCASE.charAt(randomNumber - 'Z');
            }else{
                return UPPERCASE.charAt(start + randomNumber);
            }
        }else if(start < 'Z' && end <='Z'){
            return singleUpperCaseGenerator(start, end);
        }else{
            return singleLowerCaseGenerator(start, end);
        }
    }

        /*
      ==================================================================================================
                                            MULTIPLE LETTERS
      ==================================================================================================
     */


    /**
     * Generates a string of random lowercase letters
     * @param n - number of letters in random string
     * @return a string of lowercase characters randomly generate, otherwise NULL
     */
    public static String numberOfLowerCaseLetters(int n){
        if(n < 1) {
            return null;
        }

        StringBuilder s = new StringBuilder();
        for(int i = 0; i < n; i++){
            s.append(singleLowerCaseGenerator());
        }
        return s.toString();
    }

    /**
     * Generates a string of random uppercase letters
     * @param n - number of letters in random string
     * @return a string of uppercase characters randomly generate, otherwise NULL
     */
    public static String numberOfUpperCaseLetters(int n){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i< n; i++){
            s.append(singleUpperCaseGenerator());
        }

        return s.toString();
    }

    /**
     * Generates a string of random letters
     * @param n - number of letters in random string
     * @return a string of characters randomly generate, otherwise NULL
     */
    public static String numberOfAnyrCaseLetters(int n){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i< n; i++){
            s.append(singleAnyCaseGenerator());
        }

        return s.toString();
    }


    /**
     * generates n number of lower case characters between start and end
     * @param start smallest random character
     * @param end largest random character
     * @param n number of random characters to pick from
     * @return null if out of bounds, a string of random lower case characters otherwise
     */
    public static String numberOfLowerCaseLetters(char start, char end, int n){
        if(start > end || start < 'a' || end > 'z')
            return null;
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < n; i++){
            s.append(singleLowerCaseGenerator(start, end));
        }

        return s.toString();
    }

    /**
     * generates n number of upper case characters between start and end
     * @param start smallest random character
     * @param end largest random character
     * @param n number of random characters to pick from
     * @return null if out of bounds, a string of random upper case characters otherwise
     */
    public static String numberOfUpperCaseLetters(char start, char end, int n){
        if(start > end  || start < 'A' || end > 'Z')
            return null;
        StringBuilder s = new StringBuilder();
        for(int i = 0; i< n; i++){
            s.append(singleUpperCaseGenerator(start, end));
        }

        return s.toString();
    }

    /**
     * generates n number of characters between start and end
     * @param start smallest random character
     * @param end largest random character
     * @param n number of random characters to pick from
     * @return null if out of bounds, a string of random characters otherwise
     */
    public static String numberOfAnyrCaseLetters(char start, char end, int n){
        if(start > end  || start < 'A' || end > 'z')
            return null;
        StringBuilder s = new StringBuilder();
        for(int i = 0; i< n; i++){
            s.append(singleAnyCaseGenerator(start, end));
        }

        return s.toString();
    }



}
