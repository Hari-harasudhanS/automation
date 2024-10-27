Feature: Validate Place Api
@validGet
Scenario: Verify the http get request

Given The user enter the base URL "https://reqres.in"
And User added the header content "Content_Type" and "application/json"
And User added the Get resource "/api/user?page=2"
And the API call got sucess with status code 200

@Group
Scenario Outline: Verify the http get request

Given The user enter the base URL "<Url>"
And User added the header content "Content_Type" and "application/json"
And User added the Get resource "<Resource>"
And the API call got sucess with status code 200

Examples:
|Url	               | Resource       |
|https://reqres.in   |/api/user?page=2|

|https://reqres.in   |/api/users/2|
|https://reqres.in   |/api/unknown|




