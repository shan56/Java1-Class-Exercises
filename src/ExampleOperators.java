public class ExampleOperators {
    public static void main(String[] args) {
        int a = 5, b=10;


        System.out.println(a++);
        System.out.println(a);

        System.out.println(++a);
        System.out.println(a);

        System.out.print("a+b=");
        System.out.println(a+b);

        System.out.print("b%a=");
        System.out.println(b%a);

        System.out.print("a += 5: ");
        a += 5;
        System.out.println(a);

        System.out.print("a == b: ");
        System.out.println(a == b);
        System.out.print("a <= b: ");
        System.out.println(a <= b);
        System.out.print("a != b: ");
        System.out.println(a != b);


    }
}
