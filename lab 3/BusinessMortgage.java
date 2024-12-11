package test;

import java.math.BigDecimal;

public class BusinessMortgage extends Mortgage{
    public BusinessMortgage() {
        setInterestRate(new BigDecimal(0.01));
    }
}
