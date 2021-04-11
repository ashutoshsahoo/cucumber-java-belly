Feature: Belly after eating cukes
  In order to "Know how my belly will react" (capability)
  As a belly owner
  I want to know what will happen if I eat cukes

  @quick
  Scenario: many cukes and wait one hour
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then My belly should "growl"

  @slow
  Scenario Outline: belly reactions after eating cukes
    Given I have <count> cukes in my belly
    When  I wait <time> hour
    Then My belly should "<reaction>"
    Examples: # time is hours
      | count | time | reaction |
      | 11    | 1    | silent   |
      | 20    | 1    | silent   |
      | 21    | 1    | growl    |
      | 21    | 2    | growl    |
      | 2     | 0    | silent   |
      |  0    | 0    | silent   |
      | 50    | 5    | growl    |

