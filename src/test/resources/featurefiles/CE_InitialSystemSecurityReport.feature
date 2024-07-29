Feature: Initial System Security report of Compliance Expert


  Scenario Outline: Validate Initial System Security report page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
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
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | AssessmentName      | RequirementsCard                                                                                                                                                                                                                                                                                                  |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "System assessment" | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "tester"            | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "test compliance"   | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection"                                                                                                                                                                                                                                                                                                                  |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "compliance"        | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |