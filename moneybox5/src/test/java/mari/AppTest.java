package mari;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void coinsStackEmpty() 
    {
        CoinsStack stack = new CoinsStack(1);
        Assert.assertEquals(stack.getAmount(), 0); //изначально монет в стопке нет
        Assert.assertEquals(stack.getRub(), 0); // начальная стоимость стопки 0 рублей
        Assert.assertEquals(stack.getCoinValue(), 1); // в стопке однорублёвые монеты
    }
    @Test
    public void checkPutCoin() 
    {
        CoinsStack stack = new CoinsStack(1);
        stack.putCoin(); // положить монету
        Assert.assertEquals(stack.getAmount(), 1); // в стопке одна монета
        Assert.assertEquals(stack.getRub(), 1); // в стопке один рубль
        Assert.assertEquals(stack.getCoinValue(), 1); // в стопке однорублёвые монеты
    }
    @Test
    public void checkPutCoin2() 
    {
        CoinsStack stack = new CoinsStack(5);
        // дважды положить монету
        stack.putCoin();
        stack.putCoin();
        Assert.assertEquals(stack.getAmount(), 2); // в стопке две монеты
        Assert.assertEquals(stack.getRub(), 10); // в стопке десять рублей
        Assert.assertEquals(stack.getCoinValue(), 5); // в стопке пятирублёвые монеты
    }
    @Test
    public void checkPutCoin3() 
    {
        CoinsStack stack = new CoinsStack(10);
        // 100 раз положить монету
        for ( int i = 0; i <100; i ++) {
            stack.putCoin();
        }
        
        Assert.assertEquals(stack.getAmount(), 100); // в стопке сто монет
        Assert.assertEquals(stack.getRub(), 1000); // в стопке тысяча рублей
        
    }    

    @Test
    public void checkPutCoin4()
    {
        CoinsStack stack = new CoinsStack(1);
        Assert.assertEquals(stack.getAmount(), 0); //изначально монет в стопке нет
        Assert.assertEquals(stack.getRub(), 0); // начальная стоимость стопки 0 рублей
        Assert.assertEquals(stack.getCoinValue(), 1); // в стопке однорублёвые монеты
        Assert.assertEquals(stack.toString(), "С номиналом 1 руб. - 0 шт.");
    }  
        
}
