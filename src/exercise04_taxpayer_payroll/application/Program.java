package exercise04_taxpayer_payroll.application;

import java.util.*;

import exercise04_taxpayer_payroll.entities.TaxPayer;
import exercise04_taxpayer_payroll.entities.Individual;
import exercise04_taxpayer_payroll.entities.Company;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i+1) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);
            if(ch == i){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = scanner.nextDouble();
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }else{
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Anual income: ");
                Double anualIncome = scanner.nextDouble();
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scanner.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("TAXES PAID: ");
        for(TaxPayer payer : list){
            System.out.println(payer);
        }

        scanner.close();
    }
}
