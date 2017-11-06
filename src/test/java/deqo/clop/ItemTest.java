package deqo.clop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {
    private Item item;
    int valeur = 5;

    @Test
    public void testGetValeurOK() throws Exception {
        item = new Item();
        item.setValeur(valeur);

        assertThat(item.getValeur(), is(valeur));
    }

    @Test
    public void setValeur() throws Exception {
        item = new Item();
        item.setValeur(valeur);

        assertThat(item.getValeur(), is(valeur));
    }

}