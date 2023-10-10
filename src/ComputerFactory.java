public class ComputerFactory { // Create the class
    public static Computer getComputer(String type, String ram, String
            hdd, String cpu){ // include value of type , ram ,hdd,cpu
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);// If PC equal to properties then represetation the PC
        else if("Server".equalsIgnoreCase(type)) // make previous step but for Server
        return new Server(ram,hdd, cpu);
        return null; // representation null
    }
}