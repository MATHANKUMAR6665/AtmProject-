import java.util.ArrayList;
public class AtmService {
    ArrayList<Transactions>transactionsArrayList=new ArrayList<>();
    ArrayList<Accounts>accountsArrayList=new ArrayList<>();
    //methods to create a accounts
    public void createAccout(Accounts a){
        accountsArrayList.add(a);
        System.out.println("accounts added succesfully");

    }
    //method for deposit
    public Accounts searchacc(int acc){
        for(Accounts a:accountsArrayList){
            if(a.getAccoutno()==acc){
                return a;
            }
        }
        return null;
    }
    public void deposit(int account,int pin,double amount){
        Accounts a=searchacc(account);

        if(a!=null){
            if(a.getPin()==pin){
                double v = a.getBalance() + amount;
                System.out.println("the depostited amount is :"+amount);
                System.out.println("deposit succesfuly");
                System.out.println("the Balance was :"+v);

            }
        }
    }
}
