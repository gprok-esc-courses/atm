public class Bank {
    private Account [] accounts;

    public Bank() {
        accounts = new Account[5];
        accounts[0] = new Account(1000, "1017", "Nick Jones");
        accounts[0].deposit(1890.00);
        accounts[1] = new Account(1001, "7817", "Ann Brown");
        accounts[1].deposit(5900.00);
        accounts[2] = new Account(1002, "9091", "Thomas McKay");
        accounts[2].deposit(7012.20);
        accounts[3] = new Account(1003, "8851", "Tracy Williams");
        accounts[3].deposit(5510.00);
        accounts[4] = new Account(1004, "4941", "Anthony Williams");
        accounts[4].deposit(12900.00);
    }

    public Account getAccount(int id, String pin) {
        for(Account a : accounts) {
            if(a.checkLogin(id, pin)) {
                return a;
            }
        }
        return null;
    }

    // Just for testing
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a = bank.getAccount(1, "12345");
        System.out.println(a);   // null
        Account b = bank.getAccount(1003, "8851");
        System.out.println(b);   // Account@123445
    }
}
