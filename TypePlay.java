public class TypePlay {

    /**
     * this is for playing around with primitive types!
     * all of the PRIMITIVE types are:
     * int, double, boolean, float, byte, long, short, and char :)
     *
     * int: a number that can have a value between the positive and negative of 0x7FFFFFFF (aka Integer.MAX_VALUE or +-2^31) , 32-bit
     * float: a floating point number (decimal)
     * double: a floating point number with more precision compared to a float, more used, but better if your number > float overflow
     * boolean: true or false
     * byte: for this, all you need to know is *very tiny number*
     * long: long number! , 64-bit
     * short: 16 bit signed integer.. max 32767, min -32768
     * char: 'a' single letter
     *
     * you can play around with printing these things, declaring variables, like:
     *
     * int x = 0; or even
     * int x; to define somewhere else
     * char a = 'a';
     *
     * variable declaration rules:
     * typically, variables are declared in camelCase where they start in lowercase, and for each word have an uppercase
     * example:
     *
     * int justAnotherNumber = 1;
     *
     * there of course, are exceptions to that 'rule', but you don't need to know any of them other than that class names should start
     * with an uppercase letter.
     *
     * math operators: +, -, %, /
     * boolean operators: >, <, <=, >=, !=, ==
     *
     *
     * what you can do with this class: declare and play around with variable types, and print what you do so you can see in the console output
     * what you just did! :) there's also a small method that allows you to add integers together :)
     */

    public static void main(String[] args) {
        System.out.println(addNumbers(3, 5, 6, 7));
    }


    /**
     * here is a fun little method that will add all the input numbers and return them :)
     * private : the access modifier, saying what classes can see it. since it's private, only this class can see it.
     * static : making it accessible outside of the constructor (but you don't need to know what that is yet!)
     * int : the return type, when calling this, it will give you an integer back.
     *
     * @param n : all of the integers being put in to this method
     * @return : the sum of the method inputs
     */
    private static int addNumbers(int ... n) {
        int e = 0; // declare and initialize method variable
        for (int i : n) { // a loop for each value in int[], but for now we will just say group of inputs
            e = e + i; // set e to the pre-existing value of e, plus a value of inputs
        }
        return e; // give e with it's new value back :)
    }

}
