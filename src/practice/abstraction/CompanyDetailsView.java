package practice.abstraction;

public class CompanyDetailsView {
    public static void main(String[] args) {
        CompanyDetails companyDetails = new CompanyDetails();
        companyDetails.companyName = "ALexa Group";
        companyDetails.foundedYear = 1990;
        companyDetails.profitPerYearInBillion = 2;
        System.out.println("========== Company Details ==========");
        companyDetails.printCompanyDetails();
        System.out.println("\n" + "*%*%*%*%*% ALERT!! CONFIDENTIAL!! *%*%*%*%*%*");
        companyDetails.printCompanyConfidentialDetails();
    }
}
