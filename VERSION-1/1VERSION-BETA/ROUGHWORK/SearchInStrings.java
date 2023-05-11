package ROUGHWORK;
import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {

    }
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return false;
            }
        }
        return false;
    }
}
