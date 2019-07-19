package shuai.hou01;

import static junit.framework.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String results = hello.sayHello("litingwei");
        assertEquals("Hello litingwei!",results);
    }
}
