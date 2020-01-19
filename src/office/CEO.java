package office;

public class CEO extends Technology {
    private String name;
    private static CEO ceo;

    private CEO(String name){
        this.name= name;
    }

    public static CEO getCEO(String name) {
        if (ceo == null) {
            return new CEO((name));
        }
        return ceo;
    }

    public String getName(){
        return name;
    }
}

