package com.myJW;

public class jc_b00_Main {
    public static void main(String[] args) {
        jc_b03_BankClass bobsAccount = new jc_b03_BankClass(100.00, "Bob the builder",
                "10018435", "bobTheBuilder@gmail.com", "(087) 123-4567",
                "New York");

        bobsAccount.withdrawal(101);
        bobsAccount.withdrawal(50);
        bobsAccount.deposit(500);
        bobsAccount.withdrawal(100);
    }
}
