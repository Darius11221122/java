public class RectangleMethod{

    public static void main(String []args){
        Rectangle myRectangle = new Rectangle();
        //calls the set method for length and width
        myRectangle.setLenght(15);
        myRectangle.setWdith(10);
        //calls the find method for area and permieter
        myRectangle.findArea();
        myRectangle.findPermieter();

        System.out.println(myRectangle);
        myRectangle.printRectangle();
    }
}

//public class RectangleMethod{

//    public static void main(String []args){
//        Rectangle length = new Rectangle();
//        Rectangle width = new Rectangle();
//        Rectangle area = new Rectangle();

//        length.setLenght(2);
//        width.setWdith(4);
//        area.findArea();

//        System.out.println(length);
//    }

//}