Feature: Manage Users module

  Scenario Outline: Managing Users

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click n the Manage Users module
    And Validate search field <FirstName>
    And Click on the Add user icon and verify the Add User popup
    And Add users by providing the <FirstName> <MiddleName> <LastName> <Email> <Designation> <SuccessfulToaster> <ErrorToaster> <ErrorMessage>
    And Click on the Submit button with and without entering all fields and verify <SuccessfulToaster> <ErrorToaster> <ErrorMessage>
    And Verify the added user <Email>
    And Click on the Unlock and Lock icon of <FirstName> <LastName> <Email>
    And Edit the details of by changing <FirstName> <MiddleName> <LastName> <Email> <Designation> or <NewDetails>
    And Delete the user by providing <FirstName> <LastName> <ErrorMessage> <SuccessfulToaster> <ErrorToaster> <Email> <DeleteToaster>
    Examples:
      | Example           | EmailAddress               | Password     | Toaster | FirstName | MiddleName | LastName    | Email                  | Designation | SuccessfulToaster         | ErrorToaster             | ErrorMessage              | DeleteToaster               | NewDetails |
      | Add user          | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "Evangelin" | "ruth.12@yopmail.com"  | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | ""                        | "User Deleted Successfully" | "James"    |
      | Existing user     | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "Ruth"      | "ruth.124@yopmail.com" | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | ""                        | "User Deleted Successfully" | "James"    |
      | invalid FirstName | "random3.test@yopmail.com" | "Vassar@123" | ""      | "123"     | "Ruth"     | "Evangelin" | "ruth.125@yopmail.com" | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | " First name is Invalid " | "User Deleted Successfully" | "James"    |
      | invalid LastName    | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "123"       | "ruth.126@yopmail.com" | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | " Last name is Invalid "                          | "User Deleted Successfully" | "James"    |
      | invalid Designation | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "Evangelin" | "ruth.127@yopmail.com" | "hg"        | "User Added Successfully" | "Email Id Already Exist" | "Please enter a title with at least 3 characters" | "User Deleted Successfully" | "James"    |
      | invalid Email       | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "Evangelin" | "123"                  | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | " Email is not Valid "     | "User Deleted Successfully" | "James"    |
      | invalid Middle Name | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "12e"      | "Evangelin" | "ruth.128@yopmail.com" | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | " Middle name is Invalid " | "User Deleted Successfully" | "James"    |
      | blank First Name  | "random3.test@yopmail.com" | "Vassar@123" | ""      | ""        | "Ruth"     | "Evangelin" | "ruth.129@yopmail.com" | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | "First name is Required"  | "User Deleted Successfully" | "James"    |
      | blank Last Name   | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | ""          | "ruth.130@yopmail.com" | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | "Last name is Required"   | "User Deleted Successfully" | "James"    |
      | blank designation | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "Evangelin" | "ruth.122@yopmail.com" | ""          | "User Added Successfully" | "Email Id Already Exist" | "Title is Required"       | "User Deleted Successfully" | "James"    |
      | blank email       | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "Evangelin" | ""                     | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | "Email is Required"       | "User Deleted Successfully" | "James"    |
      | edit user         | "random3.test@yopmail.com" | "Vassar@123" | ""      | "Carla"   | "Ruth"     | "Evangelin" | "ruth.131@yopmail.com" | "Manager"   | "User Added Successfully" | "Email Id Already Exist" | ""                        | "User Deleted Successfully" | "James"    |








