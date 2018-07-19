import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void Equals() {
        Assert.assertEquals(6, new Calculate().Add(3, 3));
    }

    @Test
    public void True() {
        Assert.assertTrue(0 == new Calculate().Subtract(3, 3));
    }

    @Test
    public void False() {
        Assert.assertFalse(1 == new Calculate().Subtract(3, 3));
    }

    @Test
    public void NotNull() {
        Assert.assertNotNull(new Object());
    }

    @Test
    public void Null() {
        Object a=null;
        Assert.assertNull(a);
    }

    @Test
    public void SameObject(){
        Object a=new Object();
        Object b=a;
        Assert.assertSame(a,b);
    }

    @Test
    public void NotSameObject(){
        Object a=new Object();
        Object b=new Object();
        Assert.assertNotSame(a,b);
    }

    @Test
    public void ArrayEquals(){
        int[] a={1,2,3};
        //int[] b={1,2,3};  通过
        int[] b=a;  //通过
        assertArrayEquals(a,b);
    }
    
}