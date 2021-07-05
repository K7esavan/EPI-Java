
//always use Double.compare() or Float.compare() to compare these values
public class ComparingFloatingPointNumbers {

    static boolean compareValues(float a, float b) {
        return Float.compare(a, b) == 0;
    }

    static boolean compareValues(double a, double b) {
        return Double.compare(a, b) == 0;
    }

    public static void main(String args[]){

        System.out.println(compareValues(10.20f, 10.20f));
        System.out.println(compareValues(10.20, 10.20));
        System.out.println(compareValues(10.21, 10.20));
    }
}
