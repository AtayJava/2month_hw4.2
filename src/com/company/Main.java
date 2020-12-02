package com.company;

public class Main {

    public static void main(String[] args) {
        Runner first = new Runner("Runner 1");
        Runner second = new Runner("Runner 2");
        Runner third = new Runner("Runner 3");
        Runner fourth = new Runner("Runner 4");
        Runner fifth = new Runner("Runner 5");

        fifth.setRunners(fifth, second);
        second.setRunners(first, third);
        third.setRunners(second, fourth);
        fourth.setRunners(third, fifth);
        fifth.setRunners(fourth, first);
        first.start();




    }
}
