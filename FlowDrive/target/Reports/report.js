$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/Journey.feature");
formatter.feature({
  "line": 2,
  "name": "As a user",
  "description": "       I should track my journey",
  "id": "as-a-user",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "Logged in user",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "validate breakdown emergency  option",
  "description": "",
  "id": "as-a-user;validate-breakdown-emergency--option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Journeys"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I\u0027m on home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click emergency button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I click breakdown option in the popup",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click CALL NOW button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to get a pop up with a validation message",
  "keyword": "Then "
});
formatter.match({
  "location": "GeneralStepDefs.i_m_on_home_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_click_emergency_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_click_breakdown_option_in_the_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_click_CALL_NOW_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_should_be_able_to_get_a_pop_up_with_a_validation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 5,
  "name": "Logged in user",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 18,
  "name": "validate Accident emergency option",
  "description": "",
  "id": "as-a-user;validate-accident-emergency-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Journeys"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I\u0027m on home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I click accident button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click breakdown option in the popup",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click CALL NOW button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should be able to get a pop up with a validation message",
  "keyword": "Then "
});
formatter.match({
  "location": "GeneralStepDefs.i_m_on_home_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_click_accident_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_click_breakdown_option_in_the_popup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_click_CALL_NOW_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_should_be_able_to_get_a_pop_up_with_a_validation_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 5,
  "name": "Logged in user",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 28,
  "name": "validate Past Journey data",
  "description": "",
  "id": "as-a-user;validate-past-journey-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Journeys"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I\u0027m on home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I choose journeys option",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I should see recorded data",
  "keyword": "Then "
});
formatter.match({
  "location": "GeneralStepDefs.i_m_on_home_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_choose_journeys_option()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_should_see_recorded_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 5,
  "name": "Logged in user",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 36,
  "name": "Validate Past Journey data after consecutive installations",
  "description": "",
  "id": "as-a-user;validate-past-journey-data-after-consecutive-installations",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@Journeys"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "I\u0027m on Journeys screen",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "I get the existing record",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I unistall the app",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I re-install the app",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I provide the valid username",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I provide the valid password",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I navigate to the journeys screen",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I should see the previously recorded data",
  "keyword": "Then "
});
formatter.match({
  "location": "JourneysStepDefs.i_m_on_Journeys_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_get_the_existing_record()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_unistall_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_re_install_the_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "JourneysStepDefs.i_navigate_to_the_journeys_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "JourneysStepDefs.i_should_see_the_previously_recorded_data()"
});
formatter.result({
  "status": "skipped"
});
});