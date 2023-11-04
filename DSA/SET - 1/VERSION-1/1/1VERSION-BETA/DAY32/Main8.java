package DAY32;
import java.util.ArrayList;

public class Main8 {
    public static void main(String[] args) {

    }
    static void permutations (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = up.substring(0,i);
            String s = up.substring(i,p.length());
            permutations(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> perms (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = up.substring(0, i);
            String s = up.substring(i, p.length());
            ans.addAll(perms(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    

}