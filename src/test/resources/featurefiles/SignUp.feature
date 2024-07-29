Feature: Sign Up

  Scenario Outline: Admin Sign Up
<<<<<<< HEAD
=======

>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Send invite to customer admin <Email> <Subscription> <OrderNumber>
    And Click on Register button <Email>
    And Verify the Sign Up page
    And Validate the First Name text field functionality <FirstName>
    And Validate the Middle Name text field functionality <MiddleName>
    And Validate the Last Name text field functionality <LastName>
    And Verify the Email text field
    And Validate the Password text field functionality <PasswordField>
    And Validate the Upload Resume button functionality by uploading a file <UploadFile>
    And Validate the Re-Upload Resume button functionality <ReUploadFile>
    And Validate the I agree with Smpl-cs Checkbox functionality
    And Validate the Terms of Service, Privacy Policy hyperlink
    And Validate the Create Account button functionality <ErrorMessage> <ToasterMessage>
    Examples:
<<<<<<< HEAD
      | EmailAddress             | Password   | Toaster | FirstName | MiddleName | LastName  | PasswordField | ErrorMessage            | ToasterMessage | UploadFile | ReUploadFile | Email                    | Subscription         | OrderNumber |
=======
      | EmailAddress         | Password   | Toaster | FirstName | MiddleName | LastName  | PasswordField | ErrorMessage            | ToasterMessage | UploadFile | ReUploadFile | Email                    | Subscription         | OrderNumber |
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
      | "smplappc@gmail.com" | "Bond@009" | ""      | "123"     | "Wild"     | "Chopper" | "Vassar@123"  | "First Name is Invalid" | ""             | ""         | ""           | "admin.smpl@yopmail.com" | "L-2 Gap Assessment" | "1234"      |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | ""        | "Wild"     | "Chopper" | "Vassar@123"  | "First Name is required"                                 | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-1 Gap Assessment" | "129"       |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | "Jones"   | "123"      | "Chopper" | "Vassar@123"  | "Middle Name is Invalid"                                 | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-2 Gap Assessment" | "374"       |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | "Jones"   | "Wild"     | "123"     | "Vassar@123"  | "Last Name is Invalid"                                   | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-1 Gap Assessment" | "654"       |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | "Jones"   | "Wild"     | ""        | "Vassar@123"  | "Last Name is required"                                  | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-2 Gap Assessment" | "234"       |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | "Jones"   | "Wild"     | "Chopper" | "123"         | "Password must be at least 8 characters long"            | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-1 Gap Assessment" | "789"       |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | "Jones"   | "Wild"     | "Chopper" | "12345678"    | "Password must contain at least one Uppercase character" | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-2 Gap Assessment" | "2357"      |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | "Jones"   | "Wild"     | "Chopper" | ""            | "Password is required"  | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-1 Gap Assessment" | "369"       |
      #| "smplappc@yopmail.com" | "Bond@009" | ""      | "Jones"   | "Wild"     | "Chopper" | "Vassar@123"  | ""                      | ""             | ""         | ""           | "admin.smpl@yopmail.co"  | "L-2 Gap Assessment" | "001"       |

