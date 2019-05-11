public class RightTriangle {

    boolean isRightTriangle(Triangle triangle){
        return ((Math.pow(triangle.sideA,2)+(Math.pow(triangle.sideB,2)))==Math.pow(triangle.sideC,2));
    }
}
