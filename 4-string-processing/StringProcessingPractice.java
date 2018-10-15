/*
 * APCS-A - Strings and Loops
 *
 * This program is to give you practice writing methods that use for loops. Each
 * problem requires logic similar to what may be required on AP Exam FRQs.  
 *
 * Choose any 5 of the 7 problems to complete. Doing more will not result in 
 * extra credit. Each problem will be graded on a 1-4 scale. Strive for simple
 * solutions and do not do anything more than meet problem specifications. You 
 * will receive a one point deduction for extraneous code that has an effect 
 * (for example, prints something.) Overly complex, working code or code with 
 * logic masked by non-descriptive variable names may also receive a one point
 * deduction. 
 * 
 * 
 * 1. The function testGrader works by comparing two strings, answers and key. 
 *    answers will be a string of letters and possibly ? characters which represent 
 *    unanswered questions. key is the corresponding string of correct answers. 
 *    Grades are calculated by awarding 1 point for correct answers, no points for 
 *    unanswered questions, and deducting 0.25 points for incorrect answers. For 
 *    example, the answer sheet with DA?BCA graded against the key DBCBCA would be
 *    given a score of 3.75.
 *    
 *          public __________ testGrader(String answers, String key) { }
 *  
 *  
 * 2. The function letterSwapper takes a string str as input and returning a new 
 *    string with each pair of letters swapped. In the case of an odd number of 
 *    characters in the string, the last character is simply appended to the end. 
 *    For example passing a string of loops would return a string of olpos. 
 *      
 *          public __________ letterSwapper(String str) { }
 *      
 *      
 * 3. The function caseComparer returns true if the input string contains the same 
 *    number of lowercase letters as it does uppercase and false otherwise. The 
 *    string may contain non-alphabetic characters. (Uppercase letters have ASCII 
 *    values in the range 65 to 90 and lowercase letters values in the range 
 *    97 to 122.)
 *    
 *          public __________ caseComparer(String str) { }
 *      
 *      
 *  4. A charFilter takes a string str and returns a new string which contains only 
 *     the characters in str that also appear in allowed. For example, a call of 
 *     charFilter(“computers”, “osmgur”) would return omr.  (omurs???)
 *      
 *          public __________ charFilter(String str, String allowed) { }
 *     
 *     
 * 5. A trimmedRepeater takes a string str and returns a new string which contains
 *    the the whole string, followed by all characters except the first, all characters
 *    except the second, and so on. For example, a call of charRepeater(“apple”) would 
 *    return appleppleplelee.
 *    
 *          public __________ trimmedRepeater(String str) { }
 *     
 *     
 * 6. A patternCounter takes a string str and returns a count of the number of times 
 *    pattern occurs in the string. For example, a call of charRepeater(“yyyyaddyycyyy”, “yyy”)
 *    would return 3.  (2???) 
 *    
 *          public __________ patternCounter(String str, String pattern) { }
 *          
 *          
 * 7. A starChecker takes a string str and returns true if for each occurrence of a * character, 
 *    the characters on either side of the star are the same and false otherwise. If a * happens
 *    to be at the end of the string, then it should return false.
 *    
 *          public __________ starChecker(String str) { }
 *
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  Emily Wilber
 * @version Oct 12, 2018
 */
 
 public class StringProcessingPractice
 {
    /*  1) The function testGrader works by comparing two strings, answers and key. 
     *    answers will be a string of letters and possibly ? characters which represent 
     *    unanswered questions. key is the corresponding string of correct answers. 
     *    Grades are calculated by awarding 1 point for correct answers, no points for 
     *    unanswered questions, and deducting 0.25 points for incorrect answers. For 
     *    example, the answer sheet with DA?BCA graded against the key DBCBCA would be
     *    given a score of 3.75.
     * 
     */
    public static double testGrader(String answers, String key) {
        double grade = 0;
        for (int i=0; i < key.length(); i++){
            if (answers.charAt(i) == (key.charAt(i))){
                grade++;
            }
            else if (answers.charAt(i) == ('?')) {
                grade = grade;
            }
            else {
                grade -= 0.25;
            }
        }
        return grade;
    }
    
    /* 2. The function letterSwapper takes a string str as input and returning a new 
     *    string with each pair of letters swapped. In the case of an odd number of 
     *    characters in the string, the last character is simply appended to the end. 
     *    For example passing a string of loops would return a string of olpos. 
     *     
     *          
     */
    public static String letterSwapper(String str) { 
        String swapStr = "";
        int i;
        char a;
        char b;
        if ((str.length()) % 2 == 0) {
            for (i = 0; i <= (str.length() - 2); i+= 2) {
                a = str.charAt(i);
                b = str.charAt(i + 1);
                swapStr = swapStr + b + a;
            }
        }
        else{
            for (i = 0; i < (str.length() - 1); i+= 2) {
                a = str.charAt(i);
                b = str.charAt(i + 1);
                swapStr = swapStr + b + a;
            }
            swapStr = swapStr + str.substring(str.length() - 1);
        }
        return swapStr;
    }
    
    /*
     *   3. The function caseComparer returns true if the input string contains the same 
     *    number of lowercase letters as it does uppercase and false otherwise. The 
     *    string may contain non-alphabetic characters. (Uppercase letters have ASCII 
     *    values in the range 65 to 90 and lowercase letters values in the range 
     *    97 to 122.)
     *     
     */
    public static boolean caseComparer(String str) { 
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
                upper++; 
            }
            else {
                lower++;
            }
        }
        return (upper == lower); 
    }
    
    /*      
     *      5. A trimmedRepeater takes a string str and returns a new string which contains
     *    the the whole string, followed by all characters except the first, all characters
     *    except the second, and so on. For example, a call of charRepeater(“apple”) would 
     *    return appleppleplelee.
     */   
    public static String trimmedRepeater(String str) { 
        String repStr = str;
        for (int i = 1; i < str.length(); i++) {
            repStr = repStr + str.substring(i);
        }
        return repStr;
    }
    
    /* 7. A starChecker takes a string str and returns true if for each occurrence of a * character, 
     *    the characters on either side of the star are the same and false otherwise. If a * happens
     *    to be at the end of the string, then it should return false.
     */  
    public static boolean starChecker(String str) { 
        if (str.charAt(0) == '*' || str.charAt(str.length() - 1) == '*') {
            return false;
        }
        
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i-1) == str.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }
           
    public static void main(String[] args)
    {
        System.out.println(testGrader("DA?BCA", "DBCBCA"));
        System.out.println(testGrader("A?B", "AAA"));
        System.out.println();
        
        System.out.println(letterSwapper("badc"));
        System.out.println(letterSwapper("badce"));
        System.out.println();
        
        System.out.println(caseComparer("Aaa"));
        System.out.println(caseComparer("AAaa"));
        System.out.println();
        
        System.out.println(starChecker("*aaa"));
        System.out.println(starChecker("aaaa*a"));
        System.out.println();
        
        System.out.println(trimmedRepeater("abcd"));
        System.out.println(trimmedRepeater("Elephant"));
    }
 }
 
