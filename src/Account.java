public class Account {
    private int id;
    private String pin;
    private String name;
    private double balance;

    public Account(int id, String pin, String name) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = 0;
    }

    public void changePin(String pin) {
        this.pin = pin;
    }

    public boolean checkLogin(int id, String pin) {
        if(this.id == id && this.pin.equals(pin)) {
            return true;
        }
        else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if(balance >= amount && amount > 0) {
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    // Just for testing
    public static void main(String[] args) {
        Account a = new Account(1, "1234", "John");
        a.deposit(10000);
        System.out.println(a.getBalance());  // 10000
        a.withdraw(12000);
        System.out.println(a.getBalance());  // 10000
        a.withdraw(2000);
        System.out.println(a.getBalance());  // 8000
        System.out.println(a.checkLogin(2, "1234")); // False
        System.out.println(a.checkLogin(1, "4321")); // False
        System.out.println(a.checkLogin(1, "1234")); // True
    }
}
