package com.collections.mapinterface.votingsystem;
public class Main {
    public static void main(String[] args) {

        VotingSystem vs = new VotingSystem();

        vs.vote("Alice");
        vs.vote("Bob");
        vs.vote("Alice");
        vs.vote("Carol");
        vs.vote("Bob");

        System.out.println();
        vs.displayInsertionOrder();

        System.out.println();
        vs.displaySortedResults();
    }
}
