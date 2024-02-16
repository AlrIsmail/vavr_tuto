package ShapeDescription;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeDescriptionTest {

    @Test
    void testDescribeCircle() {
        ShapeDescription.Shape circle = new ShapeDescription.Circle(5);
        String description = ShapeDescription.describeShape(circle);
        assertEquals("Cercle de rayon 5.0", description);
    }

    @Test
    void testDescribeSquare() {
        ShapeDescription.Shape square = new ShapeDescription.Square(4);
        String description = ShapeDescription.describeShape(square);
        assertEquals("Carré de côté 4.0", description);
    }

    @Test
    void testDescribeTriangle() {
        ShapeDescription.Shape triangle = new ShapeDescription.Triangle(3, 6);
        String description = ShapeDescription.describeShape(triangle);
        assertEquals("Triangle de base 3.0 et de hauteur 6.0", description);
    }

    @Test
    void testDescribeUnknownShape() {
        ShapeDescription.Shape unknown = new ShapeDescription.Shape();
        String description = ShapeDescription.describeShape(unknown);
        assertEquals("Forme inconnue", description);
    }
}
