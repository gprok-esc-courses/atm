import java.util.Scanner;

public class Menu {
    private int selection;

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Change Pin");
        System.out.println("0. EXIT");
        System.out.print("Select: ");
        selection = scanner.nextInt();
    }

    public int getSelection() {
        return selection;
    }

    // Just for testing
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
        System.out.println(menu.getSelection());
    }
}
