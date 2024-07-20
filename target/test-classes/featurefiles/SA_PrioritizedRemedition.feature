Feature: Super admin Prioritized Remedition Plan Report


  Scenario Outline: Open Prioritized Remedition Plan Report
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And click on the Prioritized Remeditaion Plan card  <AssessmentName>
    And validate the print button
    And verify the progress bar <AssessmentName>
    And verify the sprs score
    And verify the the regulation cards <RegulationCards>
    And verify the Implementation Status graph
    And validate the legends of Implementation Status graph
    And verify the Implementation Status table
    And Validate the pagination of Implementation Status table
    And verify the poam graph
    And validate the legends of poam graph
    And Validate the sort icons of poam table

    Examples:

      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | AssessmentName      | RegulationCards                                                                                                                                                                                                                                                                                                   |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "smplAssessment"    | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "New QA assessment" | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "renamed"           | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" | "gennn"             | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
