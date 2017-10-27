package com.pnakaj.spring.ioc.lookupmethod;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 10/26/2017.
 */
@Component
public class ReprocessFactory {

    @Lookup("defaultUserReprocessPrototypeBean")
    public UserReProcess lookupDefaultUserReprocess(){
        //spring will override this method
        return null;
    }

    @Lookup("customerReprocessPrototypeBean")
    public UserReProcess lookupDealerReprocess(){
        //spring will override this method
        return null;
    }

    @Lookup("dealerReprocessPrototypeBean")
    public UserReProcess lookupCustomerReprocess(){
        //spring will override this method
        return null;
    }
}
