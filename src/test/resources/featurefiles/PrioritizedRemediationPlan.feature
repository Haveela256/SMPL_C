Feature: Prioritized Remeditaion Plan report verification

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
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
      | EmailAddress            | Password     | Toaster | AssessmentName       | RegulationCards                                                                                                                                                                                                                                                                                                   |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Assessment1"        | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "GapAsses1"          | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Tech1"              | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Regulations1"       | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Protection1"        | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |