package practice.abstraction;

public class CompanyDetails extends Company {
    @Override
    public void printCompanyConfidentialDetails() {
        System.out.println("Profit per year: " + profitPerYearInBillion + " billion");
    }
}
