import java.util.Scanner;

public class LoginDialog {
    private int id;
    private String pin;

    public void displayLoginDialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        id = scanner.nextInt();
        System.out.print("PIN: ");
        pin = scanner.next();
    }

    public int getId() {
        return id;
    }

    public String getPin() {
        return pin;
    }

    // Just for testing
    public static void main(String[] args) {
        LoginDialog dialog = new LoginDialog();
        dialog.displayLoginDialog();
        System.out.println(dialog.getId());
        System.out.println(dialog.getPin());
    }
}
