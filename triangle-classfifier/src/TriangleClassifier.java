public class TriangleClassifier {
    public static String CheckTriangle(int firstEdge, int secondEdge, int thirdEdge) {
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
            return "This is not a triangle";
        } else {
            if (firstEdge == secondEdge && firstEdge == thirdEdge) {
                return "This triangle is an equilateral triangle";
            } else if (firstEdge == secondEdge || firstEdge == thirdEdge || secondEdge == thirdEdge) {
                return "This triangle is an isosceles triangle";
            } else {
                if (firstEdge + secondEdge > thirdEdge && firstEdge + thirdEdge > secondEdge && secondEdge + thirdEdge > firstEdge) {
                    return "This triangle is a normal triangle";
                } else {
                    return "This is not a triangle";
                }
            }
        }
    }
}

