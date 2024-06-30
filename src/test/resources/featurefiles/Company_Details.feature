Feature: Company details module


  Scenario Outline: Add company details
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the Edit button
    And Validate the cancel button
    And Add the following company details <CompanyName> <FEINno> <URL> <DUNSno> <Phone> <AddressOne> <AddressTwo> <ZipCode> <City>
    And Upload Profile and verify Crop popup <File> <ReplaceFile>
    Then Validate the submit button and verify <CompanyName> <FEINno> <URL> <DUNSno> <Phone> <AddressOne> <AddressTwo> <ZipCode> <City> <ErrorMessage> <CompanyDetailsUpdatedToaster> <ReplaceFile> <File>
    And click on the replace icon and add profile <File> <ReplaceFile>





    Examples:
      | EmailAddress            | Password     | Toaster | CompanyName  | FEINno       | URL               | DUNSno      | Phone          | AddressOne  | AddressTwo   | ZipCode | City       | ErrorMessage | CompanyDetailsUpdatedToaster           | File                                   | ReplaceFile                            |
      #| "testadmin@yopmail.com" | "Vassar@123" | ""      | ""          | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | "Company Name is required" | ""                           | "C:/Users/user/Downloads/profiles.png" | "C:/Users/user/Downloads/profiles.png" |
      #| "testadmin@yopmail.com" | "Vassar@123" | ""      | "VassarLabs" | ""     | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | "FEIN No. is required" | ""                           | ""   | ""          |
      #| "testadmin@yopmail.com" | "Vassar@123" | ""      | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | ""             | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | "Phone number is required" | ""                                     | ""   | ""          |
      #| "testadmin@yopmail.com" | "Vassar@123" | ""      | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | ""      | "Hyderbad" | "Zipcode is required"   | ""                                     | ""   | ""          |
     # | "testadmin@yopmail.com" | "Vassar@123" | ""      | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | ""         | "City name is required" | ""                                     | ""   | ""          |
      | "testadmin@yopmail.com" | "Vassar@123" | ""      | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | ""           | " Company details added Successfully " | "C:/Users/user/Downloads/profiles.png" | "C:/Users/user/Downloads/profiles.png" |





