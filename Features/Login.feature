
##Feature: Login

##Scenario: Successful login with valid credential

  ##When User opens URL "http://admin-demo.nopcommerce.com/login"
   ##Then User clicks on submit btn
   ##Then Page title should be "Dashboard / nopCommerce administration"
   ##Then User cliks on logout link
   ##Then Page title should be "Your store. Login"
   ##Then Close browser
   
   
##Scenario Outline: Successful login with valid credential and Example

##   Given User launch chrome browser
##  When User opens URL "http://admin-demo.nopcommerce.com/login"
##   Then User enters username as "<Username>" and password as "<Password>"
##   Then User clicks on submit btn
##   Then Page title should be "<Home Page Title>"
##   Then User cliks on logout link
##   Then Page title should be "<Login Page Title>"
##   Then Close browser
   
   Examples: 
            
            | Username            | Password |Home Page Title                       |Login Page Title |
            | admin@yourstore.com | admin    |Dashboard / nopCommerce administration|Your store. Login|
   
   
  