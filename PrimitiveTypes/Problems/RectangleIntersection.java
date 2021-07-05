class Rectangle {

    int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x; this.y = y;
        this.width = width; this.height = height;
    }
}

public class RectangleIntersection {

    static boolean isIntersect(Rectangle A, Rectangle B) {
        return A.x <= (B.x + B.width) && A.y <= (B.y + B.height) && A.x + A.width >= B.x && A.y + A.height >= B.y;
    }

    public static void main(String args[]){


    }
}
