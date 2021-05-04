# language:en
@stories
Feature: Create user on Utest.com
  As a new user, I want to create a new profile on the page

  @scenario1
  Scenario Outline:Create a new profile complying with all the page requirements
    Given that Daniel wants create a new profile on Utest
    When he complying all the require steps
      |name  |lastName  |email  |month  |day  |year  |city  |zip_code  |password  |
      |<name>|<lastName>|<email>|<month>|<day>|<year>|<city>|<zip_code>|<password>|

    Then  the profile is create successful


    Examples:
      |name|lastName|email|month|day|year|city|zip_code|password|
      |Daniel|Loaiza|danielalejandroloaizaperez@Hotmail.com|February|12|1998|Armenia|630003|Daniel-12345678|
