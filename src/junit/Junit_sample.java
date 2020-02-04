package junit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_sample {

	
		@Before
		public void a1()
		{
			System.out.println("This is Before");
		}
		@After
		public void b1()
		{
			System.out.println("This is After");
		}
		@Test
		public void c1()
		{
			System.out.println("This is Test1");
		}
			
		@Test
		public void d1()
		{
			System.out.println("This is Test2");
		}
			
		@Test
		public void e1()
		{
			System.out.println("This is Test3");
		}
			
		}

	


