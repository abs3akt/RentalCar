package com.rentalBooking;

import java.util.Vector;

public class Rental {

    String agreementid;
    private String tid;
    Vector<Vehicle> vehicles = new Vector<>();



    public void setAgreementid(String tid){
        this.tid = tid;
    }

    public String getAgreementid(){
        return tid;
    }

    public void printAgreementid(){

    }







}
