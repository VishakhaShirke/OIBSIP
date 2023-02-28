import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        int id = 101;
        int pin = 13579;
        int balance = 50000, withdraw, deposit, transfer;

        Scanner sc = new Scanner(System.in);
        System.out.println("------- Welcome !------- ");
        System.out.println("Enter your ID : ");
        int ID = sc.nextInt();
        while (ID != id) {
            System.out.println("INCORRECT ID. PLEASE ENTER AGAIN !!!");
            System.out.println("Enter your ID : ");
            ID = sc.nextInt();
        }
        System.out.println("Enter your Pin : ");
        int entry = sc.nextInt();
        while (entry != pin) {
            System.out.println("INCORRECT PIN. PLEASE ENTER AGAIN !!!");
            System.out.println("Enter your Pin : ");
            entry = sc.nextInt();
        }

        while (true) {
            System.out.println("Welcome to ATM Interface");
            System.out.println("1] Withdraw Money");
            System.out.println("2] Deposit Money");
            System.out.println("3] Transfer Money");
            System.out.println("4] Check Balance");
            System.out.println("5] EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");

                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                        System.out.println("Remaining Balance : " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                        System.out.println("Your Balance : " + balance);
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("Remaining Balance : " + balance);
                    System.out.println("");
                    break;

                case 3:

                    System.out.print("Enter money to be Transfer:");

                    transfer = sc.nextInt();

                    balance = balance - transfer;
                    System.out.println("Your Money has been successfully Transfer");
                    System.out.println("Remaining Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Your Balance : " + balance);
                    System.out.println("");
                    break;

                case 5:
                    System.out.println(" Thank you !!! ");
                    System.exit(0);
            }
        }
    }
}