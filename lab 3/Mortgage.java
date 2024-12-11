package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Mortgage implements MortgageConstants{
    private long mortgageNumber;

    private String customerName;

    private BigDecimal mortgageAmount;

    private BigDecimal interestRate;

    private int mortgageTerm;

    public long getMortgageNumber() {
        return mortgageNumber;
    }

    public void setMortgageNumber(long mortgageNumber) {
        this.mortgageNumber = mortgageNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(BigDecimal mortgageAmount) {
        if (mortgageAmount.compareTo(MAX_AMOUNT) > 0) {
            throw new RuntimeException("MAX_AMOUNT is :" + MAX_AMOUNT +", please set correct mortgage amount!");
        }
        this.mortgageAmount = mortgageAmount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    protected void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public int getMortgageTerm() {
        return mortgageTerm;
    }

    public void setMortgageTerm(int mortgageTerm) {
        if (mortgageTerm == SHORT_TERM || mortgageTerm == MEDIUM_TERM || mortgageTerm == LONG_TERM) {
            this.mortgageTerm = mortgageTerm;
        } else {
            this.mortgageTerm = SHORT_TERM;
        }

    }


    public String getMortgageInfo() {
        return "Mortgage{" +
                "mortgageNumber=" + mortgageNumber +
                ", customerName='" + customerName + '\'' +
                ", mortgageAmount=" + mortgageAmount +
                ", interestRate=" + interestRate.setScale(8, RoundingMode.HALF_UP) +
                ", mortgageTerm=" + mortgageTerm +
                ", totalAmount=" + mortgageAmount.multiply(BigDecimal.ONE.add(interestRate)).setScale(8, RoundingMode.HALF_UP) +
                '}';
    }
}
