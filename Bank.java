import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }

//  public String getMessage(){
// return "Balance must be greter than 1000";
// }

}

class Bank {

    static int currentBalanced = 5000;

   

       public static void main(String[] args) {
           try {
            // int amount = Integer.parseInt(args[0]);
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            System.out.println("Your Amount is"+amount);
            withdraw(amount);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
 
 public static void withdraw(int amount) throws MyException {
        int newBalance = currentBalanced - amount;
        System.out.println("Inner method");
        if (newBalance < 1000) {
            throw new MyException("Balace must be greter than 1000");
        }
    }
}
