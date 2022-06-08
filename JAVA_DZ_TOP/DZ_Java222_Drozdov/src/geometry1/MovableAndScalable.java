package geometry1;


public interface MovableAndScalable {
    //Перемещение фигуры
    void Move(double x, double y);

    //Увеличение размеров фигуры
    double Grow(double p);
}
