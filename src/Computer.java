public class Computer {
    int price;
    String model;
    HDD hdd;
    RAM ram;

    public Computer(int price, String model) {
        this.price = price;         //есть вопросик по этой строчке
        this.model = model;         //есть вопросик по этой строчке
        hdd=new HDD();
        ram=new RAM();
    }

    public Computer(int price, String model, HDD hdd, RAM ram) {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void compinfo(){
        System.out.println("Цена: "+this.price+"$"+"  Модель: "+this.model +this.hdd.hddInfo() + this.ram.ramInfo());
    }

}