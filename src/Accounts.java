public class Accounts {
    private final  int accoutno;
    private String name;
    private int pin;
    private double balance;

    public Accounts(int accoutno,String name,int pin){
        this.accoutno=accoutno;
        this.name=name;
        this.pin=pin;
        this.balance=0;
    }
    //getters method

    public int getAccoutno() {
        return accoutno;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }
//setters  method

    public void setName(String name) {
        this.name = name;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //method for printing the details
    public void displaydetails(){
        System.out.println("---------------------");
        System.out.println("Name :"+name);
        System.out.println("AccountNo :"+accoutno);
        System.out.println("balance : "+balance);
    }
}
