package net.sf.jabref.exporter.layout.format;

import net.sf.jabref.exporter.layout.ParamLayoutFormatter;

import org.junit.Assert;
import org.junit.Test;

public class DefaultTest {

    @Test
    public void testSimpleText() {
        ParamLayoutFormatter a = new Default();
        a.setArgument("DEFAULT TEXT");
        Assert.assertEquals("Bob Bruce", a.format("Bob Bruce"));
    }

    @Test
    public void testFormatNull() {
        ParamLayoutFormatter a = new Default();
        a.setArgument("DEFAULT TEXT");
        Assert.assertEquals("DEFAULT TEXT", a.format(null));
    }

    @Test
    public void testFormatEmpty() {
        ParamLayoutFormatter a = new Default();
        a.setArgument("DEFAULT TEXT");
        Assert.assertEquals("DEFAULT TEXT", a.format(""));
    }

    @Test
    public void testNoArgumentSet() {
        ParamLayoutFormatter a = new Default();
        Assert.assertEquals("Bob Bruce and Jolly Jumper", a.format("Bob Bruce and Jolly Jumper"));
    }

}
