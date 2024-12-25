package com.restapiexample.dummy.requests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserByID {

    @Test
    public void deleteUser() {
        given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie","humans_21909=1")
                .pathParam("id",3)
                .when()
                .delete("/{id}")
                .then().log().all()
                .statusCode(204);

    }

}

