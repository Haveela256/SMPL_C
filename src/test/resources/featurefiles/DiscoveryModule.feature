Feature: Discovery Module

#Scope Document tab
  Scenario Outline: Upload files on Scope Document tab
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    When Click on the discovery  module
    Given Click on Select Year dropdown by Selecting Year
    And Click on Upload File button and enter the <ScopeDocFileName> <File>
    And Click on the Cancel button
    And Click on the Submit button by entering all fields and without entering all fields and verify <FileUploadToaster> <ScopeDocFileName><File>
    And Verfiy the uploaded file <ScopeDocFileName> on table
    And Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons
    And verify delete popup
    And  Validate the delete functionality <DeletedFileToaster>
    And Validate the Pagination <ScopeDocFileName> <uploadCount> <File>


    Examples:
      | EmailAddress            | Password     | Toaster | uploadCount | ScopeDocFileName | File                                                        | FileUploadToaster            | DeletedFileToaster          |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "2"         | "Scope File"     | "C:\\Users\\user\\Documents\\Browse\\WorkFlowDocument.docx" | "File uploaded successfully" | "File deleted successfully" |


