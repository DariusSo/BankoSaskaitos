import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saving1 = new SavingsAccount(1549, 8);
        SavingsAccount saving2 = new SavingsAccount(10252, 6);
        SavingsAccount saving3 = new SavingsAccount(495823, 4);

        CheckingAccount cheking1 = new CheckingAccount(100, 2);
        CheckingAccount cheking2 = new CheckingAccount(100, 2);
        CheckingAccount cheking3 = new CheckingAccount(100, 2);

        List<BankAccount> accountList = new ArrayList<>();
        accountList.add(saving1);
        accountList.add(saving2);
        accountList.add(saving3);

        accountList.add(cheking1);
        accountList.add(cheking2);
        accountList.add(cheking3);

        for(BankAccount b : accountList){
            if (b instanceof SavingsAccount){
                System.out.println(b.toString());
                System.out.printf("Saskaita uzdirbo %.2f Eur", b.calculateInterest());
                System.out.println();
            }
        }
    }

}
