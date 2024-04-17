Automation Testing REST API

Data list for testing are taken from https://gorest.co.in/

Scenario List:

  1. Scenario: Test get list data normal
      Given prepare url for "GET_LIST_USERS"
      And hit api get list user
      Then validation status code is equals 200
      Then validation response body get list users
      Then validation response json with JSONSchema "get_list_users_normal.json"

  2. Scenario: Test create new user normal
      Given prepare url for "CREATE_NEW_USERS"
      And hit api post create new user
      Then validation status code is equals 201
      Then validation response body post create new user
      Then validation response json with JSONSchema "post_create_new_user_normal.json"

  3. Scenario: Test delete user normal
      Given prepare url for "CREATE_NEW_USERS"
      And hit api post create new user
      Then validation status code is equals 201
      Then validation response body post create new user
      And hit api delete new
      Then validation status code is equals 204

  4. Scenario: Test update user normal
      Given prepare url for "CREATE_NEW_USERS"
      And hit api post create new user
      Then validation status code is equals 201
      Then validation response body post create new user
      And hit api update data
      Then validation status code is equals 200
      Then validation response body update user
