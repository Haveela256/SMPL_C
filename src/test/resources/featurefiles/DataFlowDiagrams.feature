Feature: Discovery Module

#Data Flow Diagrams tab
  Scenario Outline: Upload files on Data Flow Diagrams tab
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    When Click on the discovery  module
    And Click on the Data Flow Diagrams tab
    And Click on Upload File button and enter the <DataFlowFileName> <File>
    And Click on the Cancel button
    And Click on the Submit button by entering all fields and without entering all fields and verify <FileUploadToaster> <DataFlowFileName>
    And Verfiy the uploaded file <DataFlowFileName> on table
    And Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons
    And verify delete popup
    And  Validate the delete functionality <DeletedFileToaster>
    And Validate the Pagination <DataFlowFileName> <uploadCount> <File>
    Given Click on Select Year dropdown by Selecting Year

    Examples:
      | EmailAddress            | Password     | Toaster | uploadCount | DataFlowFileName  | File | FileUploadToaster            | DeletedFileToaster          |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "10"        | "Data flow image" | "C:/Users/user/Downloads/SuccessLogo.png"   | "File uploaded successfully" | "File deleted successfully" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "10"         | "Data flow pdf"   | "C:\\Users\\user\\Documents\\Browse\\WorkFlowDocument.docx" | "File uploaded successfully" | "File deleted successfully" |
