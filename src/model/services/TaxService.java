package model.services;


public interface TaxService {
    double calculateTaxFood(double amount);
    double calculateTaxHealthy(double amount);
    double calculateTaxClothing(double amount);
    double calculateTaxCulture(double amount);

}
