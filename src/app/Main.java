package app;

public class Main {
    static void main(String[] args) {

        double income = 8000;

        double taxRate;
        if (income <= 10000) {
            taxRate = 0.025;
        } else if (income <= 25000) {
            taxRate = 0.043;
        } else {
            taxRate = 0.067;
        }
        double taxAmount = income * taxRate;

        System.out.printf("Income: %.2f%n", income);
        System.out.printf("Tax rate: %.1f%%%n", taxRate * 100);
        System.out.printf("Tax amount: %.2f%n", taxAmount);

    }
}