Feature: Gap Assessment Chatbot

  Scenario Outline: Create a assessment through Intent Bot
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And click on the Create new Assessment button and provide <AssessmentName> <Level> <Impact>
    And Click on the Update Technical Footprint hyperlink <AssessmentName> <Level> <Impact>
    And verify the added assessment on the table <AssessmentName>
    Examples:
      | EmailAddress            | Password     | Toaster | AssessmentName      | Level     | Impact       |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New qa assessment" | "Level 1" | "Low impact" |
                                                                                                                                                                    

