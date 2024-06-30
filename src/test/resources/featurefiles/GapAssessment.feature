Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    Given Validate Select year dropdown
    And validate sort icon of updated on and assessment name columns
    And Validate the copy icon functionality <CopyAssessmentToaster> <NewName> <AssessmentName> <ErrorToaster>
    And Validate the Rename icon functionality <RenameSuccessfulToaster> <RenameAssessment> <AssessmentName> <ErrorToaster>
    And validate the delete icon functionality <DeletedFileToaster> <AssessmentName>
    And validate the pagination
    And verify progress bar <AssessmentName>
    And verify current Sprs score <AssessmentName>
    And verify the bar chart <AssessmentName>
    And validate the legends functionality of bar chart
    And validate the bars functionality <AssessmentName> <BarsCount> <BarsNames>



    Examples:

      | Example | EmailAddress | Password | Toaster | AssessmentName | CopyAssessmentToaster | NewName | RenameAssessment | CopyAssessmentToaster | ErrorToaster | RenameSuccessfulToaster | DeletedFileToaster | BarsCount | BarsNames |
      #| copy assessment                                | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | " Assessment Copied Successfully" | "CopiedAssessMent"   | ""                   | ""                    | ""                                                                        | ""                                  | "File deleted successfully" | "6"       | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection"        |
      #| rename assessment | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | ""                    | ""      | "RenamedAssessment" | ""                    | ""           | " Assessment Renamed Successfully " | ""                 | ""        | ""        |
      | copy an asessment by providing existing name   | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | ""                    | "New QA assessment3" | ""                   | ""                    | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | ""                                  | ""                 | ""        | ""        |
      #| rename an asessment by providing existing name | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment3" | ""                    | ""      | "New QA assessment3" | ""                    | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | ""                                  | ""                 | ""        | ""        |

