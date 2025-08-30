package exercise02.application;

import java.util.*;

import exercise02.entities.Employee;
import exercise02.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println("Emplyee #" + i + " data: ");
            System.out.print("Outsourced (y/n): ");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }else{
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        
        scanner.close();
    }
}
