import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertlist {
@Test
public void Demo()
{
List<String> li = new ArrayList<String>();
li.add("ram");
li.add("pratik");
li.add("ruturaj");
li.add("true");
		List<String> l2 = new ArrayList<String>();
		li.add("ram");
		li.add("pratik");
		li.add("ruturaj");
		li.add("true");
		Assert.assertEquals(li, l2);
		System.out.println("true");
}
}