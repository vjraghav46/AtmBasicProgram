import java.util.*;
public class ATM {

    public static void main(String[] args){

        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your pin number ");

        int password = sc.nextInt();

        if(password == pin){

            System.out.println("Enter your name: ");
            name = sc.next();
            System.out.println("welcome " + name);


            while(true){
                System.out.println("press 1 to check your balance");
                System.out.println("press 2 to add amount");
                System.out.println("press 3 to take amount");
                System.out.println("press 4 to take receipt");
                System.out.println("press 5 to EXIT");

                int opt = sc.nextInt();
                switch(opt){

                    case 1:
                        System.out.println("your current balance is "+ balance);
                        break;

                    case 2:
                        System.out.println("how much amount did you want to add to your account ");
                        AddAmount = sc.nextInt();
                        System.out.println("successfully credited: ");
                        balance = AddAmount + balance;
                        break;

                    case 3:
                        System.out.println("how much amount did you want to take ");
                        TakeAmount = sc.nextInt();
                        if(TakeAmount>balance){
                            System.out.println("your balnce is insufficient");
                            System.out.println("try less than your available balance");

                        }
                        else{
                            System.out.println("successfully taken");
                            balance = balance - TakeAmount;
                        }
                        break;

                    case 4:
                        System.out.println("welcome to all in one mini ATM");
                        System.out.println("available balance is " + balance);
                        System.out.println("amount deposited " + AddAmount);
                        System.out.println("amount taken "+ TakeAmount);
                        System.out.println("thanks for coming");

                        break;

                    default:
                        System.out.println("press the number below 5");
                        break;


                }

                if(opt == 5){
                    System.out.println("thank you");
                    break;
                }

            }
        }

        else{
            System.out.println("wrong pin number");
        }

    }
}
