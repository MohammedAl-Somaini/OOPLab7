import java.awt.*;
public class Lab7BetterRectangular extends Rectangle {
    private double parameter;
    private double area;
    public Lab7BetterRectangular(double width, double height) {
        super.setLocation(null);
        super.setSize(10,11);
        parameter=2*(width+height);
        area=width*height;
    }
    public double getParameter() {
        return parameter;
    }
    public double getArea() {
        return area;
    }
}
