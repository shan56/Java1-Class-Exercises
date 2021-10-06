public class ExampleString {
    public static void main(String args[]) {


        String msg = "Simply", msg2 = "Beatiful";
        String newMsg;

        newMsg = msg.concat(msg2);
        System.out.println("concat: " + newMsg);

        System.out.println("msg+msg2:" + msg + msg2);

        System.out.println("newMsg: index of Beat is " + newMsg.indexOf("Beat"));

        System.out.println("newMsg: index of XYZ is " + newMsg.indexOf("XYZ"));

        System.out.println("Compare msg with Simply: " + msg.compareTo("Simply"));
        System.out.println("Compare msg with simply: " + msg.compareTo("simply"));
        System.out.println("Compare msg with Timpley: " + msg.compareTo("ZZZZZZZZ"));


        System.out.println("Equals msg with Simply: " + msg.equals("Simply"));
        System.out.println("Equals msg with simply: " + msg.equals("simply"));

        System.out.println("charAt index 3: " + msg.charAt(3));


        int salary = 9999;
        double rate = 0.05;

        System.out.printf(">>>%d<<<\n", salary);
        System.out.printf(">>>%5d<<<\n", salary);
        System.out.printf(">>>%-5d<<<\n", salary);
        System.out.printf(">>>%05d<<<\n", salary);
        System.out.printf(">>>%,d<<<\n", salary);

        System.out.printf("Salary is $%,d\trate is %.2f\tOne year increase is $%.2f\nNew salary is $%,.2f\n",
                salary, rate, salary*rate, salary+(salary*rate));
        newMsg = msg.format("rate is %.2f", rate*100);
        System.out.println(newMsg + "%");
    }
}
