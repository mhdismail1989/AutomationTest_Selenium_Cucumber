#Author: your.email@your.domain.com
#Date Added: 29 Mar 2021
#Descriotion: Sample Feature Definition Template

Feature: Login Application

  @regression, @smoke
  Scenario: Login the application
    Given User Launch browser
    When User opens the URL "https://opensource-demo.orangehrmlive.com/"
    And I enter username as "Admin"
    And I enter password as "admin123"
    And I click on Login button
    Then I verify whether login is successful.
    And close browser
