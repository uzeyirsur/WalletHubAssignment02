$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ReviewProcess.feature");
formatter.feature({
  "name": "Write a review on WalletHub",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Write a review and verify it on the profile",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the WalletHub Test Insurance Company page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_is_on_the_WalletHub_Test_Insurance_Company_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user hovers over the fourth star in the reviews section",
  "keyword": "When "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_hovers_over_the_fourth_star_in_the_reviews_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the 4 stars get lit up when the user hover over them",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_stars_get_lit_up_when_the_user_hover_over_them(int)"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d112.0.5615.138)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-36RLPIB\u0027, ip: \u0027100.89.168.143\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 112.0.5615.138, chrome: {chromedriverVersion: 112.0.5615.49 (bd2a7bcb881c..., userDataDir: C:\\Users\\omers\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52734}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 41925d1924c109e5fd982cdaf6878254\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.getAttribute(RemoteWebElement.java:134)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.getAttribute(Unknown Source)\r\n\tat com.wallethub.pages.HomePage.getLitUpStarCount(HomePage.java:69)\r\n\tat com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_stars_get_lit_up_when_the_user_hover_over_them(ReviewProcessStepDefinitions.java:34)\r\n\tat ✽.the 4 stars get lit up when the user hover over them(file:///C:/Users/omers/workspace/WalletHubAssignment01/src/test/resources/features/ReviewProcess.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user clicks on the fourth star",
  "keyword": "When "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_clicks_on_the_fourth_star()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user selects \"Health Insurance\" from the Policy dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_selects_from_the_Policy_dropdown(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enters a \"random text\" with a minimum of 200 characters in write your review box",
  "keyword": "And "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_enters_a_random_text_with_a_minimum_of_characters_in_write_your_review_box(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user submits the review",
  "keyword": "And "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_submits_the_review()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should see a confirmation screen with the message \"Your review has been posted.\" in their profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_should_see_a_confirmation_screen_with_the_message_in_their_profile_page(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user navigates to Test Insurance Company Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_navigates_to_Test_Insurance_Company_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should see the review in Test Insurance Company Page",
  "keyword": "And "
});
formatter.match({
  "location": "com.wallethub.step_definitions.ReviewProcessStepDefinitions.the_user_should_see_the_review_in_Test_Insurance_Company_Page()"
});
formatter.result({
  "status": "skipped"
});
});