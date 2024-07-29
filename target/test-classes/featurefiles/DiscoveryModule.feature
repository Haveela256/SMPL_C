Feature: Discovery Module

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
<<<<<<< HEAD
    And  Validate the delete functionality <DeletedFileToaster> <ScopeDocFileName>
=======
<<<<<<< HEAD
    And  Validate the delete functionality <DeletedFileToaster> <ScopeDocFileName>
=======
    And  Validate the delete functionality <DeletedFileToaster>
>>>>>>> 1a2da184a64955571b42de9b8c873355143fd19a
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
    And Validate the Pagination <ScopeDocFileName> <uploadCount> <File>


    Examples:
      | EmailAddress               | Password     | Toaster | uploadCount | ScopeDocFileName | File                                | FileUploadToaster            | DeletedFileToaster          |
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Scope File"     | "C:/Users/user/Downloads/file.docx" | "File uploaded successfully" | "File deleted successfully" |
     | "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "Evidence" | "C:/Users/user/Downloads/6322_6142_fdgfdh.docx" | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "Progress" | "C:/Users/user/Downloads/File2.docx"        | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "File"     | "C:/Users/user/Downloads/scope.docx"        | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "New File" | "C:/Users/user/Downloads/6636.docx"         | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "Doc"      | "C:/Users/user/Downloads/6229_WorkFlo.docx" | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Document"       | "C:/Users/user/Downloads/scope.docx" | "File uploaded successfully" | "File deleted successfully" |
<<<<<<< HEAD
=======
=======
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "6"         | "Scope File"     | "C:/Users/user/Downloads/file.docx" | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "Evidence" | "C:/Users/user/Downloads/6322_6142_fdgfdh.docx" | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "Progress" | "C:/Users/user/Downloads/File2.docx"        | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "File"     | "C:/Users/user/Downloads/scope.docx"        | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "New File" | "C:/Users/user/Downloads/6636.docx"         | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | "" | "2" | "Doc"      | "C:/Users/user/Downloads/6229_WorkFlo.docx" | "File uploaded successfully" | "File deleted successfully" |
     # | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Document"       | "C:/Users/user/Downloads/scope.docx" | "File uploaded successfully" | "File deleted successfully" |
>>>>>>> 1a2da184a64955571b42de9b8c873355143fd19a
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2


