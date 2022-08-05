Feature: UI Cogmento front Page

Scenario Outline: Cogmento Login page
Given User is already on login page
When title of login page is Cogmento CRM
Then user enters "<username>" and "<password>"
Then User clicks on Login
Then Close the browser

Examples: 

|username||password|
| sumitgoel1001@gmail.com | |Sumit@1234|