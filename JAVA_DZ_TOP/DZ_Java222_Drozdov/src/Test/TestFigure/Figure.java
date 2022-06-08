package Test.TestFigure;

public abstract class Figure {

    double x;
    double y;
    final double PI = 3.14;

    public Figure(Figure figure) {
        this.x = figure.x;
        this.y = figure.y;
    }

    //Конструктор суперКласса для указания центра фигуры по X и Y
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //конструктор супер класса для круга
    public Figure() {
    }

//    //    Конструктор суперКласса для элипса и прямоугольника
//    public Figure(double a, double b) {
//    }


    //Метод смещения центра фигуры
    public static void Move(double x, double y) {
        x = Math.random()*100;
        y = Math.random()*100;
        System.out.println("Coordinate center figure by X after offset =  " + x + " and Y after offset= " + y);
    }

  abstract public double perimeter();




}


class Ellipse extends Figure {
    //Добавляем переменные minRad и maxRad для дальнейшего подсчета периметра эллипса
    double minRad;
    double maxRad;

    //   public Ellipse(Ellipse ellipse) {
//       super(ellipse);
//       this.minRad=minRad;
//       this.maxRad= maxRad;
//   }
    //конструктор для элипса
    Ellipse(double minRad, double maxRad) {
        this.minRad=minRad;
        this.maxRad=maxRad;
    }
    //конструктор для круга род класса
    public Ellipse(double rad) {
        super();
    }
    //периметр Эллипса
   public double  perimeter() {
        return (4 * (PI*maxRad*minRad+(Math.pow((maxRad-minRad),2)))/(minRad+minRad));
    }
}


class Rectangle extends Figure {
    double width;
    double height;
//    public Rectangle(Rectangle rectangle) {
//        super(rectangle);
//        this.width=width;
//        this.height= height;
//    }

    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }

   public double perimeter() {
        return 2 * width + 2 * height;
    }
}

// класс круг является дочерним классом элипс (задание-"обозначить между ними связь")
class Circle extends Ellipse {
    double rad; //добавляем переменную rad для дальнейшего подсчета периметра круга
    //конструктор для круга дочернего класса
    public Circle(double rad) {
        super(rad);
        this.rad = rad;
    }
    //периметр круга
   public double perimeter() {
        return 2 * PI * rad * rad;
    }

}


class DemoFigure {
    public static void main(String[] args) {
        Ellipse firstEll = new Ellipse(55,93);
        double per1;
        per1 = firstEll.perimeter();
        System.out.println("Perimeter ellipse= " + per1);

//        Figure figureEll = new Figure(5, 9);
//        System.out.println("Coordinate center figure by x= " + figureEll.x + " Coordinate center figure by y= " + figureEll.y);
//        figureEll.Move(figureEll.x, figureEll.y);
        System.out.println("");

        double per2;
        Rectangle firstRect = new Rectangle(15, 8);
        per2 = firstRect.perimeter();
        System.out.println("Perimeter rectangle= " + per2);
//        Figure figureRect = new Figure(25, 300);
//        System.out.println("Coordinate center figure by x= " + figureRect.x + " Coordinate center figure by y= " + figureRect.y);
//        figureRect.Move(figureRect.x, figureRect.y);
        System.out.println("");

        double per3;
        Circle firstCircle = new Circle(3.1);
        per3 = firstCircle.perimeter();
        System.out.println("Perimeter Circle= " + per3);
//        Figure figureCircle = new Figure(294, 665);
//        System.out.println("Coordinate center figure by x= " + figureCircle.x + " Coordinate center figure by y= " + figureCircle.y);
//        figureCircle.Move(figureCircle.x, figureCircle.y);
    }

}