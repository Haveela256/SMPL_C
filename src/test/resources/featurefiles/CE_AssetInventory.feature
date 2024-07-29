Feature: Asset Inventory of Compliance Expert


  Scenario Outline: Validate Asset inventory tab
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    When Click on the discovery  module Asset Inventory tab
    And Click on Upload File button and enter the <AssetFileName> <File> of asset inventory tab
    And Click on the Cancel button of asset inventory of asset inventory tab
    And Click on the Submit button by entering all fields and without entering all fields and verify <FileUploadToaster> <AssetFileName> <File> of asset inventory tab
    And Verfiy the uploaded file <AssetFileName> on table of asset inventory tab
    Given Click on Select Year dropdown by Selecting Year of asset inventory tab
    And Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons of asset inventory tab
    And Validate the bar chart
    And Validate the pie chart
    And verify delete popup <AssetFileName> of asset inventory tab
    And  Validate the delete functionality <DeletedFileToaster> <AssetFileName> of asset inventory tab
    And validate the Pagination <AssetFileName> <uploadCount> <File>



    Examples:
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | uploadCount | AssetFileName     | File                                    | FileUploadToaster            | DeletedFileToaster          |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Asset"           | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Inventory"       | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Asset File"      | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "2"         | "Asset Inventory" | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
