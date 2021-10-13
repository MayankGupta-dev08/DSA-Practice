import java.util.*;

public class c99_string_toggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                ans += Character.toLowerCase(ch);
            else
                ans += Character.toUpperCase(ch);
        }
        return ans;
    }
}
