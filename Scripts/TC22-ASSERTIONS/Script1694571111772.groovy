import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.waitForElementPresent(findTestObject('ORANGE-HRM-OR/UN'), 4)

WebUI.verifyElementPresent(findTestObject('ORANGE-HRM-OR/UN'), 5)

WebUI.waitForElementHasAttribute(findTestObject('ORANGE-HRM-OR/UN'), 'name', 4)

WebUI.verifyElementHasAttribute(findTestObject('ORANGE-HRM-OR/UN'), 'name', 5)

WebUI.waitForElementAttributeValue(findTestObject('ORANGE-HRM-OR/UN'), 'name', 'username', 4)

WebUI.verifyElementAttributeValue(findTestObject('ORANGE-HRM-OR/UN'), 'name', 'username', 5)

WebUI.waitForElementVisible(findTestObject('ORANGE-HRM-OR/UN'), 4)

WebUI.verifyElementVisible(findTestObject('ORANGE-HRM-OR/UN'))

WebUI.setViewPortSize(550, 650)

WebUI.verifyElementPresent(findTestObject('ORANGE-HRM-OR/UN'), 5)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\un.png')

WebUI.verifyElementVisibleInViewport(findTestObject('ORANGE-HRM-OR/UN'), 5)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('ORANGE-HRM-OR/PWD'), 5)

WebUI.verifyElementHasAttribute(findTestObject('ORANGE-HRM-OR/PWD'), 'name', 5)

WebUI.verifyElementAttributeValue(findTestObject('ORANGE-HRM-OR/PWD'), 'name', 'password', 5)

WebUI.verifyElementVisible(findTestObject('ORANGE-HRM-OR/PWD'))

WebUI.setViewPortSize(550, 650)

WebUI.verifyElementPresent(findTestObject('ORANGE-HRM-OR/PWD'), 5)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\pwd.png')

WebUI.verifyElementVisibleInViewport(findTestObject('ORANGE-HRM-OR/PWD'), 5)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('ORANGE-HRM-OR/loginButton'), 5)

WebUI.verifyElementHasAttribute(findTestObject('ORANGE-HRM-OR/loginButton'), 'type', 5)

WebUI.verifyElementAttributeValue(findTestObject('ORANGE-HRM-OR/loginButton'), 'type', 'submit', 5)

WebUI.verifyElementVisible(findTestObject('ORANGE-HRM-OR/loginButton'))

WebUI.setViewPortSize(550, 650)

WebUI.verifyElementPresent(findTestObject('ORANGE-HRM-OR/loginButton'), 5)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\login.png')

WebUI.verifyElementVisibleInViewport(findTestObject('ORANGE-HRM-OR/loginButton'), 5)

