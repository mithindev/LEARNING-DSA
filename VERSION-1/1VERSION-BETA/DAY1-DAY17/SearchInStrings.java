public class SearchInStrings {
    public static void main(String[] args) {
        String name = "mithindev";
        boolean ans = StringSearch(name, 'd');
        System.out.println(ans);


    }
    // return true if present;
    // return false if not present;
    static boolean StringSearch(String word, char target){
        if (word.length() == 0){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (target == temp){
                return true;
            }
        }
        return false;
    }
}
