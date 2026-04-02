package com28minutes.opps;

public class NewBookRunner {
    public static void main(String[] args) {
        NewBook artOfComputerProgramming = new NewBook();
        NewBook effectiveJava = new NewBook();
        NewBook cleanCode = new NewBook();

        artOfComputerProgramming.start();
        effectiveJava.start();
        cleanCode.start();

        artOfComputerProgramming.setNumberOfCopy(100);
        //effectiveJava.setNoOfCopies(80);
        //cleanCode.setNoOfCopies(50);
    }
}
