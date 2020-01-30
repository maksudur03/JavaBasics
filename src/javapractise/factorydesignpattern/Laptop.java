package javapractise.factorydesignpattern;

public class Laptop extends Computer {
    private String ram;
    private String processor;

    public Laptop(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getProcessor() {
        return this.processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
