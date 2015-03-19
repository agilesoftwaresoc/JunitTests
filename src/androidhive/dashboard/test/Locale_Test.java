package androidhive.dashboard.test;

import com.aptitudeguru.dashboard.DatabaseHandler;
import com.aptitudeguru.dashboard.TestPage;

import android.test.InstrumentationTestCase;
import junit.framework.TestCase;


	

public class Locale_Test extends InstrumentationTestCase {

public Locale_Test() {
super();
}

TestPage test;
String local;



protected void setUp(){
	test = new TestPage();
	local = test.getLocal().toString();
 
}

public void testNull(){
		assertNotNull(local);
}

public void testGb(){
		assertEquals("en_GB", local);
}

public void testFR(){
	 assertEquals("fr_FR", local);
}
 
public void testUs(){
	assertEquals("en_US",local);
}
}
