import java.util.*;

    class ATM{
        float Balance;
        int PIN = 5764;

        public void checkpin(){
            System.out.println("Enter your pin");
            Scanner sc = new Scanner(System.in);
            int enterdpin = sc.nextInt();
            if(enterdpin == PIN){
                menu();
            }else{
                System.out.println("Enter a valid pin");
            }
            menu();
        }

        public void menu(){
            System.out.println("Enter Your Choise");
            System.out.println("1. Check A/C Balance: ");
            System.out.println("2. Withdraw Money: ");
            System.out.println("3. Deposit Money ");
            System.out.println("4. EXIT");
            
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if(opt == 1 ){
                checkBalance();
            }else if(opt == 2){
                withdrawMoney();
            }else if(opt == 3){
                depositeMoney();
            }else if(opt == 4){
                return;
            }else{
                System.out.println("Enter a valid choise");
            }
        
        }
        
        public void checkBalance(){
            System.out.println("Balance: " + Balance);
            menu();
        }

        public void withdrawMoney(){
            System.out.println("Enter Amount to Withdraw:" );
            Scanner sc = new Scanner(System.in);
            float amount  = sc.nextFloat();
            if(amount>Balance){
                System.out.println("Insufficient Balance..!");

            }else{
                Balance = Balance - amount;
                System.out.println("Withdraw Money Succesful..!");
            }
            menu();
        }

        public void depositeMoney(){
            System.out.println("Enter the Amount");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance = Balance + amount;
            System.out.println("Money Deposite Succesfully..!");
            menu();
        }
    }
    public class atmMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();

         
    }
}
