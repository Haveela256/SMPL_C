Feature: Super Admin Gap Assessment Module


  Scenario Outline: Open Gap Assessment module of a company
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And Verify the Company page
    Given Validate Select year dropdown
    And validate the pagination
    And verify progress bar <AssessmentName>
    And verify current Sprs score
    And click on the <Bar> and verify Bar <Modules>
    And Verify the quiz options and POAM Notes



    Examples:
      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | AssessmentName      | Bar                 | Modules       |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "smplAssessment"    | "Access Control-24" | "AC.L1-3.1.1" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "New QA assessment" | "Access Control-24" | "AC.L1-3.1.1" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "renamed"           | "Access Control-24" | "AC.L1-3.1.1" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" | "gennn"             | "Access Control-24" | "AC.L1-3.1.1" |
