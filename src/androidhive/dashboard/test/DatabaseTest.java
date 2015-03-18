package androidhive.dashboard.test;

import com.aptitudeguru.dashboard.DatabaseHandler;

import android.test.InstrumentationTestCase;
import junit.framework.TestCase;


	

public class DatabaseTest extends InstrumentationTestCase {

public DatabaseTest() {
super();
}

private DatabaseHandler db;
private int count;

protected void setUp() {
db = new DatabaseHandler(this.getInstrumentation().getTargetContext().getApplicationContext());

count= db.getCppCount();
}

public void test(){
	assertNotNull("Null", count);
}

public void test2(){
 assertEquals(2,count);
}
}
