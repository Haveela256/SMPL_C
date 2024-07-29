<<<<<<< HEAD
Feature: Super admin Reporting module


  Scenario Outline: Validate the Reporting module
=======
Feature: Super admin Company details Module


  Scenario Outline: Open Company details of a company
>>>>>>> 39f7f0990eecc162198cf20a681bb85fc78868c2
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company functionality <CompanyCard> <ToasterMessage>
    And Click on the Reporting module and click on the Reports sub-module
    And click on the Prioritized Remeditaion Plan card
    And click on the download Icons of Plan of Action & Milestones (POA&M) Report <PoamDownloadToaster>
    And click on the Initial System Security Plan Report card
    And click on the Templates sub-module
    And click on the Download icon of Scope Document <TemplateDownloadSuccessful>
    And click on the Download icon of Asset Inventory <TemplateDownloadSuccessful>
    And click on the Download icon of Data flow diagram <TemplateDownloadSuccessful>
    And click on the Download icon of GAP Assessment Risk Register Template <TemplateDownloadSuccessful>
    And click on the Download icon of Risk Assessment Overview Template <TemplateDownloadSuccessful>
    And click on the Download icon of Shared Responsibilities Matrix Template <TemplateDownloadSuccessful>
    And click on the Download icon of Incident Response Plan Template <TemplateDownloadSuccessful>


    Examples:

      | EmailAddress         | Password   | Toaster | CompanyCard                 | ToasterMessage                     | PoamDownloadToaster                    | TemplateDownloadSuccessful         |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "random3.test@yopmail.com"  | "Sign In Into Company Successfull" | "POA&M Report downloaded successfully" | "Template downloaded successfully" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.qa@yopmail.com"     | "Sign In Into Company Successfull" | "POA&M Report downloaded successfully" | "Template downloaded successfully" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Vassar.tester@yopmail.com" | "Sign In Into Company Successfull" | "POA&M Report downloaded successfully" | "Template downloaded successfully" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "vassar.labs@yopmail.com"   | "Sign In Into Company Successfull" | "POA&M Report downloaded successfully" | "Template downloaded successfully" |