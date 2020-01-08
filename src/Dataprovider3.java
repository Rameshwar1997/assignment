import org.testng.annotations.Test;

public class Dataprovider3 {
@Test(dataProviderClass=Dataprovider2.class,dataProvider="createUser")
public void test(String user,String password)
{
	System.out.println(user);
	System.out.println(password);
}
}
