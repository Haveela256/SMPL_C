Feature: Super Admin MarketPlace Module


  Scenario Outline: Open MarketPlace module of a company
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
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
      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | ComplianceExpert | Email                      | Subject               | Body                           | ErrorMessage | ToasterMessagee                                       | ToasterMessageee                                         | ErrorMessage | ExpertName | ToasterMessage1        | EmailToaster                |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request for renewal" | "Subscription is going to end" | ""           | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | ""           | "Abhi"     | "Invited Successfully" | " Email Send Successfully " |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request for renewal" | "Subscription is going to end" | ""           | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | ""           | "Abhi"     | "Invited Successfully" | " Email Send Successfully " |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request for renewal" | "Subscription is going to end" | ""           | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | ""           | "Abhi"     | "Invited Successfully" | " Email Send Successfully " |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" | "Abhi"           | "gaplite.test@yopmail.com" | "request for renewal" | "Subscription is going to end" | ""           | "Association request successfully sent to superadmin" | "Un-Association request successfully sent to superadmin" | ""           | "Abhi"     | "Invited Successfully" | " Email Send Successfully " |
