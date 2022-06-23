class NumRef{
    int value; 
}
class StringRef{
    String value;
}

public class Main {
    /* 1
    * Write a method that multiplies two numbers and 
    * stores the result in a variable that was passed 
    * in as a parameter. Make the calling method display 
    * the result of the multiplication. 
    */
    static void multiples(int a, int b, NumRef result){
        result.value = a * b;
    }

    /* 2
     * Modify the method above so that the calling 
     * method cannot see the result of the multiplication
     */
    static void multiplesHidden(int a, int b, NumRef result){
        result = new NumRef();
        result.value = a * b;
    }

    /* 3
     * Write a method that can modify a String that is passed in, 
     * in such a way that the calling method can see the modified 
     * new value for the String parameter
     */
    static void stringMod(StringRef stringParam){
        stringParam.value += " Modified";
    }

    /* 4
     * Write a method that takes a String parameter,
     * modifies it and shows that the calling method 
     * cannot see the modified value
     */
    static void stringModHidden(String testString){
        testString += " Modified";
    }


    public static void main(String[] args) {
        NumRef result = new NumRef(); 
        StringRef stringRes = new StringRef();
        stringRes.value = "Base Case";

        //1
        multiples( 4, 3, result);
        System.out.println(result.value);

        //2
        multiplesHidden( 5, 3, result);
        System.out.println(result.value);

        //3
        stringMod(stringRes);
        System.out.println(stringRes.value);

        //4
        String testString = "String Wrapper ";
        stringModHidden(testString);
        System.out.println(testString);
 
    }
}
