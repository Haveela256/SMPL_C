Feature: Discovery Module

#Data Flow Diagrams tab
  Scenario Outline: Upload files on Data Flow Diagrams tab
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    When Click on the discovery  module
    And Click on the Data Flow Diagrams tab
    And Click on Upload File button and enter the <DataFlowFileName> <File>
    And Click on the Cancel button
    And Click on the Submit button by entering all fields and without entering all fields and verify <FileUploadToaster> <DataFlowFileName> <File>
    And Verfiy the uploaded file <DataFlowFileName> on table
    And Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons
    And verify delete popup of dataflow
    And  Validate the delete functionality of data flow <DeletedFileToaster>
    And Validate the Pagination <DataFlowFileName> <uploadCount> <File>
    Given Click on Select Year dropdown by Selecting Year

    Examples:
      | EmailAddress           | Password     | Toaster | uploadCount | DataFlowFileName  | File                                                      | FileUploadToaster                                         | DeletedFileToaster                                        |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "6"         | "Data flow image" | "C:/Users/user/Downloads/6377_5759_3399_MODIFIED.xlsx"    | "File uploaded successfully"                              | "File deleted successfully"                               |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "2"         | "Data flow pdf"   | "C:/Users/user/Downloads/6377_5759_3399_MODIFIED.xlsx"    | "File uploaded successfully"                              | "File deleted successfully"                               |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "2"         | "Doc"             | "C:/Users/user/Downloads/6377_5759_3399_MODIFIED.xlsx"    | "File uploaded successfully"                              | "File deleted successfully"                               |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "2"         | "File"            | "C:/Users/user/Downloads/6377_5759_3399_MODIFIED.xlsx"    | "File uploaded successfully"                              | "File deleted successfully"                               |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "2"         | "New File"        | "C:/Users/user/Downloads/6377_5759_3399_MODIFIED.xlsx"    | "File uploaded successfully"                              | "File deleted successfully"                               |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "2"         | "Pdf"             | "C:/Users/user/Downloads/6377_5759_3399_MODIFIED.xlsx"    | "File uploaded successfully"                              | "File deleted successfully"                               |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "2"         | "Document"        | "C:/Users/user/Downloads/6377_5759_3399_MODIFIED.xlsx"    | "File uploaded successfully"                              | "File deleted successfully"                               |
      | "testltwo@yopmail.com" | "Vassar@123" | ""      | "2"         | "Document"        | "C:/Users/user/Downloads/AssetInventoryTemplateeeee.xlsx" | " Object reference not set to an instance of an object. " | "File deleted successfully" |
