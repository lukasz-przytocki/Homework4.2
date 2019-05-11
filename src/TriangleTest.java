public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(1,4,5);

        RightTriangle check = new RightTriangle();

        System.out.println("Triangle is rectangular?: " + check.isRightTriangle(triangle1));
        System.out.println("Triangle is rectangular?: " + check.isRightTriangle(triangle2));
    }
}
