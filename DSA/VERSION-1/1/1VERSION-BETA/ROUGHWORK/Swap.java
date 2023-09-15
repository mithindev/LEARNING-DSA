package ROUGHWORK;

public class Swap {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        swap(num1,num2);
        System.out.println(num1);
        System.out.println(num2);

    }
    static int swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        return num1;

    }
}
