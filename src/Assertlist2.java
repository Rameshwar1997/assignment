import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assertlist2 {
@Test
public void aseertdemo() {
	List st = new ArrayList<>();
	st.add("ram");
	st.add(5);
	st.add(true);
	List<Object> tt = new ArrayList<>();
	tt.add("ram");
	tt.add(5);
	tt.add(true);
	Assert.assertEquals(st,tt);
	SoftAssert ss = new SoftAssert();
	ss.assertEquals(st, tt);
	ss.assertAll();
	System.out.println("true");
}
}

