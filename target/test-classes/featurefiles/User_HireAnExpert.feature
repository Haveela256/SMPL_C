Feature: User MarketPlace module

  Scenario Outline: validate the Marketplace page

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the MarketPlace module
    And validate the search icon functionality <ComplianceExpert>
    And validate the Invite compliance expert button functionality
    And  validate the invite compliance expert popup
    And validate the cancel button of invite compliance expert popup
    And validate the email textfield of invite complianceexpert popup <Email> <ErrorMessage> <ToasterMessage1>
    And Validate the ellipsis <ExpertName>
    And validate the Download details option <ExpertName>
    And validate the Email option <ExpertName>
    And validate the send email popup functionality <Email> <EmailToaster> <ErrorMessage> <Subject> <Body>
    And validate the ask to associate <ToasterMessagee> <ExpertName> <ToasterMessageee>

    Examples:
      | Example          | EmailAddress            | Password     | Toaster | ComplianceExpert | Email                      | Subject                  | Body                           | ErrorMessage             | ExpertName | ToasterMessagee                                       | ToasterMessageee                                         | ToasterMessage1        | EmailToaster                |
      | SearchValid      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | SearchIvalid     | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "123"            | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | ""         | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | Valid email      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | Invalid email    | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Abhi"           | "123"                      | "request to super admin" | "Subscription is going to end" | "Email is Invalid"       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | Blank Email      | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Abhi"           | ""                         | "request to super admin" | "Subscription is going to end" | "Email is Required"      | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | Blank Email body | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | ""                             | "Email Body is Required" | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | Ask to Associate | "smpl.user@yopmail.com" | "Vassar@123" | ""      | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |