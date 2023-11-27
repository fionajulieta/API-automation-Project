package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

import java.sql.SQLOutput;

public class ApiStep {

    ApiPage apiPage;
    public ApiStep(){
        this.apiPage=new ApiPage();
    }

/*    @Given("prepare url valid for get list data")
    public void prepareUrlValidForGetListData() {
        apiPage.prepareURL();
    }*/

    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("hit api get list user")
    public void hitApiGetListUser() {
        apiPage.hitApiGetListUser();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCodeIsEquals(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String JSONFile) {
        apiPage.validationResponseJsonWithJSONSchema(JSONFile);
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUsers();
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser(){
        apiPage.validationResponseBodyCreateUser();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteUser();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateUser();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }
}
