public class TestCircleAndCylinderMethod {
    public static void main(String[] args) {
        Circle circle = new Circle(30,"black");
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);

        System.out.println();

        Cylinder cylinder = new Cylinder(20,30,"brown");
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getColor());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder);
    }
}
