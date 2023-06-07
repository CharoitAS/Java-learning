package mari;

public class CoinsStack {
    private final int coinValue;
    private int amount = 0;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    public int getCoinValue() {
        return coinValue;
    }

    public CoinsStack(int value) {
        coinValue = value;

    }
    public void putCoin() {
        amount = amount + 1;
        printAmount();
    }

    public void printAmount() {
        System.out.println(toString());
    }

    public int getRub() {
        return amount*coinValue; 
    }
    
    public String toString() {
       return "С номиналом " + coinValue + " руб. - " + amount + " шт.";
    }

    
}