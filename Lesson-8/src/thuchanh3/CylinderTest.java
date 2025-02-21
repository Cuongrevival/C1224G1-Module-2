package thuchanh3;

public class CylinderTest extends Cylinder {
    int radius;
    int height;
    double expected = Cylinder.getVolume(radius, height);

    double testGetVolume0And0() {
        radius = 0;
        height = 0;
        return expected;

    }

    double testGetVolume1And2() {
        radius = 1;
        height = 2;
        return expected;
    }
}
