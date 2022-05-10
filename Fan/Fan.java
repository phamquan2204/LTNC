package Fan;
public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        if (on == true) {
            return ("Speed: " + speed + "\nColor: " + color + "\nRadius: " + radius + "\nThe fan is on");
        } else {
            return ("Color: " + color + "\nRadius: " + radius + "\nThe fan is off");
        }
    }

    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fan fan_1 = new Fan(FAST, true, 10, "yellow");
        Fan fan_2 = new Fan(MEDIUM, false, 5, "blue");
        // fan_2.setSpeed(MEDIUM);

        System.out.println(fan_1.toString());
        System.out.println(fan_2.toString());

    }
}