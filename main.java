public class BankAccount {
    private String name;
    private int age;
    private long accountNumber;

    public BankAccount(String name, int age, long accountNumber) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Sheila Margallo", 22, 1234567890);

        System.out.println("Account Holder: " + myAccount.getName());
        System.out.println("Age: " + myAccount.getAge());
        System.out.println("Account Number: " + myAccount.getAccountNumber());

        myAccount.setName("Jane Smith");
        myAccount.setAge(25);

        System.out.println("\nModified Account Holder: " + myAccount.getName());
        System.out.println("Modified Age: " + myAccount.getAge());
    }
}
