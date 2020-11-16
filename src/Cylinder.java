public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        super(1.0,"white");
        this.height = 1.0;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }
    public double getVolume() {
        return  super.getArea() * this.height;
    }
    @Override
    public String toString() {
        return "This is Cylinder";
    }
}
