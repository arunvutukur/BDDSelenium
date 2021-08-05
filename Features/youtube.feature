Feature: Login to Youtube search

 Scenario: Login to youtube
  Given Login to youtube
  When I open homepage
  Then I verify the page displayed
  Then Close the browser

