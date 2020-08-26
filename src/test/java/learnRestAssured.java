import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.response.ResponseBody;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class learnRestAssured {
    public static final int pageNumber = 1;
    public static final int pageSize = 21;

    @Test
    public void postRequest() {
        Response postResult = given()
                .param("address", "")
                .param("email", "")
                .param("name", "test")
                .param("phone", "")
                .header("Content-Type","application/json")
                .post("http://35.189.151.113:3000/payment");
        short statusCode = (short) postResult.getStatusCode();
        String  errorMessage= postResult.body().asString();
        System.out.println(errorMessage);
        assertThat((int)statusCode,equalTo(400));
    }

    @Test
    public void getRequest() {
        Response getResult = given()
                .queryParam("page", pageNumber)
                .queryParam("limit", pageSize)
                .when().get("http://35.189.151.113:3000/product");
        ArrayList<HashMap> listProducts = getResult.then().extract().path("");
        short statusCode = (short) getResult.getStatusCode();
        System.out.println("The get response status is " + statusCode);
        assertThat(listProducts.size(), equalTo(pageSize));
        assertThat((int) statusCode, equalTo(200));
    }


}