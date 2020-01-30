package javapractise.factorydesignpattern;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String processor){
        if(type.equalsIgnoreCase("laptop")){
            return new Laptop(ram,processor);
        }
        else if(type.equalsIgnoreCase("server")){
            return new Server(ram,processor);
        }
        else
            return null;
    }
}
