package javapractise.switchcase;

public class Main {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        //System.out.println(functionTest.switchCase());
        functionTest.switchCase();
    }
}
// case requires constant expression as its value(just. And since || , && expression is not a compile time constant, it is not allowed.
//There is no such operator in switch statements. The switch statement operates on a single variable which is a value type or a string

//break is used to terminate a statement sequence.If break is omitted,execution will continue on to the next case.
//It is sometimes needed to have multiple cases without break statements between them.

//BREAK & RETURN
//break and return is interchangeable in main function and in a void method.but inside a method,if the method has a return type, return must be used in place
//of break;break WON'T be used here.