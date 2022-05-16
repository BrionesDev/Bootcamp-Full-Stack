
package ejerciciosGenerales;

import java.util.Currency;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elian Briones
 */
public class CurrentAccount {
    private double balance;
    private double creditLimit;
    private String name;
    private int accountNum;

    public CurrentAccount(double balance, double creditLimit, String name, int accountNum) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.name = name;
        this.accountNum = accountNum;
    }
    
    // Empty constructor
    public CurrentAccount() {}
    
    public CurrentAccount createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- - - CREATE NEW ACCOUNT - - -");
        System.out.println("Enter your balance");
        balance = sc.nextDouble();
        System.out.println("Enter your credit limit");
        creditLimit = sc.nextDouble();
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your account number");
        accountNum = sc.nextInt();
        return new CurrentAccount(balance, creditLimit, name, accountNum);
    }
            
    public void depositMoney(double quantity) {
        if (quantity > 0) balance +=  quantity;
    }
    
    public void depositRandomMoney() {
        double randQuantity = aleaJactaEst(100, 200);
        if (randQuantity > 0) balance +=  randQuantity;
    }
    
    public boolean withdrawal(double quantity) {
        if (quantity > 0) {
            if (balance - quantity >= -creditLimit) {
                balance -= quantity;
                System.out.println("Operation completed!");
                return true;
            } else {
                System.out.println("Your credit limit cannot be exceeded");
                return false;
            }
        } else {
            System.out.println("Cannot withdrawal a negative quantity");
            return false;
        }
    }

    public boolean matchBalance(CurrentAccount ca, CurrentAccount ca2) {
        double firstBalance = ca.getBalance();
        double secondBalance = ca2.getBalance();
        double differenceBalance = (firstBalance + secondBalance) / 2;
        boolean isPossible;
        
        if (firstBalance > secondBalance) {
            isPossible = ca.withdrawal(firstBalance - differenceBalance);
            if (isPossible) ca2.depositMoney(firstBalance - differenceBalance);
        } else {
            isPossible = ca2.withdrawal(secondBalance - differenceBalance);
            if (isPossible) ca.depositMoney(firstBalance - differenceBalance);
        }
        return isPossible;
    }
    
    public boolean isSameBalance (CurrentAccount ca, CurrentAccount ca2, CurrentAccount ca3) {
        double firstBalance = ca.getBalance();
        double secondBalance = ca2.getBalance();
        double thirdBalance = ca3.getBalance();
        
        return firstBalance == secondBalance && secondBalance == thirdBalance;
    }
    
    public void giveInterests(CurrentAccount ca, int interests) {
        double balance = ca.getBalance();
        ca.depositMoney(balance * interests / 100);
    }
    
    // EX4 - Roll the dice. Mostrar 1 de las cuentas de forma aleatoria. -> aleJactaEst
    public static CurrentAccount rollTheDice(CurrentAccount ca, CurrentAccount ca2, CurrentAccount ca3) {
        int accountSelected = aleaJactaEst(1, 3);
        return accountSelected == 1 ? ca : 
               accountSelected == 2 ? ca2 : 
               accountSelected == 3 ? ca3 : 
               null;
    }
    
    private static int aleaJactaEst(int min, int max) {
        int value = (int) (Math.random() * max + min);
        return value;
    }
    
    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" + "balance=" + balance + ", creditLimit=" + creditLimit + ", name=" + name + ", accountNum=" + accountNum + '}';
    }
    
    
}
