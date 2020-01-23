Feature: Cricbuzz score feature
Scenario: Cricbuzz score Scenrio
Given Cricbuzz HomePage
When Select ongoing match  
Then Select scorecard module of the match
Then get the details
Then Extract Data and store in Excel Sheet
And close the browser





