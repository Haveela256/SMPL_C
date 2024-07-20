Feature: Super Admin landing page


  Scenario Outline: Login to the page
    When Validate the Sign In button functionality by entering valid,invalid credentials <EmailAddress> <Password> and  Verify the signIn status <Toaster>
    And Validate the Company card functionality <CompanyCard> <ToasterMessage>
    And Verify the Company page
    And Validate homepage and lightBulb of super admin
    And Validate the Hamburger icon functionality
    And Validate the SMPL-C logo functionality
    And Verify cmmc Journey <CMMCJourney>
    And Verify the Discovery card <DiscoveryScope> <DiscoveryAsset> <DiscoveryDatFlow>
    And Verify the Gap Assessment card <GapAssessmentBaseline>    <GapAssessmentPoam>    <GapAssessmentPiee>    <GapAssessmentPrioritized>    <GapAssessmentRisk>    <GapAssessmentIncident>    <GapAssessmentMSP>
    And Validate the i icon of the Remediation card <Remediation>
    And Verify the Audit Readiness card <AuditReadinessSSP>    <AuditReadinessPolicies>    <AuditReadinessSupport>    <AuditReadinessPiee>    <AuditReadinessChecklist>
    And Validate  icon of the Engage CPAO card <EngageCPAO>
    And Validate the Expand icon functionality of Side panel



    Examples:
      | EmailAddress         | Password   | Toaster | CompanyCard  | ToasterMessage                     | CMMCJourney          | Remediation   | EngageCPAO     | DiscoveryScope   | DiscoveryAsset    | DiscoveryDatFlow | GapAssessmentBaseline                 | GapAssessmentPoam                   | GapAssessmentPiee                                             | GapAssessmentPrioritized       | GapAssessmentRisk      | GapAssessmentIncident    | GapAssessmentMSP                   | AuditReadinessSSP                  | AuditReadinessPolicies          | AuditReadinessSupport             | AuditReadinessPiee                                       | AuditReadinessChecklist         |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Inkriti"    | "Sign In Into Company Successfull" | "Start CMMC Journey" | "Remediation" | "Engage C3PAO" | "Scope Document" | "Asset Inventory" | "Data flow"      | "Baseline System Security Plan (SSP)" | "Plan of Action & Milestone (POAM)" | "Assessment PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Prioritized Remediation Plan" | "Risk Assessment Plan" | "Incident Response Plan" | "MSP Shared Responsibility Matrix" | "Final System Security Plan (SSP)" | "Final Policies and Procedures" | "Supporting Evidence & Artifacts" | "Final PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Readiness Checklist for C3PAO" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "Google"     | "Sign In Into Company Successfull" | "Start CMMC Journey" | "Remediation" | "Engage C3PAO" | "Scope Document" | "Asset Inventory" | "Data flow"      | "Baseline System Security Plan (SSP)" | "Plan of Action & Milestone (POAM)" | "Assessment PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Prioritized Remediation Plan" | "Risk Assessment Plan" | "Incident Response Plan" | "MSP Shared Responsibility Matrix" | "Final System Security Plan (SSP)" | "Final Policies and Procedures" | "Supporting Evidence & Artifacts" | "Final PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Readiness Checklist for C3PAO" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "barfi"      | "Sign In Into Company Successfull" | "Start CMMC Journey" | "Remediation" | "Engage C3PAO" | "Scope Document" | "Asset Inventory" | "Data flow"      | "Baseline System Security Plan (SSP)" | "Plan of Action & Milestone (POAM)" | "Assessment PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Prioritized Remediation Plan" | "Risk Assessment Plan" | "Incident Response Plan" | "MSP Shared Responsibility Matrix" | "Final System Security Plan (SSP)" | "Final Policies and Procedures" | "Supporting Evidence & Artifacts" | "Final PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Readiness Checklist for C3PAO" |
      | "smplappc@gmail.com" | "Bond@009" | ""      | "MobileWise" | "Sign In Into Company Successfull" | "Start CMMC Journey" | "Remediation" | "Engage C3PAO" | "Scope Document" | "Asset Inventory" | "Data flow"      | "Baseline System Security Plan (SSP)" | "Plan of Action & Milestone (POAM)" | "Assessment PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Prioritized Remediation Plan" | "Risk Assessment Plan" | "Incident Response Plan" | "MSP Shared Responsibility Matrix" | "Final System Security Plan (SSP)" | "Final Policies and Procedures" | "Supporting Evidence & Artifacts" | "Final PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Readiness Checklist for C3PAO" |