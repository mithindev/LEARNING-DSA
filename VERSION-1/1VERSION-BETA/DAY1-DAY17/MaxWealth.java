public class MaxWealth {
    public static void main(String[] args) {

    }
    public int Wealth(int[][] arr){

        // person = row
        // account = col
        int wealth = Integer.MIN_VALUE;
        for(int[] person : arr){
            int sum = 0;
            for(int money : person){
                sum = sum + person[money];
            }
            if(sum > wealth){
                wealth = sum;

            }
        }
        return wealth;

    }
}
