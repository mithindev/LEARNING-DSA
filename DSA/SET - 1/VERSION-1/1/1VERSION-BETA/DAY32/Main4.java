package DAY32;


public class Main4 {
    public static void main(String[] args) {

    }
    static void skip (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1)); // this creates a new String skiping one character from the begining.
        } else {
            skip (p + ch, up.substring(1));
        }

    }

    static String skip (String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip (up.substring(1));
        } else {
            return (ch + skip(up.substring(1)));
        }
    }

    static String skipMithin (String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("mithin")) {
            return skipMithin(up.substring(6));
        } else {
            return up.charAt(0) + skipMithin(up.substring(6));
        }
    }

    static String skipAppNotApple (String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) +  skipAppNotApple(up.substring(3));
        }
    }
}
