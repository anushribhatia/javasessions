public class Typecasting {
    public static void main(String[] args) {

        // int a = 20.9;
        // both double and float can hold decimal values
        double d = 30.8;
        // float f = 2.8;
        // 2.8 is treated as a double 

        //  1 byte : 8 bits
        // 
        System.out.println(Float.SIZE); // 32 bits : 4 bytes
        System.out.println(Double.SIZE); // 64 bits : 8 bytes
        // space will it occupy in the memory
        // 8.9 -> double: 8 bytes

        // typecasting -> when one data is converted into another data type
        double d1 = 10;
        double d2 = 3;
        int i = 30;

        // System.out.println(d1); // 10.0     5
        // System.out.println(d2); // 3.0
        // System.out.println(i); //
        // 5


        float f1 = 10f;
        float f2 = 3f;

        System.out.println(d1 / d2); // 10.0/3.0 => 3.3333333333333335  8 bytes
        System.out.println(f1 / f2); // 10.0/3.0 => 3.3333333  4 bytes
        // 10/3 = 3




        // 7.5 : double
        // gallon
        // ounce
        // litres
        // System.out.println(d); // 30.8
        // System.out.println(f); // 2.0





        
    }
}