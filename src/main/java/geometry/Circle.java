package geometry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Circle {
    private double centerCircleX;
    private double centerCircleY;
    private double radiusX;
    private double radiusY;

    private double pointX;
    private double pointY;

    public double radiusOfCircle(double radiusX, double centerCircleX, double radiusY, double centerCircleY) {
        return Math.hypot(radiusX - centerCircleX, radiusY - centerCircleY);
    }

    public double distanceFromCentreToPoint(double pointX, double centerCircleX, double pointY, double centerCircleY) {
        return Math.hypot(pointX - centerCircleX, pointY - centerCircleY);
    }

}
