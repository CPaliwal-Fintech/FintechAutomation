package pkg;

import org.testng.annotations.Test;

public class UsersAPITest {
    @Before
    public void setup() {
        RestAssured.baseURI = "http://localhost:8080/users";
    }
    
    @Test
    public void givenUrl_display_response_body() {
        
        Header authorizationHeader = new Header("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0OUB0ZXN0LmNvbSIsImV4cCI6MTUyNjY1NDgzMn0.Tmv4blwxuiMIZzKar6uLNOKPRDIDJ6nGBPwy6UauNi287dEl0xZCD31SUCfXhVpqJcZdY4JlX99RihAiRj-mIQ");
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header(authorizationHeader);
        
        Response response = httpRequest.get("/tov5c2VC2c1RKXeM80rCtgXVmGN6Kj");
      
        System.out.println("Response Body is =>  " + response.asString());
    }
}