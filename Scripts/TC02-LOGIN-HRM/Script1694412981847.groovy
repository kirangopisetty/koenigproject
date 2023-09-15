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

WebUI.navigateToUrl(GlobalVariable.urlHRM)

WebUI.focus(findTestObject('ORANGE-HRM-OR/UN'))

WebUI.delay(3)

fontSizeUN = WebUI.getCSSValue(findTestObject('ORANGE-HRM-OR/UN'), 'font-size')

System.out.println('The CSS fontSizeUN value for UN textbox is ' + fontSizeUN)

fontWeightUN = WebUI.getCSSValue(findTestObject('ORANGE-HRM-OR/UN'), 'font-weight')

System.out.println('The CSS fontWeightUN value for UN textbox is ' + fontWeightUN)

fontFamilyUN = WebUI.getCSSValue(findTestObject('ORANGE-HRM-OR/UN'), 'font-family')

System.out.println('The CSS fontFamilyUN value for UN textbox is ' + fontFamilyUN)

unHeight = WebUI.getElementHeight(findTestObject('ORANGE-HRM-OR/UN'))

unWidth = WebUI.getElementWidth(findTestObject('ORANGE-HRM-OR/UN'))

System.out.println('The height of UN textbox is ' + unHeight)

System.out.println('The width of UN textbox is ' + unWidth)

if ((unHeight == 45) && (unWidth == 422)) {
    println('The height & width of UN textbox matches the design specs')

    println('The test case execution continues ...')
} else {
    println('The height & width of UN textbox doesn\'t match the design specs')

    println('the test case execution stops ...')

    WebUI.closeBrowser()
}

WebUI.setText(findTestObject('ORANGE-HRM-OR/UN'), 'Admin')

WebUI.focus(findTestObject('ORANGE-HRM-OR/PWD'))

WebUI.delay(3)

pwdHeight = WebUI.getElementHeight(findTestObject('ORANGE-HRM-OR/PWD'))

pwdWidth = WebUI.getElementWidth(findTestObject('ORANGE-HRM-OR/PWD'))

System.out.println('The height of PWD textbox is ' + pwdHeight)

System.out.println('The width of PWD textbox is ' + pwdWidth)

if ((pwdHeight == 45) && (pwdWidth == 422)) {
    println('The height & width of PWD textbox matches the design specs')

    println('The test case execution continues ...')
} else {
    println('The height & width of PWD textbox doesn\'t match the design specs')

    println('the test case execution stops ...')

    WebUI.closeBrowser()
}

WebUI.setEncryptedText(findTestObject('ORANGE-HRM-OR/PWD'), 'hUKwJTbofgPU9eVlw/CnDQ==')

loginHeight = WebUI.getElementHeight(findTestObject('ORANGE-HRM-OR/loginButton'))

loginWidth = WebUI.getElementWidth(findTestObject('ORANGE-HRM-OR/loginButton'))

System.out.println('The height of login button is ' + loginHeight)

System.out.println('The width of login button is ' + loginWidth)

if ((loginHeight == 46) && (loginWidth == 422)) {
    println('The height & width of LOGIN button matches the design specs')

    println('The test case execution continues ...')
} else {
    println('The height & width of LOGIN button doesn\'t match the design specs')

    println('the test case execution stops ...')

    WebUI.closeBrowser()
}

WebUI.click(findTestObject('ORANGE-HRM-OR/loginButton'))

WebUI.click(findTestObject('ORANGE-HRM-OR/menu'))

WebUI.click(findTestObject('ORANGE-HRM-OR/logoutButton'))

WebUI.closeBrowser()

