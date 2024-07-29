Feature: Data Flow Diagrams of Compliance Expert


  Scenario Outline: Validate Data Flow Diagrams tab
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
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
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | uploadCount | DataFlowFileName  | File                                    | FileUploadToaster            | DeletedFileToaster          |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Data"            | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Flow"            | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Diagrams"        | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "DatFlowDiagrams" | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
