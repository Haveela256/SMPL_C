Feature: Control Center


  Scenario Outline: Verify the Control Center page

    When Validate the Sign In button functionality by entering valid and invalid credentials <EmailAddress> <Password>  Verify the signIn status <Toaster>
    And Verify title of the page
    And Validate homepage and lightBulb
    And Validate the Hamburger icon functionality
    And Validate the SMPL-C logo functionality
    And Verify cmmc Journey <CMMCJourney>
    And Verify the Discovery card <DiscoveryScope> <DiscoveryAsset> <DiscoveryDatFlow>
    And Verify the Gap Assessment card <GapAssessmentBaseline>    <GapAssessmentPoam>    <GapAssessmentPiee>    <GapAssessmentPrioritized>    <GapAssessmentRisk>    <GapAssessmentIncident>    <GapAssessmentMSP>
    And Validate the i icon of the Remediation card <Remediation>
    And Verify the Audit Readiness card <AuditReadinessSSP>    <AuditReadinessPolicies>    <AuditReadinessSupport>    <AuditReadinessPiee>    <AuditReadinessChecklist>
    And Validate  icon of the Engage CPAO card <EngageCPAO>
    And Validate the Expand icon functionality of Side panel
    And Verify the chatbot
    And Validate the User Profile icon or Expand icon functionality
    Then Validate the Logout option functionality


    Examples:
      | EmailAddress            | Password     | Toaster | CMMCJourney          | Remediation   | EngageCPAO     | DiscoveryScope   | DiscoveryAsset    | DiscoveryDatFlow | GapAssessmentBaseline                 | GapAssessmentPoam                   | GapAssessmentPiee                                             | GapAssessmentPrioritized       | GapAssessmentRisk      | GapAssessmentIncident    | GapAssessmentMSP                   | AuditReadinessSSP                  | AuditReadinessPolicies          | AuditReadinessSupport             | AuditReadinessPiee                                       | AuditReadinessChecklist         |
      | "Vassar.qa@yopmail.com" | "Vassar@123" | ""      | "Start CMMC Journey" | "Remediation" | "Engage C3PAO" | "Scope Document" | "Asset Inventory" | "Data flow"      | "Baseline System Security Plan (SSP)" | "Plan of Action & Milestone (POAM)" | "Assessment PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Prioritized Remediation Plan" | "Risk Assessment Plan" | "Incident Response Plan" | "MSP Shared Responsibility Matrix" | "Final System Security Plan (SSP)" | "Final Policies and Procedures" | "Supporting Evidence & Artifacts" | "Final PIEE Submission (Ask Kayla, our GenAI Assistant)" | "Readiness Checklist for C3PAO" |