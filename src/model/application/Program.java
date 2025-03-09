package model.application;

import model.entities.Industry;
import model.services.BrazilTaxService;
import model.services.IndustryTaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Cálculo de taxa:");
        System.out.print("Digite o setor(Food; Healthy; Clothing; Culture): ");
        String sector = sc.nextLine();
        System.out.print("Total a pagar: ");
        double value = sc.nextDouble();
        Industry industry = new Industry(sector,value);

        IndustryTaxService service = new IndustryTaxService(new BrazilTaxService());
        double total = service.processTax(industry);
        System.out.println(service.toString());
    }
}
