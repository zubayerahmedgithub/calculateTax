public class calculateTax {
    public static void main(String[] args) {
        // Initial Yearly Salary Without Bonus
        double yearlySalary = 36000;

        // Yearly salary With Gratuity
        int yearlySalaryWithGratuity = 36000 + 5400; // Gratuity Added With Base Salary

        // Define All The Tax Rate
        double fedTaxFare = 15.5;
        double stateTaxFare = 3.4;
        double localTaxFare = 1.8;

        // Calculate Tax With Gratuity Salary
        double federalTax = yearlySalaryWithGratuity * fedTaxFare/100;
        double stateTax = yearlySalaryWithGratuity * stateTaxFare/100;
        double localTax = yearlySalaryWithGratuity * localTaxFare/100;

        // Net Paid Taxes
        double netTax = federalTax + stateTax + localTax;

        // Define Yearly In pocket Salary
        double yearlyInPocketSalary = yearlySalaryWithGratuity - netTax;

        // Print All Information
        System.out.println("Take home yearly salary: $" + yearlyInPocketSalary);
        System.out.println("Federal tax: $" + federalTax);
        System.out.println("State tax: $" + stateTax);
        System.out.println("local tax: $" + localTax);
        System.out.println("Total tax paid: $" + netTax);


    }
}
