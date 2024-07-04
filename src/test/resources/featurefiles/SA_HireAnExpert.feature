Feature: Hire an Expert

  Scenario Outline: Hire an Expert Feature
    Given Login with Valid credentials <username> <password> <pin>
    When Go to Hire Expert Module <search> <Subject> <body> <toaster> <ErrorMessage>
    Examples:
      | username             | password   | pin       | search            | Subject  | body        | toaster                   | ErrorMessage |
      | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Havi Tester"     | "Hiiiii" | "Body-Test" | "Email Send Successfully" | ""           |
      | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Compliance Test" | ""       | ""          | ""                        | " Email Body is Required "           |
      | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Mail tester"     | ""       | ""          |                           | ""           |


