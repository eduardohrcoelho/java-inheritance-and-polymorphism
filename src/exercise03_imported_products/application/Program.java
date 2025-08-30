package exercise03_imported_products.application;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import exercise03_imported_products.entities.ImportedProduct;
import exercise03_imported_products.entities.Product;
import exercise03_imported_products.entities.UsedProduct;

public class Program {

    /*
    Faça um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados. 
    Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. Estes dados específicos devem ser acrescentados na etiqueta de preço.
    Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
    
    Write a program to read the data for N products (N provided by the user). Finally, display the price tag for each product in the same order they were entered.
    Every product has a name and price. Imported products have a customs fee, and used products have a manufacturing date. This specific data should be added to the price tag.
    For imported products, the customs fee should be added to the final price.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Product #" + (i+1)+ " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();
            if(ch == 'c'){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                list.add(new Product(name, price));
            }else if(ch == 'i'){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("Customs fee: ");
                Double customFee = scanner.nextDouble();
                
                list.add(new ImportedProduct(name, price, customFee));
            }else{
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Price: ");
                Double price = scanner.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println("PRICE TAGS: ");
        for(Product p : list){
            System.out.println(p.priceTag());
        }

        scanner.close();
    }
}
