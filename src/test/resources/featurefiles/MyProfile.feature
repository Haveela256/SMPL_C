Feature: My Profile

  Scenario Outline: Add profile details

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the My Profile option
    And Click on the edit button
    And Validate the cancel button
    And Add the profile details <FirstName> <MiddleName> <LastName> <Designation> <File> <ReplaceFile>
    And Add profile and verify crop popup <File>
    Then Validate the Submit button and verify <FirstName> <MiddleName> <LastName> <Designation> <ErrorMessage> <DetailsUpdatedToaster> <ErrorToaster>
    Then Validate replace icon <ReplaceFile>
    Examples:
      | EmailAddress | Password     | Toaster | FirstName | MiddleName | LastName | Designation | ErrorMessage                 | DetailsUpdatedToaster | ErrorToaster | File                                   | ReplaceFile                             |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "Ruth"   | "Manager"   | ""           | "Profile updated successfully" | ""           | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      #| "Vassar.qa@yopmail.com"  | "Vassar@123" | ""      | "1234"    | "queen"    | "Ruth"   | "Manager"   | "Only Alphabets are allowed" | ""                             | ""           | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "javatest@yopmail.com"           | "Vassar@123" | ""      | "Carla"   | "1234"     | "Ruth"   | "Manager"   | "Only Alphabets are allowed" | ""                    | ""           | "C:/Users/user/Downloads/profiles.png" | "C:/Users/user/Downloads/app icon.png" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "1234"   | "Manager"   | "Only Alphabets are allowed" | ""                             | ""           | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "Ruth"   | "1234"      | "Only Alphabets are allowed" | ""                             | ""           | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""        | "queen"    | "Ruth"   | "Manager"   | "First Name is required" | ""                             | ""           | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | ""       | "Manager"   | Last Name is required | ""                             | ""           | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""        | ""         | ""       | ""          | ""           | ""                             | ""           | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |






