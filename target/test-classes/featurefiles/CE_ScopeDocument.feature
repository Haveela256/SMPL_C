Feature: Scope Document tab of Compliance Expert


  Scenario Outline: Validate the Scope Document tab
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
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
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | uploadCount | ScopeDocFileName | File                                            | FileUploadToaster            | DeletedFileToaster          |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Test"           | "C:/Users/user/Downloads/file.docx"             | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Doc"            | "C:/Users/user/Downloads/6322_6142_fdgfdh.docx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "ScopeDocument"  | "C:/Users/user/Downloads/File2.docx"            | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Document"       | "C:/Users/user/Downloads/scope.docx"            | "File uploaded successfully" | "File deleted successfully" |
