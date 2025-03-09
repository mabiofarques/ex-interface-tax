package model.entities;


public class Industry {
    private String sectorName;
    private double totalValue;

    public Industry(){
    }

    public Industry(String sectorName, double totalValue) {
        this.sectorName = sectorName;
        this.totalValue = totalValue;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

}
