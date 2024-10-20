import java.lang.classfile.instruction.SwitchCase;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Account {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private static double balance;

    public Account(){

    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(String firstName){
        this.firstName=firstName;
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(String lastName){
        this.lastName=lastName;
        return lastName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(String email){
        this.email=email;
        return email;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(String phone){
        this.phone=phone;
        return phone;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public Double getBalance(double balance){
        this.balance=balance;
        return balance;
    }

    public void checkBalance(){
        System.out.println("Balance: "+balance);
    }


    public void deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write money for deposit: ");
        double scanSumm = scanner.nextDouble();
        System.out.println(balance+"+"+scanSumm+"="+(balance+scanSumm));
    }

    public void withdrawal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write money for withdrawal: ");
        double scanSumm = scanner.nextDouble();
        System.out.println(balance+"-"+scanSumm+"="+(balance-scanSumm));
    }

    public void transaction(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write money for transaction: ");
        double scanSumm = scanner.nextDouble();

    }




    @Override
    public String toString() {
        return "\n" +
                "\nAccount: " +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nemail: " + email +
                "\nPhone: " + phone +
                "\nBalance: " + balance;
    }
}
