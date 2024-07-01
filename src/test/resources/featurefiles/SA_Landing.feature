Feature: Sign In page of Compliance Expert


  Scenario Outline: Login to the page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the Hamburger icon
    And Validate the SMPL-C logo
    And Validate the Sort dropdown functionality by selecting a option
    And Validate the Toggle button functionality
    And Validate the Invite button functionality
    And Validate the Email Address text field functionality by entering valid and invalid email addresses <Email> <ErrorMessage>
    And Validate the Subscription dropdown functionality by selecting a value <Type> <ErrorMessage>
    And Validate the Order Number text field functionality <OrderNumber> <ErrorMessage>
    And Validate the Submit button functionality by entering and without entering the fields <ToasterMessage>
    And Verify the Company cards
    And Validate the Vertical Ellipsis icon functionality
    And Validate the Lock option functionality <CompanyCard> <ToasterMessage>
    And Validate the Unlock option functionality <CompanyCard> <ToasterMessage>
    And Validate the Delete option functionality <CompanyCard> <ToasterMessage>
    And Verify the Are you sure to delete  popup <ToasterMessage>
    And Validate the Send Email popup
    And  Validate the Renew option functionality <CompanyCard> <ToasterMessage>
    And Validate the Company card functionality <CompanyCard> <ToasterMessage>
    And Verify the Company page
    And Validate the Switch Company module functionality
    And Validate the  User Profile icon or Expand icon functionality
    And Validate the Logout option functionality


    Examples:
      | EmailAddress         | Password   | Toaster | Email | Type | OrderNumber | CompanyCard | ToasterMessage | ErrorMessage | Emaill |
      | "smplappc@gmail.com" | "Bond@009" | ""      | ""    | ""   | ""          | ""          | ""             | ""           | ""     |