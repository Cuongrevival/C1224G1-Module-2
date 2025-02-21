import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
@Test
    void testFirstTriangleClassifier() {
    int xEdge = 2;
    int yEdge = 2;
    int zEdge = 2;
    String triangle = "This triangle is an equilateral triangle";
    String result = TriangleClassifier.CheckTriangle(xEdge, yEdge, zEdge);
    assertEquals(triangle, result);
}
@Test
    void testSecondTriangleClassifier() {
    int xEdge = 2;
    int yEdge = 2;
    int zEdge = 3;
    String triangle = "This triangle is an isosceles triangle";
    String result = TriangleClassifier.CheckTriangle(xEdge, yEdge, zEdge);
    assertEquals(triangle, result);
}
@Test
    void testThirdTriangleClassifier() {
    int xEdge = 3;
    int yEdge = 4;
    int zEdge = 5;
    String triangle = "This triangle is a normal triangle";
    String result = TriangleClassifier.CheckTriangle(xEdge, yEdge, zEdge);
    assertEquals(triangle, result);
}
@Test
    void testFourthTriangleClassifier() {
    int xEdge = 8;
    int yEdge = 2;
    int zEdge = 3;
    String triangle = "This is not a triangle";
    String result = TriangleClassifier.CheckTriangle(xEdge, yEdge, zEdge);
    assertEquals(triangle, result);
}
@Test
    void testFifthTriangleClassifier() {
    int xEdge = -1;
    int yEdge = 2;
    int zEdge = 1;
    String triangle = "This is not a triangle";
    String result = TriangleClassifier.CheckTriangle(xEdge, yEdge, zEdge);
    assertEquals(triangle, result);
}
@Test
    void testSixthTriangleClassifier() {
    int xEdge = 0;
    int yEdge = 1;
    int zEdge = 1;
    String triangle = "This is not a triangle";
    String result = TriangleClassifier.CheckTriangle(xEdge, yEdge, zEdge);
    assertEquals(triangle, result);
}
}