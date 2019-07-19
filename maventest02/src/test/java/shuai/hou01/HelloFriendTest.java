package shuai.hou01;

import static junit.framework.Assert.assertEquals;
import shuai.hou01.Hello;
import org.junit.Test;

public class HelloFriendTest {
    @Test
    public void testHelloFriend(){
        HelloFriend helloFriend = new HelloFriend();
        String results = helloFriend.sayHelloToFriend("litingwei");
        assertEquals("Hello litingwei! I am John",results);
    }
}
