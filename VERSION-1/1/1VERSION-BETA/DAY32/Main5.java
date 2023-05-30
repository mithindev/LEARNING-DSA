package DAY32;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {

    }
    // We need to obtain all the subsets of the given String.

    static void subSeq (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeqReturn (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
            char ch = up.charAt(0);

        ArrayList<String> left = subSeqReturn (p + ch, up.substring(1));
        ArrayList<String> right = subSeqReturn (p , up.substring(1));
        left.addAll(right);
        return left;
    }

    static ArrayList<String> subSeqAscii (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAscii(p, up.substring(1));
        ArrayList<String> second = subSeqAscii(p + (ch+0), up.substring(1));
        ArrayList<String> third = subSeqAscii(p + ch, up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
