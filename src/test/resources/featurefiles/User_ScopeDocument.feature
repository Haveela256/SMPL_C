Feature: User Discovery Module

#Scope Document tab
  Scenario Outline: Upload files on Scope Document tab
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    When Click on the discovery  module
    And Click on Upload File button and enter the <ScopeDocFileName> <File>
    And Click on the Cancel button
    And Click on the Submit button by entering all fields and without entering all fields and verify <FileUploadToaster> <ScopeDocFileName><File>
    And Verfiy the uploaded file <ScopeDocFileName> on table
    Given Click on Select Year dropdown by Selecting Year
    And Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons
    And verify delete popup <ScopeDocFileName>
    And  Validate the delete functionality <DeletedFileToaster> <ScopeDocFileName>
    And Validate the Pagination <ScopeDocFileName> <uploadCount> <File>


    Examples:
      | EmailAddress            | Password     | Toaster | uploadCount | ScopeDocFileName | File                                            | FileUploadToaster            | DeletedFileToaster          |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "2"         | "ScopeDoc"       | "C:/Users/user/Downloads/file.docx"             | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "2"         | "Test File"      | "C:/Users/user/Downloads/6322_6142_fdgfdh.docx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "2"         | "Test doc"       | "C:/Users/user/Downloads/File2.docx"            | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "2"         | "doc file"       | "C:/Users/user/Downloads/scope.docx"            | "File uploaded successfully" | "File deleted successfully" |


