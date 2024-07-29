Feature: Initial System Security Plan Report

  Scenario Outline: Validate Initial System Security Plan Report
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
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
      | EmailAddress               | Password     | Toaster | AssessmentName       | RequirementsCard                                                                                                                                                                                                                                                                                                  |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "New QA assessment4" | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "New QA assessment5" | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Tech1"              | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Regulations1"       | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Protection1"        | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
