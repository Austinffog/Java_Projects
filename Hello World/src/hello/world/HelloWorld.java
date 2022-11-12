/*
 
 */
package hello.world;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        //Print Statements
        System.out.println("Hello World");
        System.out.print(123);
        
        //Variables and Primitive Data Types
        //Whole numbers
        //byte 2^8 -123 -> 127
        //short 2^16 -32,768 -> 32,767
        //int -2^31 -> 2^31-1
        //long -2^63 -> 2^63 -1
        
        //short number1 = 10;
        int x;
        x = 15;
        System.out.println(x);
        
        //Decimals
        //float 32-bit IEEE
        //bouble 64-bit IEEE
        
        float y= 3.14f;
        System.out.println(y);
        
        //boolean
        //char
        boolean trueorfalse = false;
        System.out.println(trueorfalse);
        
        char someCharacter = 'r';
        System.out.println(someCharacter);
        
        System.out.println(1 / 2); //wrong
        System.out.println((double)1 / 2);
        
        int num = 97;
        char a = 'a';
        System.out.println((int) a);
        System.out.println((char)num);
        
        String firstname = "Pedro";
        String lastname = "Mercado";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println("Pedro said, \"I love chicken\" ");
        System.out.println("\t Pedro \n Said");
        
        int num1 = 5;
        int num2 = 7;
        
        int result = num1 + num2;
        System.out.println(num1 + " + "+num2 + " = " + result);
        
        boolean answer = num1 >num2;
        System.out.println(num1 + " > " + num2 + " = " + answer);
        
        int number = 1;
        if(number> 2)
            System.out.println("Number is greater than 2");
        else
            System.out.println("Number is less than 2");
        
        int digit = 7;
        if(digit % 2 == 1){
            System.out.println("Odd number");
            if(digit < 10){
                System.out.println("Digit is less than 10");
            }
            else
                System.out.println("Number is even");
        }
        
        int numbers = 9;
        if(numbers % 2 == 1){
            if (numbers == 9)
                System.out.println("Number is odd and equal to nine");
        }
        
        int digits = 11;
        if (digits == 11 || digits == 13)
            System.out.println("Digits is equal to 11 or 13");
        
        int d = 22;
        int w = 78;
        int min;
        if (d < w)
            min = d;
        else
            min = w;
        System.out.println(min);
        
        int s = 67;
        int u = 88;
        int minimum = s < u ? s:u;
            System.out.println(minimum);
            
        //Switch Statement
        int userInput = 1;
//        if (userInput == 1)
//            System.out.println("January");
//        else if (userInput == 2)
//            System.out.println("February");
//        else
//            System.out.println("Invalid");
        
        switch(userInput){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("Febraury");
            break;
            default: System.out.println("Invalid");}
            
            //Increment and Decrement
            //Post Increment
            int f = 5;
            System.out.println(f++);
            //Post decrement
            int F = 7;
            System.out.println(F--);
            //Pre Increment
            int D = 9;
            System.out.println(++D);
            //Pre Decrement
            int S = 4;
            System.out.println(--S);
            
            //for loop
            for (int I = 0; I < 5; I++){
                System.out.println("I has the value: " + I);
            System.out.println("Hi");}
            
            //while loop
            int K = 0;
            while(K < 2){
                System.out.println("K has the value: " + K);
            System.out.println("Hi");
                K++;
            }
            
            //do while statement
            //always executes code once
            int A = 0;
            do{
                System.out.println("Hi There");
                A++;
            }while (A < 0);
           
            //Nested for loops
            for(int C = 0; C < 3; C++){
                System.out.println("The value of C is " + C);
          
            for (int J = 0; J <2; J++){
                System.out.println("The value of J is " + J);
            }
            }
            
           //break and continue
            for (int Q = 0; Q < 7; Q++){
                if(Q == 3)
                    break;
                System.out.println("Q has a value of " + Q);}
                
                for (int R = 0; R < 7; R++){
                if(R == 3)
                    continue;
                System.out.println("R has a value of " + R);
            }
                //Array
                int [] E = {1,2,1,2};
//                int [] E = new int [4];
//                E[0] = 1;
//                E[1] = 2;
//                E[2] = 1;
//                E[3] = 2;
                for (int V = 0; V < E.length; V++){
                    System.out.println(E[V]);
                }
                
                //MultiDimensional Arrays (2D)
                 int [] [] L = {{1,2,3},{4,5,6},{7,8,9}};
                //ystem.out.println(L[2][1]);
                 for (int l = 0; l < L.length; l++){
                     for(int Y = 0; Y < L[l].length; Y++){
                         System.out.println(L[l][Y]);
                     }
                     System.out.println();
                 }
                 
                 //Method
                 //add(); call in the main method
                 //public static void add(int num1, int num2)
                 //System.out.println(num1 + num2)
                 
                 //Recursion
                 //4!
                 //4 * 3!
                 //4 *3 * 2!
                 //System.out.println(factorial(4)); print in main method
                 //public static int factorial(int num){
                 //base case
                 //if (num <= 1)
                  //return 1;
                 //return num * factorial(num - 1);
    }                 
}
        

        
        
        
    
    
