package ex0000;

public class CircleTest {
    public static void main(String[] args) {
        Cirlce obj;
        obj = new Cirlce();
        obj.radius = 100;
        obj.color = "blue";
        double area = obj.getArea();
        System.out.println("원의 면적=" + area);
    }

}
