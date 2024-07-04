Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Validate the Card functionality <Cards> <AssessmentName>
    And Validate the Next icon functionality of the CMMC Regulation tab <Regulationtabs>
    And Validate the Previous icon functionality CMMC Regulation tab <Regulationtabs>
    And Validate the Upload policy Document button <UploadPolicy> <PolicyDocToaster>
    And Validate the Select implementation Status dropdown functionality by selecting a option <UploadFile>
    And Validate the Upload Relevant Documentation dropdown functionality by selecting an option <UploadFile>
    And Validate the Upload icon or Browse hyperlink functionality <UploadFile>
    And Validate the Re-Upload File button functionality <ReuploadFile>
    And Verify the Justification for the implementation of required controls text area functionality <Text>
    And Verify the Uploaded documents table
    And Validate the Edit icon functionality <EditText>
    And Validate the Save icon functionality <JustificationToaster>
    And Validate the Summarize button functionality
    And Verify the Probability of passing certification label
    And Validate the Download icon functionality
    And Validate the Delete icon functionality
    And Verify the Are you sure to delete  popup
    And validate the sort icons of Document Type and File Name columns
    And Validate the pagination of poam table


    Examples:
      | EmailAddress            | Password     | Toaster | AssessmentName      | Cards                                                                                                                                               | Regulationtabs                                      | UploadFile                                    | ReuploadFile                             | Text                                                                                                                                                                                                                                                              | EditText                                                                                                                                                                                                                              | JustificationToaster                 | UploadPolicy | PolicyDocToaster |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "New QA assessment" | "Access Control,Physical Protection,Situational Awareness,Systems and Communications Protection,Identification and Authentication,Media Protection" | "AC.L1-3.1.1,AC.L1-3.1.2,AC.L1-3.1.20,AC.L1-3.1.22" | "C:/Users/user/Downloads/AuditReadiness.docx" | "C:/Users/user/Downloads/AssetFile.xlsx" | "The Cybersecurity Maturity Model Certification is an assessment framework and assessor certification program designed to increase the trust in measures of compliance to a variety of standards published by the National Institute of Standards and Technology" | "The United States Department of Defense is implementing the Cybersecurity Maturity Model Certification (CMMC) to normalize and standardize cybersecurity preparedness across the federal government’s defense industrial base (DIB)" | " Justification Saved Successfully " | ""           | " Assessment Policy Document Save Successfull. "               |
