package exercise05_shape_circle_rectangle.entities;

import exercise05_shape_circle_rectangle.entities.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(){
    }

    public Shape(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public abstract double area();
}
