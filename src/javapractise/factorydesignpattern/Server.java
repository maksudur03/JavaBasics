package javapractise.factorydesignpattern;

public class Server extends Computer{
    private String RAM;
    private String Processor;

    public Server(String RAM, String processor) {
        this.RAM = RAM;
        Processor = processor;
    }
    @Override
    public String getRam() {
        return null;
    }

    @Override
    public String getProcessor() {
        return null;
    }

    @Override
    public String toString() {
        return "Server{" +
                "RAM='" + RAM + '\'' +
                ", Processor='" + Processor + '\'' +
                '}';
    }
}
