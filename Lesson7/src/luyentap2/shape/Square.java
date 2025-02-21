package luyentap2.shape;

public class Square extends Rectangle {
    private double side;
    public Square() {
        side = 1.0;
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

   public double getSide() {
        return getWidth();
   }
   public void setSide(double side) {
        setWidth(side);
        setHeight(side);
   }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + " which is a subclass of " + super.toString();
    }
}
