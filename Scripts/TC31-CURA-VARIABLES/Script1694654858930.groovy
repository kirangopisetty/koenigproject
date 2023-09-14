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

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('CURA_OR/UN'), UN)

WebUI.setText(findTestObject('CURA_OR/PWD'), PWD)

WebUI.click(findTestObject('CURA_OR/loginButton'))

WebUI.selectOptionByValue(findTestObject('CURA_OR/dropdown'), Facility, false)

WebUI.check(findTestObject('CURA_OR/checkbox'))

WebUI.click(findTestObject('CURA_OR/radioButton_None'))

WebUI.setText(findTestObject('CURA_OR/visitDate'), VisitDate)

WebUI.setText(findTestObject('CURA_OR/comment'), Comment)

WebUI.click(findTestObject('CURA_OR/bookAppointmentButton'))

WebUI.click(findTestObject('CURA_OR/menu'))

WebUI.click(findTestObject('CURA_OR/logoutButton'))

WebUI.deleteAllCookies()

WebUI.closeBrowser()
