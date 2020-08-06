package com.ft.view.model;

import java.math.BigDecimal;

public class LoanDetails {

    private String mortgageType;
    private BigDecimal loanAmount;
    private int loanTerm;
    private String productType;

    public String getMortgageType() {
        return mortgageType;
    }

    public void setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "LoanDetails{" +
                "mortgageType='" + mortgageType + '\'' +
                ", loanAmount=" + loanAmount +
                ", loanTerm=" + loanTerm +
                ", productType='" + productType + '\'' +
                '}';
    }
}
