// 5th assignment, item -2 (absrtaction > 0)
package practice.abstraction;

public abstract class Company {
    String companyName;
    int foundedYear;
    long profitPerYearInBillion;

    public abstract void printCompanyConfidentialDetails();

    public void printCompanyDetails(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Founded in: " + foundedYear);
    }
}
