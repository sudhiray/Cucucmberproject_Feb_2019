Feature: This feature file is designed in order to validate the SignIn GUI component validations

Scenario: This scenario is designed to validate the display condition of the authentication tab
    Given launch the chrome browser and Navigate to the Application
    When user clicks on SignIn button on Home page
    Then verify that the Authentication tab is displayed successfully
    
