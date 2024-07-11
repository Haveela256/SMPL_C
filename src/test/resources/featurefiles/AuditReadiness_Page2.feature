Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Validate the Card functionality <Cards> <AssessmentName>
    And Validate the CMMC Regulation tab <Cards> <AssessmentName> <Regulationtabs> <UploadFile> <ReuploadFile>
    And validate panel functionality <JustificationToaster> <DeletedFileToaster> <EditText>
    And Validate upload policy button <UploadPolicy> <PolicyDocToaster>
    And Validate the Back icon
    And Validate the card status <Cards>



    Examples:
      | EmailAddress               | Password     | Toaster | AssessmentName      | Cards                   | Regulationtabs | UploadFile                                    | ReuploadFile                             | EditText                                                                                                                                                                                                                              | JustificationToaster                 | UploadPolicy                                 | PolicyDocToaster                                 | DeletedFileToaster          |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "RenamedAssessment" | "Situational Awareness" | "SI.L1-3.14.2" | "C:/Users/user/Downloads/AuditReadiness.docx" | "C:/Users/user/Downloads/AssetFile.xlsx" | "The United States Department of Defense is implementing the Cybersecurity Maturity Model Certification (CMMC) to normalize and standardize cybersecurity preparedness across the federal government’s defense industrial base (DIB)" | " Justification Saved Successfully " | "C:/Users/user/Downloads/WorkFlowDocum.docx" | " Assessment Policy Document Save Successfull. " | "File deleted successfully" |
