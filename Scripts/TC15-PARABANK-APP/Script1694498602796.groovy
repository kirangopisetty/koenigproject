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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/register.htm;jsessionid=CA3FD6AD4620D4B4EAB8938AB9784207')

WebUI.setText(findTestObject('ParaBank_OR/firstName'), 'Koenig')

WebUI.setText(findTestObject('ParaBank_OR/lastName'), 'Solutions')

WebUI.setText(findTestObject('ParaBank_OR/address'), 'Street#10')

WebUI.setText(findTestObject('ParaBank_OR/city'), 'New Delhi')

WebUI.setText(findTestObject('ParaBank_OR/state'), 'New Delhi')

WebUI.setText(findTestObject('ParaBank_OR/zipCode'), '99999')

WebUI.setText(findTestObject('ParaBank_OR/phoneNumber'), '89897676898')

WebUI.setText(findTestObject('ParaBank_OR/SSN'), '1234567890')

WebUI.setText(findTestObject('ParaBank_OR/username'), 'koenig1')

WebUI.setText(findTestObject('ParaBank_OR/password'), 'koenig')

WebUI.setText(findTestObject('ParaBank_OR/repeatedPassword'), 'koenig')

WebUI.delay(5)

WebUI.click(findTestObject('ParaBank_OR/registerButton'))

WebUI.click(findTestObject('ParaBank_OR/logoutButton'))

WebUI.closeBrowser()

