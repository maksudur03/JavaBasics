package javapractise.accessmodifier;

public class Main {
    public static void main(String[] args) {

        //A variable's lifecycle lies in between the curly braces.So, in the changeFinal method changes the value of the
        //final variable within the method's lifecyle.But the next sout shows that hello's  value is not change
        final String hello="HENLO";
        String hello2="Not FINAL";

        //Can't print as it is private
        //System.out.println(PI_CONST);

        //Create class0 instance
        AccessModifier class0= new AccessModifier();
        //Will print the final string in class 0
        //System.out.println(class0.FIB);

        //changing value of FIB
        //class0.FIB="Trying to change";
        //shows error

        System.out.println(hello);//printing instance variable
        class0.changeFinal(hello);//printing local variable
        System.out.println(hello);//printing instance variable
//////////NOTE!!!!:EVEN FINAL INSTANCE VARIABLES CAN BE LOCAL VARIABLE
        //Basically final means that another object or value can be assigned to that reference. the reference or variable  is final.


        /*
        int arr[] = {1, 2, 3};

        // final with for-each statement
        // legal statement
        for (final int i : arr)
            System.out.print(i + " ");
         */
    }
}
