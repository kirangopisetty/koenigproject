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

WebUI.callTestCase(findTestCase('TC25-BROWSER-LAUNCH'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/register.htm')

WebUI.setText(findTestObject('ParaBank_OR/firstName'), firstName)

WebUI.setText(findTestObject('ParaBank_OR/lastName'), lastName)

WebUI.setText(findTestObject('ParaBank_OR/address'), address)

WebUI.setText(findTestObject('ParaBank_OR/city'), city)

WebUI.setText(findTestObject('ParaBank_OR/state'), state)

WebUI.setText(findTestObject('ParaBank_OR/zipCode'), zipcode)

WebUI.setText(findTestObject('ParaBank_OR/phoneNumber'), phone)

WebUI.setText(findTestObject('ParaBank_OR/SSN'), ssn)

WebUI.setText(findTestObject('ParaBank_OR/username'), username)

WebUI.setText(findTestObject('ParaBank_OR/password'), password)

WebUI.setText(findTestObject('ParaBank_OR/repeatedPassword'), repeatPassword)

WebUI.sendKeys(findTestObject('ParaBank_OR/registerButton'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ParaBank_OR/logoutButton'))

WebUI.callTestCase(findTestCase('TC29-BROWSER-EXIT'), [:], FailureHandling.CONTINUE_ON_FAILURE)

