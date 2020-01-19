package office;



public class CTO extends Technology {
    //This is a singleton class as only one instance of this class will be created.
    private String name;

    private CTO() {
    }

    private CTO(String name){
        this.name=name;
    }

    //An instance of the class is declared beforehand.
    private static CTO cto;


    //This is the method to return the instance of the singleton class.
    public static CTO getCTO(String name){
        //This if-block ensures that only one instance will be  created.If there is no instance only one instance will be created.If there is already
        //an instance ,the if-block will not be executed and the method will always return the primarily created instance.
        ///*
        if(cto==null)
            cto = new CTO(name);
        return cto;
        //*/

        //if we don't write the previous block,many instance can be created of a private class
         //return new CTO(name);

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
