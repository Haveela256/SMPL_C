Feature: Discovery Module


  Scenario Outline: Upload files on Asset Inventory tab
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    When Click on the discovery  module
    And Click on the Asset Inventory tab
    And Click on Upload File button and enter the <AssetInventoryFileName> <File>
    And Click on the Cancel button
    And Click on the Submit button by entering all fields and without entering all fields and verify <FileUploadToaster> <AssetInventoryFileName>
    And Verfiy the uploaded file <AssetInventoryFileName> on table
    And Verify Asset Inventory bar chart
    And Verify Asset Inventory pie chart
    And Validate the Sort icon of Updated On , File Name column and Validate Download and Delete icons
    And verify delete popup
    And  Validate the delete functionality <DeletedFileToaster>
    And Validate the Pagination <ScopeDocFileName> <uploadCount> <File>
    Given Click on Select Year dropdown by Selecting Year

    Examples:
      | EmailAddress            | Password     | Toaster | uploadCount | AssetInventoryFileName | File                                                        | FileUploadToaster            | DeletedFileToaster          |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "2"         | "Asset Inventory"      | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |


