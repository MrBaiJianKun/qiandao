package  sample.graphical;

/**
 * 矩形面积抽象类
 * @author 白建坤
 * 2019.3.10
 */
public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
