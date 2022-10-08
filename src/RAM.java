public class RAM {
    String name;
    int memory;

    public RAM() {
    }

    public RAM(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    public String ramInfo(){
        return "Ram: "+this.name+"  Память: "+this.memory+" GB";
    }
}