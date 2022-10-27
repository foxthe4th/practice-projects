package com.hackerrank.codingchallenges;

import sun.nio.cs.US_ASCII;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

    public static void main(String[] args) {


        double payment = 22.15;

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        System.out.println("USA " + us);
        System.out.println("India " + india);
        System.out.println("China " + china);
        System.out.println("France " + france);

    }
}
