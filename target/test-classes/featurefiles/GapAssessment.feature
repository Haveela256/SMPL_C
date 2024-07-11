Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    Given Validate Select year dropdown
    And validate sort icon of updated on and assessment name columns
    And Validate the Rename icon functionality <RenameSuccessfulToaster> <RenameAssessment> <AssessmentName> <ErrorToaster>
    And Validate the copy icon functionality <CopyAssessmentToaster> <NewName> <RenameAssessment> <ErrorToaster>
    And validate the delete icon functionality <DeletedFileToaster> <AssessmentName> <RenameAssessment>
    And validate the pagination
    And verify progress bar <RenameAssessment>
    And verify current Sprs score <RenameAssessment>
    And verify the bar chart <RenameAssessment>
    And validate the legends functionality of bar chart <RenameAssessment>
    And validate the bars functionality <RenameAssessment> <BarsCount> <BarsNames>



    Examples:

      | Example                                        | EmailAddress               | Password     | Toaster | AssessmentName       | NewName             | RenameAssessment     | CopyAssessmentToaster              | ErrorToaster                                                              | RenameSuccessfulToaster           | DeletedFileToaster          | BarsCount | BarsNames                                                                                                                                                                                                                                                                                                        |
      | copy assessment                                | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Protection1"        | "CopiedAssessMent"  | "Protection2"        | " Assessment Copied Successfully " | ""                                                                        | "Assessment Renamed Successfully" | "File deleted successfully" | "14"      | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | rename assessment                              | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Regulations1"       | "CopiedAssessMentt" | "Regulations2"       | " Assessment Copied Successfully " | ""                                                                        | "Assessment Renamed Successfully" | "File deleted successfully" | "14"      | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |
      | copy an asessment by providing existing name   | "random3.test@yopmail.com" | "Vassar@123" | ""      | "RenamedAssessment6" | "CopiedAssessMentt" | "RenamedAssessment5" | ""                                 | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "Assessment Renamed Successfully" | "File deleted successfully" | "6"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"                                                                                                                                                              |
      | rename an asessment by providing existing name | "random3.test@yopmail.com" | "Vassar@123" | ""      | "renametech"         | "CopieddAssessMent" | "renametech"         | ""                                 | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | "Assessment Renamed Successfully" | "File deleted successfully" | "14"      | "Access Control,Audit and Accountability,Awareness and Training,Configuration Management,Maintenance,Personnel Security,Physical Protection,Risk Mangement,Security Assessment,Situational Awareness,Systems and Communications Protection,Incident Response,Identification and Authentication,Media Protection" |

