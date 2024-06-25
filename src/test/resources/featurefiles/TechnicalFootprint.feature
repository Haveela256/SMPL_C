Feature: Technical Footprint

  Scenario Outline: Add details on technical Footprint
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the Technical Footprint module
    And Click on the panels, checkboxes and Click on the other textfield and enter data <FirstQstn> <SecondQstnNoOfUsers> <ThirdQstnTypeOfCUI> <FourthQstn> <FifthQstnPurposeOfSystem> <SixthQstn> <SeventhQstn>  <EighthQstn> <NinethQstn> <TenthQstn>  <EleventhQstn>  <TwelthQstn> <TextfieldData> and verify <ToasterMessage>
    And Click on the cancel button
    Then Click on the Submit button <FirstQstn> <SecondQstnNoOfUsers> <ThirdQstnTypeOfCUI> <FourthQstn> <FifthQstnPurposeOfSystem> <SixthQstn> <SeventhQstn>  <EighthQstn> <NinethQstn> <TenthQstn>  <EleventhQstn>  <TwelthQstn> <TextfieldData> and verify <ToasterMessage>

    Examples:
      | EmailAddress            | Password     | Toaster | FirstQstn | SecondQstnNoOfUsers | ThirdQstnTypeOfCUI                                                                    | FourthQstn | FifthQstnPurposeOfSystem | SixthQstn       | SeventhQstn                      | EighthQstn          | NinethQstn   | TenthQstn   | EleventhQstn | TwelthQstn   | ToasterMessage                                  | TextfieldData         |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Yes"     | "30"                | "Process A process receives input data and produces output with a different content " | "Yes"      | "To protect the system"  | "Microsoft 365" | "Cisco Next-Generation Firewall" | "Microsoft Project" | "QuickBooks" | "SAP Ariba" | "BambooHR"   | "IBM Maximo" | " Company security details saved successfully " | "CMMC Ceritification" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" |         | "No"      | "30"                | "Process A process receives input data and produces output with a different content " | "No"       | "To protect the system"  | "Google Workspace" | "Symante Endpoint Protection"    | "Jira (by Atlassian)" | "FreshBooks"      | "Oracle SCM Cloud"                         | "Gusto"           | "SAP Asset Manager" | ""                                              | "CMMC Ceritification" |
     # | "Vassar.qa@yopmail.com" | "Vassar@123" |         | "Hybrid"  | "30"                | "Process A process receives input data and produces output with a different content " | ""         | "To protect the system"  | "Slack"         | "BitLocker"                      | "BaseCamp"          | "Oracle NetSuite" | "Fishbowl Inventory"                       | "LinkedIn Talent" | "Oracle EAM" | ""                                              | "CMMC Ceritification" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" |         | ""        | "30"                | "Process A process receives input data and produces output with a different content " | ""         | "To protect the system"  | "Asana"         | "Palo Alto"                      | "SmartSheet"        | "Sage Intacct" | "Infor CloudSuite Supply Chain Management" | "Workday"     | "Infor EAM"  | ""                                              | "CMMC Ceritification" |
      #| "Vassar.qa@yopmail.com" | "Vassar@123" |         | ""        | "30"                | "Process A process receives input data and produces output with a different content " | ""         | "To protect the system"  | "Trello"        | "Fortinet"                       | "Wrike"             | "Xero"       | "JDA Software /Blue Yonder" | "Zoho People" | "IFS ESM"    | ""                                              | "CMMC Ceritification" |
     # | "Vassar.qa@yopmail.com" | "Vassar@123" |         | ""        | "30"                | "Process A process receives input data and produces output with a different content " | ""         | "To protect the system"  | "Other"         | "Other"                          | "Other"             | "Other"      | "Other"     | "Other"      | "Other"      | ""                                              | "CMMC Ceritification" |

















