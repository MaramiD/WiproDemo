package resources;

import org.testng.annotations.DataProvider;

public class TestData {
@DataProvider(name="data")
public Object getData() {
	Object[][] mob= {{"7406954052","Marami@123","65-inch TV"}};
	return mob;
}

}
