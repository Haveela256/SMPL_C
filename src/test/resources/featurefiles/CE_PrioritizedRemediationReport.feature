Feature: Prioritized Remediation report of Compliance Expert


  Scenario Outline: Validate Prioritized Remediation report page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
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
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | AssessmentName      | RegulationCards                                                                                                                                                                                                                                                                                                  |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "System assessment" | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "tester"            | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "test compliance"   | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection"                                                                                                                                                                                                                                                                                                                  |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "compliance"        | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |