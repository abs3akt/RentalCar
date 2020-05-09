package com.rentalBooking;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    rentalBooking();

    }
    public static void rentalBooking() {
        Scanner myObj = new Scanner(System.in);
        String rental;


        // Enter username and press Enter
        System.out.println("Add/Update rental y/n ?");
        rental = myObj.nextLine();
        if (rental.equals("y")){
            System.out.println( "true");
        }else{
            System.out.println("false");
        }
    }






}
