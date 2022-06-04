package geometry;

public class Figure {

    double x;
     double y;
    int width;
    int height;
    int rad;
    final double PI = 3.14;



    //Конструктор суперКласса для элипса и прямоугольника
    public Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Конструктор суперКласса для круга
    public Figure(int rad) {
        this.rad = rad;
    }

    //Конструктор суперКласса для указания центра фигуры по X и Y
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Метод смещения цента фигуры
    public static void offSetFigure(double x, double y) {
        x = x *3;
        y = y + 65.5;
        System.out.println("Coordinate center figure by X after offset =  " + x + " and Y after offset= " + y);
    }



}


class Ellipse extends Figure {

    public Ellipse(int rad) {
        super(rad);
    }

    Ellipse(int width, int height) {
        super(width, height);
        //получаем доступ к переменным суперКласса width и height с помощью ключевого слова super

    }

    double perimeter() {
        return 4 * ((PI * width * height + (width - width) * (height - height)) / (height + width));
    }
}


class Rectangle extends Figure {
    public Rectangle(int width, int height) {
        super(width, height);
    }

    double perimeter() {
        return 2 * width + 2 * height;
    }
}

// класс круг является дочерним классом элипс (задание-"обозначить между ними связь")
// и использует конструктор родительского класса в котором находится переменная супер класса "rad"
class Circle extends Ellipse {

    public Circle(int rad) {
        super(rad);
    }

    double perimeter() {
        return 2 * PI * rad * rad;
    }
}


class DemoFigure {
    public static void main(String[] args) {
        Ellipse firstEll = new Ellipse(5, 9);
        Figure figureEll = new Figure(5.3, 9.7);
        int per;
        per = (int) firstEll.perimeter();
        System.out.println("Perimeter ellipse= " + per);
        System.out.println("Coordinate center figure by x= " + figureEll.x + " Coordinate center figure by y= " + figureEll.y);
        figureEll.offSetFigure(figureEll.x, figureEll.y);
        System.out.println("");

        Rectangle firstRect = new Rectangle(15, 8);
        per = (int) firstRect.perimeter();
        System.out.println("Perimeter rectangle= " + per);
        Figure figureRect = new Figure(25.9, 300.7);
        System.out.println("Coordinate center figure by x= " + figureRect.x + " Coordinate center figure by y= " + figureRect.y);
        figureRect.offSetFigure(figureRect.x, figureRect.y);
        System.out.println("");

        Circle firstCircle = new Circle(13);
        per = (int) firstCircle.perimeter();
        System.out.println("Perimeter Circle= " + per);
        Figure figureCircle = new Figure(294.8, 665.0);
        System.out.println("Coordinate center figure by x= " + figureCircle.x + " Coordinate center figure by y= " + figureCircle.y);
        figureCircle.offSetFigure(figureCircle.x, figureCircle.y);
    }

}