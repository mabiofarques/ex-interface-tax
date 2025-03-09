package model.services;

import model.entities.Industry;

public class IndustryTaxService {
    private TaxService taxService;
    private double tax;
    private double total;

    public IndustryTaxService(TaxService taxService){
        this.taxService = taxService;
    }

    public double processTax(Industry industry){
        if (industry.getSectorName().equals("Food")){
            tax = taxService.calculateTaxFood(industry.getTotalValue());
            return total = tax + industry.getTotalValue();
        }
        else if (industry.getSectorName().equals("Healthy")){
            tax = taxService.calculateTaxHealthy(industry.getTotalValue());
            return total = tax + industry.getTotalValue();
        }
        else if (industry.getSectorName().equals("Clothing")){
            tax = taxService.calculateTaxClothing(industry.getTotalValue());
            return total = tax + industry.getTotalValue();
        }
        else if (industry.getSectorName().equals("Culture")){
            tax = taxService.calculateTaxCulture(industry.getTotalValue());
            return total = tax + industry.getTotalValue();
        }
        else {
            throw new RuntimeException("Invalid industry or value");
        }
    }

    @Override
    public String toString() {
        return "Tax: R$ " + String.format("%.2f",tax) +
                ", Total: R$ " + String.format("%.2f",total);
    }
}
