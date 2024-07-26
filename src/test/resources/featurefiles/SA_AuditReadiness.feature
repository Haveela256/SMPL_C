Feature: Super Admin Audit Readiness Module


  Scenario Outline: Open Audit Readiness module of a company
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And Validate the download <AssessmentName> <Regulationtabs>
    And Validate the Card functionality <Cards> <AssessmentName> of company
    And Validate the CMMC Regulation tab <Regulationtabs>
    And validate the download functionality of uploaded files <UploadFile>
    And Validate the pagination of uploaded files table


    Examples:
      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | AssessmentName      | Cards                               | Regulationtabs | UploadFile                 |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "smplAssessment"    | "Personnel Security"                | "PS.L2-3.9.2"  | "7887_7287_Scope File"     |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "New QA assessment" | "Identification And Authentication" | "IA.L1-3.5.2"  | "8099_6912_Data flow ...." |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "renamed"           | "Identification And Authentication" | "IA.L1-3.5.2"  | "8101_WorkFlowDocum"       |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" | "gennn"             | "Identification And Authentication" | "IA.L1-3.5.2"  | "8102_ScopeDocument"        |
