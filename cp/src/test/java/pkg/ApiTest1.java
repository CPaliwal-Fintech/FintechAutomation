package pkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ResponseBodyExtractionOptions;

public class ApiTest1 {
	
  @Test
  public void FirstApiTest() {
	  
	 Response rest= RestAssured.post("http://wwwtest.vcmpartners.com/xpwebservice/index.aspx");
	 
	 //It is for compare code
	 int code=rest.getStatusCode();
	 
	 //It is for verifying body text
	 ResponseBody bodytext=rest.getBody();
	 
	 String bodyStringValue = bodytext.asString(); 
	 
	 //Verifying body text
	 Assert.assertTrue(bodyStringValue.contains("WebAPI is running fine..."));
	 
	 System.out.println("Status code is =" + code);
	 System.out.println(bodyStringValue);
	 
	 Assert.assertEquals(code, 200);
	  
  }
}
