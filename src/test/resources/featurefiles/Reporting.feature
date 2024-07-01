Feature: Gap Assessment Module

  Scenario Outline: Validate Gap Assessment Module
    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
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
      | EmailAddress            | Password     | Toaster | PoamDownloadToaster                    | TemplateDownloadSuccessful         |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "POA&M Report downloaded successfully" | "Template downloaded successfully" |
