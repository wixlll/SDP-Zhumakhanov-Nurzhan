public class TestFactory {// create class
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz"); // give value for Computer factory
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);}}//make output
