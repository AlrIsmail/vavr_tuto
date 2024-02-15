package ShapeDescription;

public class ShapeDescription {

    static class Shape {}

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }
    }

    static class Square extends Shape {
        double side;

        Square(double side) {
            this.side = side;
        }
    }

    static class Triangle extends Shape {
        double base;
        double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
    }
    
    public static String describeShape(Shape shape) {
    	// Implémentez la fonction pour retourner la description de la forme en utilisant le pattern matching de Vavr
        // Les descriptions devraient être "Cercle de rayon {rayon}", "Carré de côté {côté}" et "Triangle de base {base} et de hauteur {hauteur}"
        return "";
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape triangle = new Triangle(3, 6);

        System.out.println(describeShape(circle)); // Devrait afficher "Cercle de rayon 5.0"
        System.out.println(describeShape(square)); // Devrait afficher "Carré de côté 4.0"
        System.out.println(describeShape(triangle)); // Devrait afficher "Triangle de base 3.0 et de hauteur 6.0"
    }
}
