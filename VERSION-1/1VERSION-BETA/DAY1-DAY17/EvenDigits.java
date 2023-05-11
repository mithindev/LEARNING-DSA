public class EvenDigits {
    public static void main(String[] args) {
    }
    static int eDigits(int[] nums){
        if (nums.length ==0){
            return 0;
        }
        int count1 = 0;
        int count2 = 0;
        for (int element : nums){
            while(element > 0){
                count1++;
                element = element /10;
            }
            if(count1 % 2 ==0){
                count2++;
            }
            count1 = 0;
        }
        return count2;

    }
}
