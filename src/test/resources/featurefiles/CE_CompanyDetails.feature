Feature: Company Details page of Compliance Expert


  Scenario Outline: Validate Company Details page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
    And Click on the Edit button
    And Validate the cancel button
    And Add the following company details <CompanyName> <FEINno> <URL> <DUNSno> <Phone> <AddressOne> <AddressTwo> <ZipCode> <City>
    And Upload Profile and verify Crop popup <File> <ReplaceFile>
    Then Validate the submit button and verify <CompanyName> <FEINno> <URL> <DUNSno> <Phone> <AddressOne> <AddressTwo> <ZipCode> <City> <ErrorMessage> <CompanyDetailsUpdatedToaster> <ReplaceFile> <File>
    And click on the replace icon and add profile <File> <ReplaceFile>

    Examples:
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | CompanyName  | FEINno       | URL               | DUNSno      | Phone          | AddressOne  | AddressTwo   | ZipCode | City       | ErrorMessage               | CompanyDetailsUpdatedToaster           | File                                   | ReplaceFile                            |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | ""                         | " Company details added Successfully " | "C:/Users/user/Downloads/profiles.png" | "C:/Users/user/Downloads/profiles.png" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | ""           | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | "Company Name is required" | ""                                     | "C:/Users/user/Downloads/profiles.png" | "C:/Users/user/Downloads/profiles.png" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "VassarLabs" | ""           | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | "FEIN No. is required"     | ""                                     | ""                                     | ""                                     |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | ""             | "Mindspace" | "Building 9" | "50008" | "Hyderbad" | "Phone number is required" | ""                                     | ""                                     | ""                                     |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | ""      | "Hyderbad" | "Zipcode is required"      | ""                                     | ""                                     | ""                                     |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "VassarLabs" | "12-1234567" | "vassar.labs.com" | "432543346" | "123-123-1234" | "Mindspace" | "Building 9" | "50008" | ""         | "City name is required"    | ""                                     | ""                                     | ""                                     |