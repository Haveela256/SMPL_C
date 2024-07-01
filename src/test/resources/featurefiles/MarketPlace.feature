Feature: MarketPlace module

  Scenario Outline: validate the Marketplace page

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the MarketPlace module
    And validate the search icon functionality <ComplianceExpert>
    And validate the Invite compliance expert button functionality
    And  validate the invite compliance expert popup
    And validate the cancel button of invite compliance expert popup
    And validate the email textfield of invite complianceexpert popup <Email> <ErrorMessage> <ToasterMessage>
    And validate the submit button of invite compliance expert popup
    And validate the ellipsis
    And validate the Download details option
    And validate the Email option
    And  validate the send email popup functionality <Email> <ToasterMessage> <ErrorMessage>
    And validate the ask to associate <ToasterMessage>
    Examples:
      | Example       | EmailAddress            | Password     | Toaster | ComplianceExpert | Email | ErrorMessage       | ToasterMessage | ErrorMessage |
      #| SearchValid   | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Donovan Skyy"     | ""                                      | ""                 | ""                                                      | ""                       |
      #| SearchIvalid  | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "123"            | ""                                      | ""                 | ""                                                      | ""                       |
      #| Valid email   | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""               | "gaplite.test@yopmail.com"              | ""                 | " Invited Successfully "                                | ""                       |
      | Invalid email | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Donovan Skyy"               | ""    | "Email is Invalid" | ""             | ""           |
     # | Blank Email   | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""               | ""                                      | ""                 | ""                                                      | "Email is Required"      |
      #| email Subject | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""               | "request to super admin"                | ""                 | ""                                                      | "Email Body is Required" |
      #| Email body    | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""               | "Request to make the profile as expert" | ""                 | " Email Send Successfully "                             | ""           |
      #|Ask to Associate               | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | ""               | ""    | ""                 | " Association request successfully sent to superadmin " | ""           |