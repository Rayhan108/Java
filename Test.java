import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw");
        int withdraw = sc.nextInt();
        try {
        
            if (withdraw < 1000) {
               
                throw new Exception("Balance must be grater than 1000");
            } else {
                balance = balance - withdraw;
                System.out.println("Successfuly withdrawn");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }
    }
}