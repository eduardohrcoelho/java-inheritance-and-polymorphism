package exercise04_taxpayer_payroll.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override

    public String toString(){
        return getName() + " $ " + String.format("%.2f", tax());
    }

    public double tax(){
        double baseTax;
        if(getAnualIncome() < 20000.0){
            baseTax = getAnualIncome() * 0.15;
        }else{
            baseTax = getAnualIncome() * 0.25;
        }

        double healthAbatement = getHealthExpenditures() * 0.50;

        return baseTax - healthAbatement;
    }
}
