import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest extends MainClass

        //    Задание 1.
{
    @Test
    public void  testGetLocalNumber()
    {
        int b = this.getLocalNumber();
        assertEquals("не равно 14", 14, b);
    }

    //    Задание 2.

    @Test
    public void testGetClassNumber()
    {
        int number = this.getClassNumber();
        Assert.assertTrue("Число меньше 45",number > 45);

    }

    //    Задание 3.

    @Test
    public void  testGetClassString()
    {
        String a = this.getClassString();
        boolean contains;
        contains = a.contains("hello") | a.contains("Hello");
        if (!contains){
            Assert.fail("В строке нет hello или Hello");
        }

    }

//    Эксперимент

    @Test
    public void  testGetLocalNumber4()
    {
        assertNotEquals("равно 15", 15, getLocalNumber());
    }
}
