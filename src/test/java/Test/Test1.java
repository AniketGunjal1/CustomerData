package Test;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Customer Management!!!!!!");
	}

	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	public Class<? extends Throwable> expected() {
		// TODO Auto-generated method stub
		return null;
	}

	public long timeout() {
		// TODO Auto-generated method stub
		return 0;
	}

}
