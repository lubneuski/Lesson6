public class CreditCard {
    int nomerScheta;     //номер счета
    double money;        //текущая сумма на счету

    public CreditCard() {
    }

    public CreditCard(int nomerScheta, double money) {
        this.nomerScheta = nomerScheta;
        this.money = money;
    }

    public void outData(){
        System.out.println("Номер счета: "+this.nomerScheta + "  Сумма на счету: "+this.money);
    }

    public void calc(double n,int whatDo) {
        switch (whatDo) {
            case 1:
                this.money += n;
                System.out.println("Номер счета: "+this.nomerScheta +"  Сумма на счету: "+this.money); //исправить
                break;
            case 2:
                this.money -= n;
                System.out.println("Номер счета: "+this.nomerScheta +"  Сумма на счету: "+this.money); //исправить
                break;
        }
    }
}