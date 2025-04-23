public class Typcasting_cont {
    public static void main(String[] args) throws Exception {
        int a = 10; // whole number
        System.out.println(a);

        // assigning integer value to a double value
        // int occupies: 4 bytes
        // double occupies: 8 bytes
        // 20 is implicity converted to a double value
        double d = 20; // decimal number

        // 1 small bucket
        // 1 large bucket
        System.out.println(d); // 20.0

        int t = (int)20.8;
        System.out.println(t); // 20
        // 20.8 is a double value? 


        int num = 40;
        // implicit type casting
        double y = num / 10; // double y = 4;
        System.out.println(y); // 4.0

        double d1 = 20.5/10;
        System.out.println(d1); // 2.05

        double d2 = 30.0;
        int i1 = 23;
        double d3 = i1/5; // 23/5 => 4.0
      
        System.out.println(5 / 2.0 * 7);

        int b = (int)8.2 / 4;
        System.out.println(b);

        int c = (int)(30.4 / 2); // 15

        double d4 = (double)(8 / 3); // 20.0
        System.out.println(d4);

        double d5 = (double)(8) / 3; // 2.6
        System.out.println(d5);
        // double d4 = (double)(2); // 2.0

        // 5 / 2 * 7  => int / double
        // 2 * 7  = 14
        // 5 / 2 * 7.0

    }
}
// Typecasting.:
// type : one data type into another
// int - double
// double to int

// implicit type casting
// explicit type casting