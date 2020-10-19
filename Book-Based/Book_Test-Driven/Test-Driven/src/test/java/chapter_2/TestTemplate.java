package chapter_2;

import org.junit.Assert;
import org.junit.Test;

public class TestTemplate {
    @Test
    public void oneVariable() throws Exception{
        Template template = new Template("Hello, ${name}");
        template.set("name","Reader");
        Assert.assertEquals("Hello Reader",template.evaluate());
    }

    @Test
    public void differentValue() throws Exception{
        Template template = new Template("Hi ${name}");
        template.set("name","someone else");
        Assert.assertEquals("Hi, someone else",template.evaluate());
    }
}
