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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.focus(findTestObject('ORANGE-HRM-OR/UN'))

WebUI.delay(3)

WebUI.setText(findTestObject('ORANGE-HRM-OR/UN'), 'Kiran')

WebUI.delay(3)

WebUI.clearText(findTestObject('ORANGE-HRM-OR/UN'))

WebUI.setText(findTestObject('ORANGE-HRM-OR/UN'), 'Admin')

WebUI.focus(findTestObject('ORANGE-HRM-OR/PWD'))

WebUI.setMaskedText(findTestObject('ORANGE-HRM-OR/PWD'), 'admin123')

WebUI.delay(3)

WebUI.clearText(findTestObject('ORANGE-HRM-OR/PWD'))

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('ORANGE-HRM-OR/PWD'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('ORANGE-HRM-OR/loginButton'))

WebUI.click(findTestObject('ORANGE-HRM-OR/menu'))

WebUI.click(findTestObject('ORANGE-HRM-OR/logoutButton'))

WebUI.closeBrowser()

