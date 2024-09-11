package org.afob.limit;

import org.junit.Assert;
import org.junit.Test;
import org.afob.limit.LimitOrderAgent;
import java.math.BigDecimal;

public class LimitOrderAgentTest {

    @Test
    public void addTestsHere() {
        Assert.fail("not implemented");
    }

    @Test
    public void priceTickTest(){
        String productId="IBM";
        BigDecimal price=new BigDecimal(100);
        priceTick( productId, price);

    }
}