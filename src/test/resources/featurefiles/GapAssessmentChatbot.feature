Feature: Gap Assessment Chatbot

  Scenario Outline: Create a assessment through Intent Bot
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And click on Gap Assessment Module
    And click on the Create new Assessment button and provide <AssessmentName> <Level> <Impact> <AssessmentNameTwo>
    And Click on the Update Technical Footprint hyperlink <AssessmentName> <Level> <Impact>
    And verify the added assessment on the table <AssessmentName>
    And Verify bars for each level <BarsCount> <BarsNames> <AssessmentName>

    Examples:
      | EmailAddress            | Password     | Toaster | AssessmentName      | AssessmentNameTwo | Level     | Impact       | BarsCount | BarsNames                                                                                                                                           |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment" | ""                | "Level 1" | "Low impact" | "6"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment2" | ""                  | "Level 1" | "High Impact"      | "6"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment4" | ""                  | "Level 2" | "Moderate Impact " | "14"      | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment6" | ""                  | ""        | "Low impact" | ""        | ""                                                                                                                                                  |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment8" | "New QA assessment" | "Level 1" | "Low impact" | ""        | ""                                                                                                                                                  |

                                                                                                                                                                    

