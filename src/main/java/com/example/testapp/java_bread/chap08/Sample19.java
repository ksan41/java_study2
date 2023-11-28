package com.example.testapp.java_bread.chap08;

public class Sample19 {
    
    public static void main(String[] args) {
        Wallet myWallet = new Wallet(10000);

        // myWallet.myMoney -= 2200;
        myWallet.pay(2000);

        myWallet.checkMyMoney();
    }
}

class Wallet {
    private int myMoney;

    public Wallet(int myMoney) {
        this.myMoney = myMoney;
    }

    public void pay(int payMoney) {
        this.myMoney -= (int)(payMoney * 1.1);
    }

    public void checkMyMoney() {
        System.out.println("남은 돈 : " + this.myMoney);
    }
}
