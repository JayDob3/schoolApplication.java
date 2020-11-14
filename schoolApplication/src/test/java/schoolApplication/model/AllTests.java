package schoolApplication.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllModelTests.class, AllServiceTest.class, TestClass.class, TestStudent.class,
		TestStudentService.class })
public class AllTests {

}
