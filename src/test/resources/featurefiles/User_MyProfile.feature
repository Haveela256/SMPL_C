Feature: User My Profile page

  Scenario Outline: Add profile details or edit profile details

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And click on the My Profile option
    And click on the edit button
    And validate the cancel button
    And Add profile image and Verify crop popup <File>
    And Add the profile details or edit <FirstName> <MiddleName> <LastName> <Designation> <EmailAddress>
    Then validate replace icon <ReplaceFile>
    Then validate the Submit button <ErrorMessage> <DetailsUpdatedToaster>
    Examples:
      | EmailAddress            | Password     | Toaster | FirstName | MiddleName | LastName | Designation | ErrorMessage                 | DetailsUpdatedToaster          | File                                   | ReplaceFile                             |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "Ruth"   | "Manager"   | ""                           | "Profile updated successfully" | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "1234"    | "queen"    | "Ruth"   | "Manager"   | "Only Alphabets are allowed" | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "1234"     | "Ruth"   | "Manager"   | "Only Alphabets are allowed" | ""                             | "C:/Users/user/Downloads/profiles.png" | "C:/Users/user/Downloads/app icon.png"  |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "1234"   | "Manager"   | "Only Alphabets are allowed" | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | ""        | "queen"    | "Ruth"   | "Manager"   | "First Name is required"     | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | ""       | "Manager"   | "Last Name is required"      | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |






