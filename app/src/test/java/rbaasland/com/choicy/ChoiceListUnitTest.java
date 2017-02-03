package rbaasland.com.choicy;

import org.junit.Before;
import org.junit.Test;
import rbaasland.com.choicy.core.ChoiceList;
import static junit.framework.Assert.assertEquals;

public class ChoiceListUnitTest {
    ChoiceList choices;

    @Before
    public void initialize() {
        choices = new ChoiceList();
    }

    @Test
    public void title_isCorrect() throws Exception {
        choices.setListTitle("Restaurant List");

        assertEquals(choices.getListTitle(), "Restaurant List");
    }

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}
