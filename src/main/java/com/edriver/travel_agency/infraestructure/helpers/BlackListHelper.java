package com.edriver.travel_agency.infraestructure.helpers;

import com.edriver.travel_agency.util.exceptions.ForbiddenCustomerException;
import org.springframework.stereotype.Component;

@Component
public class BlackListHelper {

    public void isInBlackListCustomer(String customerId) {
        if (customerId.equals("GOTW771012HMRGR087")) {
            throw new ForbiddenCustomerException();
        }
    }
}
