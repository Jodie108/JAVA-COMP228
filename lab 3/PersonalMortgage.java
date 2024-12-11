package test;

import java.math.BigDecimal;

public class PersonalMortgage extends Mortgage{
    public PersonalMortgage() {
        setInterestRate(new BigDecimal(0.02));
    }
}
