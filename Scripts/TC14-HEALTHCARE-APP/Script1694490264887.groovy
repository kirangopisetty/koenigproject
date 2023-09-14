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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.focus(findTestObject('CURA_OR/UN'))

WebUI.setText(findTestObject('CURA_OR/UN'), 'John Doe')

WebUI.focus(findTestObject('CURA_OR/PWD'))

WebUI.setText(findTestObject('CURA_OR/PWD'), 'ThisIsNotAPassword')

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\login.png')

WebUI.click(findTestObject('CURA_OR/loginButton'))

WebUI.selectOptionByValue(findTestObject('CURA_OR/dropdown'), 'Hongkong CURA Healthcare Center', false)

WebUI.verifyOptionSelectedByValue(findTestObject('CURA_OR/dropdown'), 'Hongkong CURA Healthcare Center', false, 5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('CURA_OR/dropdown'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyOptionSelectedByIndex(findTestObject('CURA_OR/dropdown'), 2, 5)

WebUI.selectOptionByIndex(findTestObject('CURA_OR/dropdown'), 0)

WebUI.verifyOptionSelectedByIndex(findTestObject('CURA_OR/dropdown'), 0, 5)

WebUI.check(findTestObject('CURA_OR/checkbox'))

WebUI.verifyElementChecked(findTestObject('CURA_OR/checkbox'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.uncheck(findTestObject('CURA_OR/checkbox'))

WebUI.verifyElementNotChecked(findTestObject('CURA_OR/checkbox'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('CURA_OR/checkbox'))

WebUI.verifyElementChecked(findTestObject('CURA_OR/checkbox'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CURA_OR/radioButton_Medicaid'))

WebUI.click(findTestObject('CURA_OR/radioButton_Medicare'))

WebUI.click(findTestObject('CURA_OR/radioButton_None'))

WebUI.setText(findTestObject('CURA_OR/visitDate'), '28/09/2023')

WebUI.setText(findTestObject('CURA_OR/visitDate'), '26/09/2023')

WebUI.setText(findTestObject('CURA_OR/comment'), 'General health checkup to be done')

WebUI.delay(8)

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\dataEntry.png')

WebUI.click(findTestObject('CURA_OR/bookAppointmentButton'))

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\bookAppt.png')

WebUI.verifyTextPresent('Appointment Confirmation', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CURA_OR/menu'))

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\logout.png')

WebUI.click(findTestObject('CURA_OR/logoutButton'))

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\loggedOut.png')

WebUI.verifyTextPresent('We Care About Your Health', false, FailureHandling.STOP_ON_FAILURE)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

