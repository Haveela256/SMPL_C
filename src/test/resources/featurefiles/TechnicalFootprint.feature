Feature: Technical Footprint

  Scenario Outline: Add details on technical Footprint
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Click on the Technical Footprint module
    And Click on the cancel button
    And Click on the panels, checkboxes and Click on the other textfield and enter data <FirstQstn> <SecondQstnNoOfUsers> <ThirdQstnTypeOfCUI> <FourthQstn> <FifthQstnPurposeOfSystem> <SixthQstn> <SeventhQstn>  <EighthQstn> <NinethQstn> <TenthQstn>  <EleventhQstn>  <TwelthQstn> <TextfieldData> and verify <ToasterMessage>
    Then Click on the Submit button <FirstQstn> <SecondQstnNoOfUsers> <ThirdQstnTypeOfCUI> <FourthQstn> <FifthQstnPurposeOfSystem> <SixthQstn> <SeventhQstn>  <EighthQstn> <NinethQstn> <TenthQstn>  <EleventhQstn>  <TwelthQstn> <TextfieldData> and verify <ToasterMessage>

    Examples:
      | EmailAddress            | Password     | Toaster | FirstQstn       | SecondQstnNoOfUsers | ThirdQstnTypeOfCUI                                                                   | FourthQstn | FifthQstnPurposeOfSystem | SixthQstn                                                 | SeventhQstn                                                                                     | EighthQstn                                                             | NinethQstn                                                      | TenthQstn                                                                                                                                    | EleventhQstn                                               | TwelthQstn                                                        | ToasterMessage                                  | TextfieldData                         |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Yes,No,Hybrid" | "30"                | "Process A process receives input data and produces output with a different content" | "Yes,No"   | "To protect the system"  | "Microsoft 365,Google Workspace,Slack,Asana,Trello,Other" | "Cisco Next-Generation Firewall,Symante Endpoint Protection,BitLocker,Palo Alto,Fortinet,Other" | "Microsoft Project,ira (by Atlassian),BaseCamp,SmartSheet,Wrike,Other" | "QuickBooks,FreshBooks,Oracle NetSuite,Sage Intacct,Xero,Other" | "SAP Ariba,Oracle SCM Cloud,Fishbowl Inventory,Infor CloudSuite Supply Chain Management,JDA Software /Blue Yonder,JDA Software /Blue Yonder" | "BambooHR,Gusto,LinkedIn Talent,Workday,Zoho People,Other" | "IBM Maximo,SAP Asset Manager,Oracle EAM,Infor EAM,IFS ESM,Other" | " Company security details saved successfully " | "data to be entered in the textfield" |













