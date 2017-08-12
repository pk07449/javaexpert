package com.pnakaj.pattern.decorator.example1;

/**
 * Created by pankaj on 3/22/2017.
 */

interface PartnerRelationShip {
    String getRelationShipType();
}
public class PartnerSetup  implements PartnerRelationShip {
    private int id;
    private String name;
    private String relationShipType = "NONE";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelationShipType() {
        return relationShipType;
    }

    public void setRelationShipType(String relationShipType) {
        this.relationShipType = relationShipType;
    }
}

class DealerPartnerSetupDecorator implements PartnerRelationShip{

    private PartnerSetup partnerSetup;
    public DealerPartnerSetupDecorator(PartnerSetup partnerSetup) {
        this.partnerSetup = partnerSetup;
    }


    public String getRelationShipType() {
         partnerSetup.setRelationShipType("DEALER_TYPE");
        return partnerSetup.getRelationShipType();
    }
}

class CustomerPartnerSetupDecorator implements PartnerRelationShip{

    private PartnerSetup partnerSetup;
    public CustomerPartnerSetupDecorator(PartnerSetup partnerSetup) {
        this.partnerSetup = partnerSetup;
    }


    public String getRelationShipType() {

        partnerSetup.setRelationShipType("CUSTOMER_TYPE");
        return partnerSetup.getRelationShipType();

    }
}

class Test {
    public static void main(String[] args) {
        PartnerSetup partnerSetup = new PartnerSetup();
        System.out.println(partnerSetup.getRelationShipType());
        System.out.println(new DealerPartnerSetupDecorator(partnerSetup).getRelationShipType());
        System.out.println(new CustomerPartnerSetupDecorator(partnerSetup).getRelationShipType());

        // is used to modify the functionality of an object at runtime.
        // At the same time other instances of the same class will not be affected by this,
    }
}




