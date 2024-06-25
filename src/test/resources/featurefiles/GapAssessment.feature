Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And click on Gap Assessment Module
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
    And validate the bars functionality
    And validate the next and previous icon of the regulation tabs
    And  validate the regulation panel functionality
    And Verify the kayla's quiz section <QuizOne>
    And validate the radio buttons, previous and next icons of the quiz
    And Answer all the quiz answers <QuizOne> <QuizTwo>	<QuizThree>	<QuizFour> <QuizFive> and validate the retake icon functionality
    And verify the quiz result
    And validate the legends of quiz result
    And validate the implementation dropdown
    And verify the next steps by selecting some quiz options as No
    And Validate the Poam drpdown
    And validate the cancel button
    Then validate the submit button
    And validate justification button of chatbot after clicking some options as Not applicable
    And validate the cancel button of justification
    And validate the previous and next icons of justification


    Examples:
      | EmailAddress            | Password     | Toaster | AssessmentName  | Level     | Impact       | QuizOne | QuizTwo | QuizThree  | QuizFour         | QuizFive         | CopyAssessmentToaster            | AssessmenttName | DeletedFileToaster          |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "qa assessment" | "Level 1" | "Low impact" | "Yes"   | "No"    | "Not Sure" | "Not Applicable" | "Not Applicable" | "Assessment Copied Successfully" | "Assess"        | "File deleted successfully" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "aa assessment" | "Level 1" | "Low impact" | "Yes"           | "Yes"           | "Yes"           | "Yes"            | "Yes"           |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "bb assessment" | "Level 1" | "Low impact" | "No"            | "No"            | "No"            | "No"             | "No"            |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "cc assessment" | "Level 1" | "Low impact" | "Not Sure"      | "Not Sure"      | "Not Sure"      | "Not Sure"       | "Not Sure"      |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "dd assessment" | "Level 1" | "Low impact" | "Not Appliable" | "Not Appliable" | "Not Appliable" | "Not Appliable"  | "Not Appliable" |
  #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "ee assessment" | "Level 1" | "Low impact" | "Yes"   | "Yes"   | "Yes"      | "No"             | "No"            |
