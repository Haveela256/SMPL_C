Feature: Hire an Expert

  Scenario Outline: Hire an Expert Feature
    Given Login with Valid credentials <username> <password> <pin>
    When Go to Hire Expert Module <search> <Subject> <body> <toaster> <ErrorMessage>
    Examples:
<<<<<<< HEAD
      | Example  | username             | password   | pin       | search            | Subject  | body        | toaster                   | ErrorMessage               |
      | Positive | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Havi Tester"     | "Hiiiii" | "Body-Test" | "Email Send Successfully" | ""                         |
      | Negative | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Compliance Test" | ""       | ""          | "Email Send Successfully" | " Email Body is Required " |
      | Negative | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Mail tester"     | ""       | ""          | "Email Send Successfully" | ""                         |
=======
      | username             | password   | pin       | search         | Subject | body | toaster                   | ErrorMessage |
      | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Abhi Manager" | "H"  | ""   | "Email Send Successfully" | ""           |
#      | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Compliance Test" | ""       | ""          | ""                        | " Email Body is Required " |
#      | "smplappc@gmail.com" | "Bond@009" | "1-2-3-4" | "Mail tester"     | ""       | ""          |                           | ""                         |
>>>>>>> 1a2da184a64955571b42de9b8c873355143fd19a


