package Rest1;



import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AllProgrames {
	
		String get1="/api/users?page=2";
		String post1="/api/users";

		String put1="/api/users/2";
		String delete1="/api/users/2";

		@Test
		public void test1() {
			
			RestAssured.baseURI="https://reqres.in/";
			RequestSpecification req = RestAssured.given();
			Response res = req.request(Method.GET,get1);
			res.prettyPrint();
		}
		
			@Test
			public void test2()
			{
				RestAssured.baseURI="https://reqres.in/";
				RequestSpecification req = RestAssured.given();
				Response res = req.request(Method.POST,post1);
                res.prettyPrint();
			}
			
				@Test
				public void test3()
				{
					RestAssured.baseURI="https://reqres.in/";
					RequestSpecification req = RestAssured.given();
					Response res = req.request(Method.PUT,put1);
					res.prettyPrint();
				}
				
					@Test
					public void test4()
					{
						RestAssured.baseURI="https://reqres.in/";
						RequestSpecification req = RestAssured.given();
						Response res = req.request(Method.DELETE,delete1);
						res.prettyPrint();
					}
			
			
		}

