package com.myJW;

public class jc_b03_BankClass {
    private double balance;
    private String cust_name;
    private String cust_accNum;
    private String cust_email;
    private String cust_phone;
    private String cust_address;

    public jc_b03_BankClass(){
        this(0.00, "defaultName", "10018501",
                "defaultMail", "defaultPhone", "defaultAddress");
        System.out.println("this is a default constructor which calls to parameterised constructor using this() function.");
    }

    public jc_b03_BankClass(double balance, String cust_name, String cust_accNum,
                            String cust_email, String cust_phone, String cust_address) {
        System.out.println("Parameterised constructor is called.");
        this.balance = balance;
        this.cust_name = cust_name;
        this.cust_accNum = cust_accNum;
        this.cust_email = cust_email;
        this.cust_phone = cust_phone;
        this.cust_address = cust_address;
    }

    public double getBalance() {
        return balance;
    }

    public String getCust_accNum() {
        return cust_accNum;
    }

    public void setCust_accNum(String cust_accNum) {
        this.cust_accNum = cust_accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount +" made. New Balance = "+ this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Due to insufficient balance of "+ this.balance +"/- withdrawal can't be processed." );
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+ withdrawalAmount +" processed. New Balance = "+ this.balance);
        }
    }
}
