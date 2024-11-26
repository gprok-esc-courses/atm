import java.util.Scanner;

public class ATM {
    private Bank bank;
    private Account account;
    private Menu menu;
    private LoginDialog loginDialog;

    public ATM() {
        bank = new Bank();
        menu = new Menu();
        loginDialog = new LoginDialog();
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give amount: ");
        double amount = scanner.nextDouble();
        if(!account.withdraw(amount)) {
            System.out.println("Not enough money!");
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give amount: ");
        double amount = scanner.nextDouble();
        if(!account.deposit(amount)) {
            System.out.println("Invalid amount");
        }
    }

    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give new pin: ");
        String pin = scanner.nextLine();
        account.changePin(pin);
    }

    public void run() {
        int selection = 0;
        Scanner scanner = new Scanner(System.in);
        double amount = 0;
        while (true) {
            loginDialog.displayLoginDialog();
            account = bank.getAccount(loginDialog.getId(), loginDialog.getPin());
            if(account != null) {
                do {
                    menu.displayMenu();
                    selection = menu.getSelection();
                    switch (selection) {
                        case 0:
                            System.out.println("bye!");
                            break;
                        case 1:
                            System.out.println("Balance: " + account.getBalance());
                            break;
                        case 2:
                            withdraw();
                            break;
                        case 3:
                            deposit();
                            break;
                        case 4:
                            changePin();
                            break;
                    }
                } while(selection != 0);
            }
            else {
                System.out.println("Invalid credentials");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.run();
    }
}
