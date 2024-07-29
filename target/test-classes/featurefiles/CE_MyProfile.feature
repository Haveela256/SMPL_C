Feature: My Profile page of compliance expert

  Scenario Outline: Add profile details or edit profile details
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And click on the My Profile option
    And click on the edit button
    And validate the cancel button
    And Add profile image and Verify crop popup <File>
    And Add the profile details or edit <FirstName> <MiddleName> <LastName> <UploadResume> <EmailAddress> of Compliance expert
    Then validate replace icon <ReplaceFile>
    Then validate the Submit button <ErrorMessage> <DetailsUpdatedToaster>
    Examples:
      | EmailAddress                  | Password     | Toaster | FirstName | MiddleName | LastName | UploadResume                          | ErrorMessage                 | DetailsUpdatedToaster          | File                                   | ReplaceFile                             |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "Ruth"   | "C:/Users/user/Downloads/Resume.xlsx" | ""                           | "Profile updated successfully" | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "1234"    | "queen"    | "Ruth"   | "C:/Users/user/Downloads/Resume.xlsx" | "Only Alphabets are allowed" | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "1234"     | "Ruth"   | "C:/Users/user/Downloads/Resume.xlsx" | "Only Alphabets are allowed" | ""                             | "C:/Users/user/Downloads/profiles.png" | "C:/Users/user/Downloads/app icon.png"  |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "1234"   | "C:/Users/user/Downloads/Resume.xlsx" | "Only Alphabets are allowed" | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | "Ruth"   | "C:/Users/user/Downloads/Resume.xlsx" | "Only Alphabets are allowed" | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | ""        | "queen"    | "Ruth"   | "C:/Users/user/Downloads/Resume.xlsx" | "First Name is required"     | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "queen"    | ""       | "C:/Users/user/Downloads/Resume.xlsx" | "Last Name is required"      | ""                             | "C:/Users/user/Downloads/app icon.png" | "C:/Users/user/Downloads/image (3).png" |






