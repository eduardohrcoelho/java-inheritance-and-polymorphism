package exercise05_shape_circle_rectangle.application;

import exercise05_shape_circle_rectangle.entities.Circle;
import exercise05_shape_circle_rectangle.entities.Rectangle;
import exercise05_shape_circle_rectangle.entities.Shape;
import exercise05_shape_circle_rectangle.entities.enums.Color;

import java.util.*;

public class Program {

    /*
    Faça um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas destas figuras na mesma ordem em que forma digitadas.

    Write a program to read data from N figures (N provided by the user), and then display the areas of these figures in the same order in which they were entered.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle(r/c)? ");
            char ch = scanner.next().charAt(0);
            System.out.print("BLACK/BLUE/RED: ");
            Color color = Color.valueOf(scanner.next());
            if(ch == 'r'){
                System.out.print("Widht: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, width, height));
            }else{
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS: ");
        for(Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }

        scanner.close();
    }

}
