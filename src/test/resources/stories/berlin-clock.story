Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase then number of ways that I can read the time

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 24:00:00
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO

Scenario: Before midnight
When the time is 23:23:23
Then the clock should look like
O
RRRR
RRRO
YYRYOOOOOOO
YYYO

Scenario: Before Noon
When the time is 11:11:11
Then the clock should look like
O
RROO
ROOO
YYOOOOOOOOO
YOOO

Scenario: Early Morning
When the time is 00:10:10
Then the clock should look like
Y
OOOO
OOOO
YYOOOOOOOOO
OOOO

Scenario: Morning Time
When the time is 05:05:05
Then the clock should look like
O
ROOO
OOOO
YOOOOOOOOOO
OOOO

Scenario: Invalid Hours
When the time is 26:00:00
Then the clock should look like
Invalid Time

Scenario: Invalid Minutes
When the time is 24:60:00
Then the clock should look like
Invalid Time

Scenario: Invalid Seconds
When the time is 12:00:88
Then the clock should look like
Invalid Time

