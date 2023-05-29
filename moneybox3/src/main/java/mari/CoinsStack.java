package mari;

public class CoinsStack {
    int coinValue;
    int amount = 0;

    public CoinsStack(int value) {
        coinValue = value;

    }
    public void putCoin() {
        amount = amount + 1;
        printAmount();
    }

    public void printAmount() {
        System.out.println("С номиналом " + coinValue + " руб. - " + amount + " шт.");
    }

    public int getRub() {
        return amount*coinValue; 
    }
    
}
