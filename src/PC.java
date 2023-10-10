public class PC extends Computer { // extend class PC by Computer
    private String RAM;
    private String HDD;
    private String CPU;// make all value as a string
    public PC(String ram, String hdd, String cpu){
        this.RAM=ram;
        this.HDD=hdd;
        this.CPU=cpu;// rename the value
    }
    public String getRAM() {
        return this.RAM; // Make specification for RAM
    }
    @Override
    public String getHDD() {
        return this.HDD; // Make specification for HDD
    }
    @Override
    public String getCPU() { // Make specification for CPUA
        return this.CPU;
    }
}