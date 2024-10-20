import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account();
        account1.setFirstName("Jhon");
        account1.setLastName("Fartuner");
        account1.setEmail("jhon@gmail.com");
        account1.setPhone("0(312) 66-70-88");
        account1.setBalance(7500);
        System.out.println(account1);

        Account account2=new Account();
        account2.setFirstName("Clark");
        account2.setLastName("Mouses");
        account2.setEmail("clark@gmail.com");
        account2.setPhone("0(312) 54-09-23");
        account2.setBalance(5500);
        System.out.println(account2);
        System.out.println(" ");

        account1.checkBalance();
        account1.deposit();
        account1.withdrawal();

        System.out.println("  ");

        account2.checkBalance();
        account2.deposit();
        account2.withdrawal();




    }
}