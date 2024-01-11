/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String ans = "";
        int i = 0;
        char ch = s.charAt(i);
        while(s.length() > i) {
            ch = s.charAt(i);
            if ((char) ch >= 65 && (char) ch <= 90) {
                ch = (char) (s.charAt(i) + 32);                   
            }
            ans += ch + ""; 
            i++;
        } 
        return ans;
    }
}