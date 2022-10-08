public class HDD {
    String name;
    int memory;
    String type;

    public HDD() {
    }

    public HDD(String name, int memory, String type) {
        this.name = name;
        this.memory = memory;
        this.type = type;
    }

    public String hddInfo(){
        return " HDD: "+this.name+"  Память: "+this.memory+"TB"+"  Тип: "+this.type+"  ";
    }
}