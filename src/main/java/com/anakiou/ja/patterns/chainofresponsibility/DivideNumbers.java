package com.anakiou.ja.patterns.chainofresponsibility;

public class DivideNumbers implements Chain {

    private Chain nextInChain;

   
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

   
    public void calculate(Numbers request) {

        if (request.getCalcWanted() == "div") {

            System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = " +
                                     (request.getNumber1() / request.getNumber2()));

        } else {

            System.out.print("Only works for add, sub, mult, and div");

        }
    }
}