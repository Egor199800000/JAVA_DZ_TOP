package Test.Box;


import javafx.scene.shape.MoveTo;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    public Box(double length) {
        this.width = length;
        this.height = length;
        this.depth= length;
    }
    double volume(){
        return width*height*depth;
    }
}

class BoxWeight extends Box{
    double weight;

    public BoxWeight(BoxWeight x) {
        super(x);
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double length, double weight) {
        super(length);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight{
    double price;

    public Shipment(double width, double height, double depth, double weight, double price) {
        super(width, height, depth, weight);
        this.price = price;
    }

    public Shipment(Shipment shipment) {
        super(shipment);
        this.price = price;
    }

    public Shipment() {
        super();
        this.price = -1;
    }

    public Shipment(double length, double weight, double price) {
        super(length, weight);
        this.price = price;
    }
}

