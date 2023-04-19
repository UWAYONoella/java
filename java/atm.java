import java.util.Scanner;

public class atm{
    public static void main(String[] args){
        int balance=100000;
        int pin=1233;
        Scanner sn=new Scanner(System.in);
        System.out.println("Please enter your PIN");
        int mypin=sn.nextInt();
       
        if(mypin==pin){
            System.out.println("welcome to your ATM");
            System.out.println("Choose the option you want");
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Check balance");
            System.out.println("4: Exit");
            int choice=sn.nextInt();

            if(choice==1){
                int amount=sn.nextInt();
                balance=balance+amount;
                System.out.println("Your new balance is: $"+balance);
            }else if(choice==2){
                System.out.println("Please enter amount you want to withdraw");
                int amount=sn.nextInt();
                System.out.println("Please enter PIN to confirm");
                int pn=sn.nextInt();
                if(pn==pin){
                    if(amount<=balance){
                        balance=balance-amount;
                        System.out.println("Amount withdrawn is: $"+amount);
                    System.out.println("Your new balance is: $"+balance);
                    }else{
                        System.out.println("Insufficient amount");
                    }

                }else{
                     System.out.println("please enter correct PIN!");
                     int npin=sn.nextInt();
                     if(npin==pin){
                        System.out.println("Amount withdrawn is: $"+amount);
                        System.out.println("Your new balance is: $"+balance);
                     }
                     
                }
                
                
            }else if(choice==3){
                System.out.println("Please enter PIN to confirm");
                int mpn=sn.nextInt();
                if(mpn==pin){
                    System.out.println("Your new balance is: $"+balance);   
                }else{
                    System.out.println("Incorrect PIN!");
                }
                
            }else if(choice==4){
                System.out.println(" Thank you!Please you may take your card");
            }
            else{
                System.out.println("No option you chose!");
            }

        }
        else{
            System.out.println("Incorrect PIN");
        }
    }
    
}
