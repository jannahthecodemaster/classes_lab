public class Rectangle {
    private int length; //cannot access outside of this class
    private int width;
    private int area;
    private boolean isSquare;


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.isSquare = false;
    }
     public int getArea() {
         area = this.length * this.width;
         return area;
        }

        public boolean isSquare(){
        if (length == width) { //highlight text and shift + 9 will put it all into brackets, or quotation marks etc.
            isSquare = true;
        }
        return isSquare;
        }


        }



