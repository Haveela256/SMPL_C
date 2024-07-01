Feature: Manage Users module

  Scenario Outline: Managing Users

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click n the Manage Users module
    And Click on the Add user icon and verify the Add User popup
    And Add users by providing the <FirstName> <MiddleName> <LastName> <Email> <Designation> <SuccessfulToaster> <ErrorToaster> <ErrorMessage>
    And Click on the Submit button with and without entering all fields and verify <SuccessfulToaster> <ErrorToaster> <ErrorMessage>
    And Verify the added user <Email>
    And Click on the Unlock and Lock icon of <FirstName> <LastName> <Email>
    And Edit the details of by changing <FirstName> <MiddleName> <LastName> <Email> <Designation> or <NewDetails>
    And Delete the user by providing <FirstName> <LastName> <Email> <SuccessfulToaster> <ErrorToaster> <ErrorMessage> <DeleteToaster>
    Examples:
      | Example             | EmailAddress            | Password                | Toaster | FirstName | MiddleName | LastName | Email                        | Designation | SuccessfulToaster           | ErrorToaster | ErrorMessage                                      | DeleteToaster                 | NewDetails |
      | invalid FirstName   | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "123"     | "Tee"      | "Tester" | "haveela.demo@yopmail.com"   | "Tester"    | ""                          | ""           | " First name is Invalid "                         | ""                            | ""         |
      | invalid LastName    | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "Tee"      | "123"    | "haveela.demo@yopmail.com"   | "Tester"    | ""                          | ""           | " Last name is Invalid "                          | ""                            | ""         |
      | invalid Designation | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "Tee"      | "Tester" | "haveela.demo@yopmail.com"   | "hg"        | ""                          | ""           | "Please enter a title with at least 3 characters" | ""                            | ""         |
      | invalid email       | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "Tee"      | "Tester" | "123"                        | "Tester"    | ""                          | ""           | " Email is not Valid "                            | ""                            | ""         |
      | invalid Middle Name | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "12e"      | "Tester" | "haveela.demo@yopmail.com"   | "Tester"    | ""                          | ""           | " Middle name is Invalid "                        | ""                            | ""         |
      | blank First Name    | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | ""        | "Tee"      | "Tester" | "haveela.demo@yopmail.com"   | "Tester"    | ""                          | ""           | "First name is Required"                          | ""                            | ""         |
      | blank Last Name     | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "Tee"      | ""       | "haveela.demo@yopmail.com"   | "Tester"    | ""                          | ""           | "Last name is Required"                           | ""                            | ""         |
      | blank designation   | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "Tee"      | "Tester" | "haveela.demo@yopmail.com"   | ""          | ""                          | ""           | "Title is Required"                               | ""                            | ""         |
      | blank email         | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "Tee"      | "Tester" | ""                           | "Tester"    | ""                          | ""           | "Email is Required"                               | ""                            | ""         |
      | valid user details  | "Vassar.qa@yopmail.com" | "Vassar@123"            | ""      | "Haveela" | "Tee"      | "Tester" | " haveela.demo@yopmail.com " | "Tester"    | " User Added Successfully " | ""           | ""                                                | ""                            | ""         |
      | edit user           | "Vassar.qa@yopmail.com" | "Vassar.qa@yopmail.com" | ""      | ""        | ""         | ""       | "haveela.demo@yopmail.com"   | ""          | ""                          | ""           | ""                                                | ""                            | "James"    |
      | delete              | "Vassar.qa@yopmail.com" | "Vassar.qa@yopmail.com" | ""      | ""        | ""         | ""       | "haveela.demo@yopmail.com"   | ""          | ""                          | ""           | ""                                                | " User Deleted Successfully " | ""         |








