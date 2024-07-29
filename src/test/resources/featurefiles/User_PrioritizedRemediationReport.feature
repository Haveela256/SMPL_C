Feature: User Prioritized Remeditaion Plan report

  Scenario Outline: Validate Prioritized Remeditaion Plan report
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
      | EmailAddress            | Password     | Toaster | AssessmentName | RegulationCards                                                                                                                                                                                                                                                                                                   |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "tester"       | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "smplll"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Smpl Test"    | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "new one"      | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |