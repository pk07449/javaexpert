package com.yash.pattern.decorator;

/**
 * Created by pankaj on 3/28/2017.
 */
public class example2 {

    public static void main(String[] args) {
        FieldValiatior fieldValiatior = new AdvanceValidatorValidator(new FieldValiatiorImpl());
        fieldValiatior.isValid();
    }
}

class AdvanceValidatorValidator extends AdvanceValidatorImpl implements FieldValiatior {
    private FieldValiatior fieldValiatior;

    public AdvanceValidatorValidator(FieldValiatior fieldValiatior) {
        this.fieldValiatior = fieldValiatior;
    }


    public boolean isValid() {
        return fieldValiatior.isValid() && isAdvanceFieldValid();
    }
}

interface FieldValiatior {
    public boolean isValid() ;
}

class FieldValiatiorImpl implements FieldValiatior {

    public boolean isValid() {
        return false;
    }
}

interface AdvanceValidator {
    public boolean isAdvanceFieldValid();
}


class AdvanceValidatorImpl implements AdvanceValidator {
    public boolean isAdvanceFieldValid() {
        return true;
    }
}
