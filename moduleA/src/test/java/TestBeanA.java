import org.junit.Test;
import org.junit.Assert;

public class TestBeanA
{
    private BeanA a = new BeanA();

    @Test
    public void testA() {
        Assert.assertNotNull(a);
        System.out.println("\n\n TestBeanA#testA() succeeded! \n\n");
    }
}
