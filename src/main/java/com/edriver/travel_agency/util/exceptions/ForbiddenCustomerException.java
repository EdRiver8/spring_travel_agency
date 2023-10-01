package com.edriver.travel_agency.util.exceptions;

public class ForbiddenCustomerException extends RuntimeException{

    public ForbiddenCustomerException() {
        super("This customer is blocked");
    }
}
