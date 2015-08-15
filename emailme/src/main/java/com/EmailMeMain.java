package com;

import java.util.Date;

public class EmailMeMain {

    public static void main(String[] args) {
        sendEmail();
    }

    private static void sendEmail() {
        System.out.println("Time is " + new Date());
    }
}
