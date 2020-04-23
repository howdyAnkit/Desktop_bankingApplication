
package com.bank.main;


public class Customer {
    private String name;
    private String email;
    private String address;
    private String accountnumber;
    private String balance;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public String getBalance() {
        return balance;
    }
       public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
