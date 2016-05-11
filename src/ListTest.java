
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;
/**
 * Created by Admin on 10.05.2016.
 */
public class ListTest {
    @Test
    public void getVariant(){
        Lab list = new Lab();
        assertEquals(0, list.Variant(6));
    }
    @Test
    public void testAddOneItem() {
        Lab list = new Lab();
        list.add(3);
        assertEquals(3, list.get(0));
    }

    @Test
    public void testAddSecondItem() {
        Lab list = new Lab();
        list.add(3);
        list.add(5);
        assertEquals(5, list.get(1));
    }

    @Test
    public void testFirstItemRemainsAfterAddingSecond() {
        Lab list = new Lab();
        list.add(3);
        list.add(5);
        assertEquals(3, list.get(0));
    }

}


