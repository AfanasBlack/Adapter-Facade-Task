package Facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.mult("1010", "101"));
        System.out.println(bins.sum("101", "01"));
    }
}
