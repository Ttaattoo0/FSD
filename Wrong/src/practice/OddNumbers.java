package practice;

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("First 20 odd numbers:");
        
        int count = 0;
        int num = 1;
        
        while (count < 20) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}