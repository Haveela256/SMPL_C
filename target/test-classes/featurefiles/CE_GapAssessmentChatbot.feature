Feature: Compliance Expert Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    And click on Gap Assessment Module
    And click on the Create new Assessment button and provide <AssessmentName> <Level> <Impact>  <AssessmentCount>
    And Click on the Update Technical Footprint hyperlink <AssessmentName> <Level> <Impact>
    And verify the added assessment on the table <AssessmentName>
    And validate the pagination of assessments table
    And Verify bars for each level <BarsCount> <BarsNames> <AssessmentName>

    Examples:
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | AssessmentName | AssessmentCount | AssessmentName      | Level     | Impact             | BarsCount | BarsNames                                                                                                                                                                                                                                                                                                         |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Compliance1"  | "2"             | "New QA assessment" | "Level 1" | "Low impact"       | "6"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Compliance2"  | "1"             | "Assessment"        | "Level 1" | "High Impact"      | "6"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Compliance3"  | "1"             | "GapAsses"          | "Level 1" | "Moderate Impact " | "6"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                               |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Compliance4"  | "1"             | "Tech1"             | "Level 2" | "Low impact"       | "14"      | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Compliance5"  | "1"             | "Regulations"       | "Level 2" | "High Impact"      | "14"      | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Compliance6"  | "1"             | "Protection"        | "Level 2" | "Moderate Impact " | "14"      | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement, Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |


