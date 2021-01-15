package dataProvider;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class  DataProviderClass {

	
	@DataProvider(name="DataTable")
	public Object[][] dataTable(){
		
		Map<Integer, Integer> dataMap = new HashMap<Integer, Integer>();
		dataMap.put(1,2);
		dataMap.put(2,3);
		dataMap.put(3,4);

		return new Object[][] {{dataMap}};
		
		
	}
	@DataProvider(name="methodacceptingDataTable")
	public Object [][] methodacceptingDataTable(Method m) {
		
		if(m.getName().equals("DataProvidingMethod"))
		{
			Map<Integer, Integer> dataMap = new HashMap<Integer, Integer>();
			dataMap.put(4,5);
			dataMap.put(5,8);
			dataMap.put(9,4);
			

			return new Object[][] {{dataMap}};
		}
		
		else
			return new Object[][] {{}};			
		
	}
	
}
