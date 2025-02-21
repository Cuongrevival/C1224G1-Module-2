class Fan {
    public static final int SLOW = 1;
    public static final int NORMAL = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean isOn;
    private double radius;
    private String color;
    public Fan() {
        this.speed = SLOW;
        this.isOn = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public void turnOn(){
        isOn = true;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        String message;
        if (this.isOn){
            message =  "Fan is on, speed: " + speed + ", radius: " + radius + ", color: " + color;
        } else {
            message =  "Fan is off. Radius: " + radius + ", color: " + color;
        }
        return message;
    }


}
public class Connection {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.turnOn();
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("Yellow");
        fan1.setRadius(10.0);
        fan2.setSpeed(Fan.NORMAL);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
