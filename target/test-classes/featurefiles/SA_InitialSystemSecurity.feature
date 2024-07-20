Feature: Super admin Initial System Security Report


  Scenario Outline: Open Initial System Security Report
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And Validate the Back icon functionality
    And Select assessment from dropdown <AssessmentName>
    And Click on the Initial System Security Plan Report card <AssessmentName>
    And Validate the Print button functionality
    And Verify the System Identification section
    And Verify the System Environment section
    And Validate the Download icon functionality System Environment  section
    And Verify the Software Details panel
    And Verify the Requirements section <RequirementsCard>
    And Verify the Record of changes table
    And validate the pagination of Record of changes table by priting multiple times

    Examples:

      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | AssessmentName      | RequirementsCard                                                                                                                                                                                                                                                                                                  |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "smplAssessment"    | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "New QA assessment" | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "renamed"           | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" | "gennn"             | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
