// Output can be can be printed in 3 ways in java.

class J2_Output {
    public static void main(String[] args) {
        
        // 1st way is - System.out.print("what you want to print");
        
        System.out.print("Hello World");
        
        /* 
         We use print when we want the cursor to remain
         in the same line i.e when the "Hello World" is
         printed the cursor will remain in the same line.
        */

        // 2nd way is - System.out.println("what you want to print");

        System.out.println("Hello World");

        /*
         When println is used instead of print then the
         cursor will jump to the next line after pronting.
         If we take the example above then here, the cursor
         will jump to next line after pronting “Hello World”. 
        */
        
        /* 
         3rd way - /n is not a method to print something,
         but ir adds a new line whereever it is used.
        */

        System.out.println("Hello\nWorld");

        /* 
         \n works same as println \n stands for new line,
         in above example we’ve used \n between hello and
         world, Now “Hello” will be printed in first line
         and “World” will be printed in next.
        */
    }
}

// Here System is a class in java lang package
// print is a pre defined function in System class
/*
 Out is a variable and its default value is null which means the output will be printed on command line, we can change the value of out to get output somewhere else 
*/
