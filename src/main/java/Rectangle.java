/**
 * Definition of the Rectangle Class
 * @author Kavin Mohanadas
 * @version 17.0.1
 */

public class Rectangle {
    double length;
    double width;

    /**
     * Default constructor of rectangle
     */
    public Rectangle() {
        length = 4;
        width = 8;
    }

    /**
     * Constructor of rectangle where length is given
     * @param _length the length of the rectangle
     */

    public Rectangle(double _length) {
        length = _length;
        width = 8;
    }

    /**
     * constructor of rectangle where length and width are given
     * @param _length the length of the rectangle
     * @param _width the width of the rectangle
     */

     public Rectangle(double _length, double _width){
        length = _length;
        width = _width;
    }

    /**
     * Gets the length of the Rectangle
     * @return The length of the Rectangle
     */
    public double getLength(){return length;}

    /**
     * Gets the width of the Rectangle
     * @return The width of the Rectangle
     */
    public double getWidth(){return width;}

}