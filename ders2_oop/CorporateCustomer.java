package ders2_oop;

public class CorporateCustomer extends Customer {
    private String companyName;
    private String TaxNumber;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(String TaxNumber) {
        this.TaxNumber = TaxNumber;
    }
}
