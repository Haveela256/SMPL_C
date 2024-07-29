Feature: Reporting of Compliance Expert


  Scenario Outline: Validate Reporting page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status of Compliance Expert <Toaster>
    And Validate the card functionality <CompanyName>
    And  validate the signIn to company functionality <ToasterMessage>
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
      | EmailAddress                  | Password     | Toaster | CompanyName | ToasterMessage                     | PoamDownloadToaster                    | TemplateDownloadSuccessful         |
      | "smpl.compliance@yopmail.com" | "Vassar@123" | ""      | "Inkriti"   | "Sign In Into Company Successfull" | "POA&M Report downloaded successfully" | "Template downloaded successfully" |

