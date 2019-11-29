package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testcases.EditaCustomerTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	EditaCustomerTestCase.class,
	EditaCustomerTestCase.class
})

public class AllTests {

}
