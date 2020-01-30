package javapractise.factorydesignpattern;

public class Main {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer laptop = computerFactory.getComputer("laptop", "2.0 GB", "2.5GHz");
        Computer server = computerFactory.getComputer("", "2.0 GB", "2.5GHz");
        if (laptop != null && server != null) {
            System.out.println(server.toString() + laptop.toString());
        }
    }
}
