Feature: Login to CRM Application with Datatable
Scenario: Login to CRM Application

Given user is already login page
When title of Page is Free CRM
Then user enters username and password
|username                   |password   |
| sachin.vaidya12@gmail.com | India@123 |
Then user click on ligin button
Then close the browser