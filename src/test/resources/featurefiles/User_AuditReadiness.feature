Feature: User Audit Readiness Module


  Scenario Outline: Validate Audit Readiness Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Validate the Card functionality <Cards> <AssessmentName>
    And Validate the CMMC Regulation tab <Cards> <AssessmentName> <Regulationtabs> <UploadFile> <ReuploadFile> <JustificationToaster> <DeletedFileToaster> <EditText>
    And validate panel functionality <JustificationToaster> <EditText>
    And Validate the submit button
    And Validate the card status <Cards> <AssessmentName>
    And Validate the download and delete icons <Cards> <AssessmentName> <Regulationtabs> <DeletedFileToaster>
    And Reupload a file <UploadFile>
    And Validate the pagination of uploaded files table
    And Validate upload policy button <UploadPolicy> <PolicyDocToaster>
    And Validate the submit button





    Examples:
      | EmailAddress            | Password     | Toaster | AssessmentName | Cards                | Regulationtabs | UploadFile                                    | ReuploadFile                             | EditText                                                                                                                                                                                                                              | JustificationToaster               | UploadPolicy                                 | PolicyDocToaster                               | DeletedFileToaster     |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Smpl Test"    | "Personnel Security" | "PS.L2-3.9.2"  | "C:/Users/user/Downloads/AuditReadiness.docx" | "C:/Users/user/Downloads/AssetFile.xlsx" | "The United States Department of Defense is implementing the Cybersecurity Maturity Model Certification (CMMC) to normalize and standardize cybersecurity preparedness across the federal government’s defense industrial base (DIB)" | "Justification Saved Successfully" | "C:/Users/user/Downloads/WorkFlowDocum.docx" | "Assessment Policy Document Save Successfull." | "Deleted Successfully" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Smpl Test"    | "Personnel Security" | "PS.L2-3.9.1"  | "C:/Users/user/Downloads/AuditReadiness.docx" | "C:/Users/user/Downloads/AssetFile.xlsx" | "The United States Department of Defense is implementing the Cybersecurity Maturity Model Certification (CMMC) to normalize and standardize cybersecurity preparedness across the federal government’s defense industrial base (DIB)" | "Justification Saved Successfully" | "C:/Users/user/Downloads/WorkFlowDocum.docx" | "Assessment Policy Document Save Successfull." | "Deleted Successfully" |
