Feature: Compliance Expert Audit Readiness Module

  Scenario Outline: Validate Audit Readiness Module
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    And Validate the Card functionality <Cards> <AssessmentName>
    And Validate the CMMC Regulation tab <Cards> <AssessmentName> <Regulationtabs> <UploadFile> <ReuploadFile> <JustificationToaster> <DeletedFileToaster> <EditText>
    And validate panel functionality <JustificationToaster> <EditText>
    And Validate the submit button
    And Validate the download and delete icons <Cards> <AssessmentName> <Regulationtabs> <DeletedFileToaster>
    And Reupload a file <UploadFile>
    And Validate the pagination of uploaded files table
    And Validate upload policy button <UploadPolicy> <PolicyDocToaster>
    And Validate the submit button
    And Validate the card status <Cards> <AssessmentName>


    Examples:
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | AssessmentName    | Cards                | Regulationtabs | UploadFile                                    | ReuploadFile                             | EditText                                                                                                                                                                                                                              | JustificationToaster               | UploadPolicy                                 | PolicyDocToaster                               | DeletedFileToaster     |  |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "compliance"      | "Personnel Security" | "PS.L2-3.9.2"  | "C:/Users/user/Downloads/AuditReadiness.docx" | "C:/Users/user/Downloads/AssetFile.xlsx" | "The United States Department of Defense is implementing the Cybersecurity Maturity Model Certification (CMMC) to normalize and standardize cybersecurity preparedness across the federal government’s defense industrial base (DIB)" | "Justification Saved Successfully" | "C:/Users/user/Downloads/WorkFlowDocum.docx" | "Assessment Policy Document Save Successfull." | "Deleted Successfully" |  |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "test compliance" | "Personnel Security" | "PS.L2-3.9.1"  | "C:/Users/user/Downloads/AuditReadiness.docx" | "C:/Users/user/Downloads/AssetFile.xlsx" | "The United States Department of Defense is implementing the Cybersecurity Maturity Model Certification (CMMC) to normalize and standardize cybersecurity preparedness across the federal government’s defense industrial base (DIB)" | "Justification Saved Successfully" | "C:/Users/user/Downloads/WorkFlowDocum.docx" | "Assessment Policy Document Save Successfull." | "Deleted Successfully" |  |
      

