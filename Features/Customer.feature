Feature: New Customer Creation 

Scenario: Successful Creation of New Customer Details

   Given User launch chrome browser
   When User opens URL "http://admin-demo.nopcommerce.com/login"
   Then User enters Username  and Password
   |Username           |Password|
   |admin@yourstore.com|admin   |
   Then User clicks on submit btn
   Then User clicks on customer link
   Then User clicks on add new customer link
   Then User enters details of customer
   |Email            |Password|Firstname|Lastname|Dateofbirth|Companyname|Admincomment	|
   |skg2220@gmail.com|802044    |suffha     |gargf    |07/07/2019 |TVSS        |Hellow        |
   |gadesk55@gmail.com|451254   |suyaff     |joyf     |03/08/2019 |TTCS        |hiiiii        |
   Then User save the details 
   Then User cliks on logout link
   Then Close browser
   

