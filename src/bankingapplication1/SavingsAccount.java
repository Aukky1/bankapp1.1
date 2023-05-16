/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication1;

/**
 *
 * @author Student
 */
public class SavingsAccount {
    private int accountNumber;
    private String accountName;
    private double balance;
    private String accountType;
    
    public SavingsAccountt(int accountNumber, String accountName,double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getNumber() {
        return this.accountNumber;
    }
    public String getName() {
        return this.accountName;    
    }
    
    @Override
}
