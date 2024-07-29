Feature: Super Admin landing page


  Scenario Outline: Login to the page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Hamburger icon
    And Validate the SMPL-C logo
    And Validate the Sort dropdown functionality by selecting a option
    And Validate the Toggle button functionality
    And validate the sort functionality of unsigned Companies
    And Validate the Invite button functionality
    And Validate the Email Address text field functionality by entering valid and invalid email addresses <Email> <ErrorMessage>
    And Validate the Subscription dropdown functionality by selecting a value <Type> <ErrorMessage>
    And Validate the Order Number text field functionality <OrderNumber> <ErrorMessage>
    And Validate the Submit button functionality by entering and without entering the fields <ToasterMessage> <ErrorMessage>
    And Verify the Company cards
    And Validate the Vertical Ellipsis icon functionality
    And Validate the Lock option functionality <CompanyCard> <LockToasterMessage>
    And Validate the Unlock option functionality <CompanyCard> <UnlockToasterMessage>
    And Validate the Delete option functionality <DeleteCard> <DeleteToasterMessage>
    And Verify the Are you sure to delete  popup <DeleteToasterMessage>
    And Validate the Send Email popup <CompanyCard> <Subject> <Body> <EmailSentToaster>
    And  Validate the Renew option functionality <CompanyCard> <RenewToasterMessage>
    And Validate the Company card functionality <CompanyCard> <ToasterMessage>
    And Verify the Company page
    And Validate the Switch Company module functionality
    And Validate the  User Profile icon or Expand icon functionality
    And Validate the Logout option functionality


    Examples:
      | Example                          | EmailAddress         | Password   | Toaster | Email                       | DeleteCard      | Type                       | OrderNumber | CompanyCard     | LockToasterMessage    | UnlockToasterMessage    | DeleteToasterMessage   | RenewToasterMessage        | ErrorMessage               | Subject          | Body                                                       | ToasterMessage                       | EmailSentToaster            |
      | Invite Customer admin            | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount1@yopmail.com"  | "companyDelete" | " L-1 Gap Assessment "     | "123"       | "Inkriti" | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | ""                         | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | "Email Send Successfully"   |
      | Invalid Email                    | "smplappc@gmail.com" | "Bond@009" | ""      | "123"                       | ""              | " L-2 Gap Assessment "     | "456"       | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | " Email is Invalid "       | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | Blank Email                      | "smplappc@gmail.com" | "Bond@009" | ""      | ""                          | ""              | " L-2 Gap Assessment "     | "3246"      | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | " Email is Required "      | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | L-2 Gap Assessment               | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount4@yopmail.com"  | ""              | " L-2 Gap Assessment "     | "765"       | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | ""                         | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | L-2 Certification Prep           | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount5@yopmail.com"  | ""              | " L-1 Self Attestation "   | "6545"      | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | ""                         | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | L-2 Certification Prep           | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount6@yopmail.com"  | ""              | " L-2 Certification Prep " | "0987"      | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | ""                         | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | Compliance Expert                | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount7@yopmail.com"  | ""              | " Compliance Expert "      | "233"       | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | ""                         | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | Blank Subscription               | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount8@yopmail.com"  | ""              | ""                         | "987"       | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | "Subscription is Required" | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | Blank Order Number               | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount9@yopmail.com"  | ""              | " L-2 Certification Prep " | ""          | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | "Order number is Required" | "Renew reminder" | "Subscription is going to end in few days please renew it" | " Sign In Into Company Successfull " | " Email Send Successfully " |
      | Blank Email for send Email popup | "smplappc@gmail.com" | "Bond@009" | ""      | "TestAccount10@yopmail.com" | ""              | "L-2 Certification Prep"   | "324"       | "Inkriti"       | "Locked successfully" | "Unlocked successfully" | "Deleted successfully" | "Account has been renewed" | " Email Body is Required " | "Renew reminder" | ""                                                         | " Sign In Into Company Successfull " | " Email Send Successfully " |

