Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    Given Validate Select year dropdown
    And validate sort icon of updated on and assessment name columns
    And Validate the Rename icon functionality <RenameSuccessfulToaster> <RenameAssessment> <AssessmentName> <ErrorToaster>
    And validate the pagination
    And verify progress bar <RenameAssessment>
    And verify current Sprs score
    And verify the bar chart <RenameAssessment>
    And validate the legends functionality of bar chart <RenameAssessment>
    And validate the bars functionality <RenameAssessment> <BarsCount> <BarsNames>



    Examples:

      | EmailAddress            | Password     | Toaster | AssessmentName | RenameAssessment | ErrorToaster                                                              | RenameSuccessfulToaster           | BarsCount | BarsNames                                                                                                                                           |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "security7"    | "security8"      | ""                                                                        | "Assessment Renamed Successfully" | "14"      | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "smplll"       | "new one"        | "Assessment Name Already Exist Please Choose Another Assessment name !!!" | ""                                | "14"      | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection" |

