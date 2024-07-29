Feature: Compliance Expert Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    Given Validate Select year dropdown
    And validate sort icon of updated on and assessment name columns
    And Validate the Rename icon functionality <RenameSuccessfulToaster> <RenameAssessment> <AssessmentName> <ErrorToaster>
    And Validate the copy icon functionality <CopyAssessmentToaster> <CopyName> <RenameAssessment> <ErrorToaster>
    And validate the pagination
    And verify progress bar <RenameAssessment>
    And verify current Sprs score
    And verify the bar chart <RenameAssessment>
    And validate the legends functionality of bar chart <RenameAssessment>
    And validate the bars functionality <RenameAssessment> <BarsCount> <BarsNames>
    And validate the delete icon functionality <DeletedFileToaster> <AssessmentName> <RenameAssessment>



    Examples:

      | Example                                        | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | AssessmentName | CopyName     | RenameAssessment | CopyAssessmentToaster            | ErrorToaster                                                              | RenameSuccessfulToaster           | DeletedFileToaster          | BarsCount | BarsNames                                                                                                                                                                                                                                                                                                        |
      | copy assessment                                | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "security8"    | "digitals"   | "security9"      | "Assessment Copied Successfully" | ""                                                                        | "Assessment Renamed Successfully" | "File deleted successfully" | "14"      | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                              |
      | rename assessment                              | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "smpl test1"   | "digital4"   | "smpl test2"     | "Assessment Copied Successfully" | ""                                                                        | "Assessment Renamed Successfully" | "File deleted successfully" | "14"      | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                              |
      | copy an asessment by providing existing name   | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Smpl Test"    | "security8"  | "security10"     | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "Assessment Renamed Successfully" | "File deleted successfully" | "6"       | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | rename an asessment by providing existing name | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "smplll"       | "AssessMent" | "security8"      | "Assessment Copied Successfully" | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | ""                                | "File deleted successfully" | "14"      | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                              |

