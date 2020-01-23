$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Eclipse2018-09/Cricbuzz/src/main/java/Feature/cricbuzz.feature");
formatter.feature({
  "line": 1,
  "name": "Cricbuzz score feature",
  "description": "",
  "id": "cricbuzz-score-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Cricbuzz score Scenrio",
  "description": "",
  "id": "cricbuzz-score-feature;cricbuzz-score-scenrio",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Cricbuzz HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Select ongoing match",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Select scorecard module of the match",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "get the details",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Extract Data and store in Excel Sheet",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step_Definition.givenmethod()"
});
formatter.result({
  "duration": 11593097500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.titlehomepage()"
});
formatter.result({
  "duration": 423443000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.matchpage()"
});
formatter.result({
  "duration": 386375100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.getdata()"
});
formatter.result({
  "duration": 5950953400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.excel()"
});
formatter.result({
  "duration": 829662200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.close()"
});
formatter.result({
  "duration": 4098975900,
  "status": "passed"
});
});