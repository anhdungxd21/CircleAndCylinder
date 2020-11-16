public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "white";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this. color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "This is a circle";
    }
}
