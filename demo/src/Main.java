// sai
class Rectangle {
    protected int width, height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Vi phạm LSP: Thay đổi logic setWidth
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // Vi phạm LSP: Thay đổi logic setHeight
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
/*
//đúng
interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    protected int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}
*/
