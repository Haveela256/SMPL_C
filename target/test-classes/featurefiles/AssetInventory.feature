Feature: Discovery Module

<<<<<<< HEAD
#Asset Inventory tab
=======
<<<<<<< HEAD
#Asset Inventory tab
  Scenario Outline: Upload files on Scope Document tab
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
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
      | EmailAddress               | Password     | Toaster | uploadCount | AssetFileName | File                                    | FileUploadToaster            | DeletedFileToaster          |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Scope File"  | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Evidence"    | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Progress"    | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
=======

>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
  Scenario Outline: Upload files on Asset Inventory tab
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
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
<<<<<<< HEAD
      | EmailAddress               | Password     | Toaster | uploadCount | AssetFileName | File                                    | FileUploadToaster            | DeletedFileToaster          |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Scope File"  | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Evidence"    | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Progress"    | "C:/Users/user/Downloads/MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
=======
      | EmailAddress           | Password     | Toaster | uploadCount | AssetInventoryFileName | File                                              | FileUploadToaster            | DeletedFileToaster          |
      #| "random3.test@yopmail.com" | "Vassar@123" | ""      | "6"         | "Asset Inventory"      | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
     # | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Asset"                | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Inventory"            | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Assets"               | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "AssetInventory"       | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      #| "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "AssetsInventory"      | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
      | "random3.test@yopmail.com" | "Vassar@123" | ""      | "2"         | "Inventoryy"           | "C:/Users/user/Downloads/5932_4725_MODIFIED.xlsx" | "File uploaded successfully" | "File deleted successfully" |
>>>>>>> 1a2da184a64955571b42de9b8c873355143fd19a
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2


