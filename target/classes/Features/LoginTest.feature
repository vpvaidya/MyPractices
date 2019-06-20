Feature: CRM Login
# without example keyword
#Scenario: Login to CRM Application
#
#Given user is already login page
#When title of Page is Free CRM
#Then user enters "sachin.vaidya12@gmail.com" and "India@123"
#Then user click on ligin button

# Scenario Outline with examples keyword
Scenario Outline: Login to CRM Application

Given user is already login page
When title of Page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on ligin button
Then close the browser

Examples:
| username | password |
| sachin.vaidya12@gmail.com | India@123 |
| sachin1.vaidya12@gmail.com | India@1234 |
  