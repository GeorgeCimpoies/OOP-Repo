package com.company;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class TestLottery {
    public TestLottery() {
    }

    public static void main(String[] args) {
        LotteryDraw l1 = new LotteryDraw(4, 40);
        LotteryDraw l2 = new LotteryDraw(6, 49);
        LotteryTicket b1 = new LotteryTicket(4, 40);
        b1.autofill();
        LotteryTicket b2 = new LotteryTicket(4, 40);
        b2.autofill();
        LotteryTicket b3 = new LotteryTicket(6, 49);
        b3.readNumbers();
        l1.draw();
        l1.list();
        b1.list();
        l1.checkWins(b1);
        b2.list();
        l1.checkWins(b2);
        b3.list();
        l1.checkWins(b3);
        b3.list();
        l2.checkWins(b3);
    }
}
