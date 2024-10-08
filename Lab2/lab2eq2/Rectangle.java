
public class Rectangle {
    int width = 1;
    int length = 1;
    int area;
    int perimeter;

    //set method
    public void setWdith(int newWidth){
        width = newWidth;
        if (newWidth < 0 || newWidth > 40) {
            System.out.println("Invalid width");
        }
    }
    public void setLenght(int newLenght){
        length = newLenght;
        if (newLenght < 0 || newLenght > 40){
            System.out.println("Invalid lenght");
        }
    }
    public void findArea(){
        area = (length * width);
    }
    public void findPermieter(){
        perimeter = 2 * (length +width);
    }

    //get method
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public int getArea(){
        return area;
    }
    public int getPerimeter(){
        return perimeter;
    }

    //to string
    public String toString(){
        return "Width = " + width + ". Length = " + length + ". Area = " + area + ". " + "Permieter = " + perimeter + ".";
    }

    //default constructor
    public Rectangle(){
    }
    //constructor
    public Rectangle (int width, int length){
        setWdith(width);
        setLenght(length);
        findArea();
    }
    //for printing rectangle
    public void printRectangle() {
        if (width < 3 || length < 3) {
            // if width or length is too small, print a filled rectangle
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println(); // newline after each row
            }
        } else {
            // Print hollow rectangle
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < width; j++) {
                    // print '*' on the borders (first/last row or first/last column)
                    if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                        System.out.print("*");
                    } else {
                        // print space inside the rectangle
                        System.out.print(" ");
                    }
                }
                System.out.println(); // newline after each row
            }
        }
    }

}



