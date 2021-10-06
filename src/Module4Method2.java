public class Module4Method2 {

    static void myMethod() {
        System.out.println("Hello");
    }

    static int myAdd(int x, int y) {
        return x+ y;
    }


    static int myAdd(int x ) {
        return x + 10;
    }

    static String myAdd(String x, String y, String z) {
        return x+ " " +y + z;
    }


    public static void main(String args[]) {
        myMethod();
        myMethod();
        myMethod();


        System.out.println(myAdd(3, 9));
        System.out.println(myAdd(10));

        //* exampe 2
        System.out.println(myAdd("Hello", "World", "!"));
        // */

    }
}
