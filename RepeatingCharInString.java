import java.util.*;

class RepeatingCharInString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Helper(s));
    }

    public static char Helper(String s) {
        char c = s.charAt(0);
        char maxChar = s.charAt(0);
        int len = 1;
        int maxlen = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                len++;
                if (len > maxlen) {
                    maxlen = len;
                    maxChar = c;
                }
            } else {
                len = 1;
                c = s.charAt(i);
            }
        }
        return maxChar;
    }
}