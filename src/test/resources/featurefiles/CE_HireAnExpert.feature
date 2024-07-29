Feature: Hire An Expert page of Compliance Expert


  Scenario Outline: Validate Hire An Expert page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
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
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | ComplianceExpert | Email                      | Subject                  | Body                           | ErrorMessage             | ExpertName | ToasterMessagee                                       | ToasterMessageee                                         | ToasterMessage1        | EmailToaster                |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "123"            | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | ""         | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Abhi"           | "123"                      | "request to super admin" | "Subscription is going to end" | "Email is Invalid"       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Abhi"           | ""                         | "request to super admin" | "Subscription is going to end" | "Email is Required"      | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | ""                             | "Email Body is Required" | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request to super admin" | "Subscription is going to end" | ""                       | "Abhi"     | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | "Invited Successfully" | " Email Send Successfully " |