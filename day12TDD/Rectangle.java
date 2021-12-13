import org.w3c.dom.ls.LSOutput;

public class Rectangle {
    int length;
    int width;
    public Rectangle(int width , int length) {
        if (length<=0 || width<=0 ){
            throw new IllegalArgumentException("canot use Zero and negative numver");
        }
        this.length=length;
        this.width=width;

    }

    public int area(){
        return this.width*this.length;

    }
    public int perimeter(){

        return 2*(this.width+this.length);
    }
}
