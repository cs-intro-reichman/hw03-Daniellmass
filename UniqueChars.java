/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String ans ="";
        int i = 0;
        while (s.length() > i) {
            char ch = s.charAt(i);
            if (ch == ' ' || s.indexOf(ch) == -1 || s.indexOf(ch) == i){
                ans += ch;  
            }    
            i++;      
        
        }  
        return ans; 

    }
}


