class Rectangle{
    double length;
    double breadth;

    Rectangle(){
        this.length=length;
        this.breadth=breadth;
    }

}
class Cuboid extends Rectangle {
    int heigth;

    Cuboid() {
        this.heigth = 1;
    }

    Cuboid(int height) {
        this.heigth = heigth;
    }

    Cuboid(double length, double breadth, double height) {
        super(length, breadth);
        this.heigth = heigth;

    }


    public int volume(){
        return this.length * this.breadth * this.heigth;
    }


}
public class Shape {
    public static void  main(String[] args){
        Cuboid cuboid=new Cuboid(2,4,5);
        System.out.println(cuboid.volume());
    }
}

