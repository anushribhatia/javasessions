public class April_20_Operators {

    public static void main(String[] args) {
        // Arithmetic operators:  +, -, /, *
        // Comparision operators: >, <, ==, !=
        // boolean : true/false
        System.out.println(4 <= 4); // less than or equal to : true
        System.out.println(1 <= 4); // less than or equal to : true
        System.out.println(2 >= 4); // less than or equal to : true
        //

        // Logical Operators? : 
        // and: both the conditions should be true,  && 
        // or: either on of them should be true,     ||
        // not : !
        // score more than 90 or complete all the assignments : 
        // mathscore  is more than 90 and sciencescore is > 60 
        // mathScore > 90
        // scienceScore > 60 


        System.out.println(4 < 9 && 7 < 4); // true && false => false
        System.out.println(4 < 9 || 7 < 4); // true || false => true
        System.out.println(!(7 > 7)); // true
        // 7 <= 7
        // 7 is not greater than 7
        // 7 is less than equal to 7: true



        // !(6 == 7)  -> 
        // 6 != 7  true
        // 6 is not equal to 7 : 
    
        // !(2 != 2) => 
        // 2 == 2 : true
        // !(5 < 4)
        // 5 >= 4 : false

        // !(9 <= 7) :: 9 is not 
        // 9 > 7 : true
        // 9 is not less than or equal to 7 

        // !(6 >= 9)
        // 6 is not greater than or equal to 9
        // 6 < 9: true 

        // a,b,c are three integers
        // !(a < b)
        // a is not less than b 
        // a >= b

        // (1 > 2 || 8 > 1): true

        // !((a > b) && (c == d)) : false
        // a <= b || c!=d : 

        //a is not greater than b 
        // c is equal to d
    
    }
}

/*
A    B     A && B
T    T       T
T    F       F
F    T       F      
F    F       F 

OR?
A  B   A || B
T T    T
T F    T
F T    T
F F    F






*/