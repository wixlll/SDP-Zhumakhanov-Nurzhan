public class Server extends Computer { // create Server class with extention to Computer class
    private String RAM;
    private String HDD;
    private String CPU; // Make all value string
    public Server(String ram, String hdd, String cpu){
        this.RAM=ram;
        this.HDD=hdd;
        this.CPU=cpu; // rename and mark the value
    }
    @Override
    public String getRAM() {
        return this.RAM; // Make specification for RAM
    }
    @Override
    public String getHDD() {
        return this.HDD;// Make specification for HDD
    }
    @Override
    public String getCPU() {
        return this.CPU; // Make specification for CPU
    }
}