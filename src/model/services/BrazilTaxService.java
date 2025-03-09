package model.services;


public class BrazilTaxService implements TaxService {

    @Override
    public double calculateTaxFood(double amount) {
        return amount * 0.01;
    }

    @Override
    public double calculateTaxHealthy(double amount) {
        return amount * 0.015;
    }

    @Override
    public double calculateTaxClothing(double amount) {
        return amount * 0.025;
    }

    @Override
    public double calculateTaxCulture(double amount) {
        return amount * 0.04;
    }
}
