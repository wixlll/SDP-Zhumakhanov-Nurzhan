public abstract class Computer { // Create abstract class
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU(); // Make in only String value
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU(); // representation the specified RAM,HDD and CPU
    }
}