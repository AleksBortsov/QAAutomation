package geometry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CircleTest {

    @Test(dataProvider = "pointsDistanceProvider")
    public void includePointInCircleTest(double centerCircleX, double centerCircleY, double radiusX, double radiusY, double pointX, double pointY) {
        Circle circle = new Circle();
        System.out.print("Radius of the Circle: ");
        System.out.printf("%5.2f", circle.radiusOfCircle(radiusX, centerCircleX, radiusY, centerCircleY));
        System.out.println();
        System.out.print("Length from center of the Circle: ");
        System.out.printf("%5.2f", circle.distanceFromCentreToPoint(pointX, centerCircleX, pointY, centerCircleY));

        assertThat(circle.radiusOfCircle(radiusX, centerCircleX, radiusY, centerCircleY)
                >= circle.distanceFromCentreToPoint(pointX, centerCircleX, pointY, centerCircleY)).isTrue();
    }

    @DataProvider(name = "pointsDistanceProvider")
    public Object[][] pointsDistanceProvider() {
        return new Object[][]{
                {1.0, 1.0, 2.0, 2.0, 3.0, 2.0},
                {0.0, 0.0, 1.0, 1.0, 1.0, 1.0}
        };
    }
}
