# FlowDriveTest
Technology Stack:
-----------------

- Note: Designed and Exceuted in Windows

- Test Design - Cucumber

- Test Exceution - Appium, Selenium Web Driver, Java

- Test Framework - Junit

- Project Configuration - Maven/POM


Framework Structure:
----------------------

- Features - Step Definitions - Step Implementations (Pom- Page Object Model.)

- Test Data Management (Cucumber, Excel, Faker).



Directories:
------------

- Test Scenarios - src/test/feaures

- Step Definitions - src/test/java/stepDefinitions

- Step Implementations - src/main/java/stepImplementaions



Pre-requisite to create Automation Framework:
----------------------------------------------

- ADT Bundle - Android

- Running emulator/Real Device

- apk to test

- UI Automator viewer - Locator identifier

- Maven installed locally

- Intellij IDEA - IDE

- Dependencies - Appium, Selenium, Junit, Cucumber, Apache POI, Maven surefire

- Test Data - Excel, property file, Faker.



Test Sets:
-----------

- GeneralChecklist.feature(@General)
- User.feature(@User)
- Journey.feature(@Journeys)



Executing the Test scripts:
---------------------------

Pre-requisite:

 - Install Maven Locally - to execute using a .bat file or from command prompt

 - Start an Emulator or connect  a real device and enable usb debugging

 - install apk

Execution Steps:
----------------

1. Import project to intellij idea and navigate to test directory and exceute the run file (FlowDrive/src/test/java/run)
   or locate the pom.xml directory using command prompt and use the command mvn test for execution.
   
2. Tests are categorized with three tags {@General, @User, @Journeys}.
   Provide the appropriate tag name in the run file to execute appropriate test sets.
   











