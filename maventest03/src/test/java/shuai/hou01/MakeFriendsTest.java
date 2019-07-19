package shuai.hou01;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import shuai.hou01.HelloFriend;
import shuai.hou01.MakeFriends;
public class MakeFriendsTest {
    @Test
    public void testMakeFriends() {
        MakeFriends makeFriend = new MakeFriends();
        String str = makeFriend.makeFriends("litingwei");
        assertEquals("Hey,John make a friend please.", str);
    }
}