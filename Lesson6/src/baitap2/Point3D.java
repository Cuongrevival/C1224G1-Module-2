package baitap2;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] setXYZ(float z) {
        float[] xyz = new float[3];
        xyz[0] = this.getX();
        xyz[1] = this.getY();
        xyz[2] = z;
        return xyz;
    }
    public float[] getXYZ() {
        return new float[] {this.getX(), this.getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                 "} has "+ super.toString();
    }
}
