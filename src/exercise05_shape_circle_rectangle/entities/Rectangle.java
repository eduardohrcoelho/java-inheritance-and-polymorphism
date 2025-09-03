package exercise05_shape_circle_rectangle.entities;

import exercise05_shape_circle_rectangle.entities.enums.Color;

public class Rectangle extends Shape{
    private Double width;
    private Double height;

    public Rectangle(){
        super();
    }
    public Rectangle(Color color, Double height, Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return width * height;
    }
}
