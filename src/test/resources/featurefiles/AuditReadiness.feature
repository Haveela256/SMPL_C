Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And click on the Create new Assessment button and provide <AssessmentName> <Level> <Impact>
    And verify the added assessment on the table <AssessmentName>
    And Validate select year dropdown
    And validate sort icon of updated on and assessment name columns
    And validate the copy icon functionality <CopyAssessmentToaster> <AssessmenttName>
    And validate the download icon functionality
    And validate the delete icon functionality <DeletedFileToaster>
    And validate the pagination
    And verify progress bar
    And verify current Sprs score
    And verify the bar chart
    And validate the legends functionality of bar chart
    And validate the regulation functionality
    And validate the next and previous icon of the regulation tabs
    And Validate the Select implementation dropdown
    And Validate the Upload Relevant Documentation dropdown
    And Upload or Browse hyperlink functionality <File>
    And Validate the Justification for the implementation of required controls' feild functionality after uploading a file
    And Validate the uploaded file panel
    And Validate the edit icon of justification <JustificationToaster>
    And Validate Summarize button
    And Validate the sort icons of the Uploaded Documents table
    And verify delete popup
    And  Validate the delete functionality <DeletedFileToaster>
    And Validate the Pagination <ScopeDocFileName> <uploadCount> <File>
    And Validate the pagination of uploaded doc table
    And validate the cancel button
    Then validate the submit button



    Examples:
      | EmailAddress            | Password     | Toaster | AssessmentName  | Level     | Impact       | File | QuizTwo | QuizThree  | QuizFour         | QuizFive        | CopyAssessmentToaster            | AssessmenttName | DeletedFileToaster          |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "qa assessment" | "Level 1" | "Low impact" | "Yes"   | "No"    | "Not Sure" | "Not Applicable" | "Not Appliable" | "Assessment Copied Successfully" | "Assess"        | "File deleted successfully" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "aa assessment" | "Level 1" | "Low impact" | "Yes"           | "Yes"           | "Yes"           | "Yes"            | "Yes"           |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "bb assessment" | "Level 1" | "Low impact" | "No"            | "No"            | "No"            | "No"             | "No"            |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "cc assessment" | "Level 1" | "Low impact" | "Not Sure"      | "Not Sure"      | "Not Sure"      | "Not Sure"       | "Not Sure"      |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "dd assessment" | "Level 1" | "Low impact" | "Not Appliable" | "Not Appliable" | "Not Appliable" | "Not Appliable"  | "Not Appliable" |
  #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "ee assessment" | "Level 1" | "Low impact" | "Yes"   | "Yes"   | "Yes"      | "No"             | "No"            |
