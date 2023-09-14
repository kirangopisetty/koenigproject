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

WebUI.navigateToUrl('https://file-examples.com/')

WebUI.scrollToPosition(0, 1850)

WebUI.navigateToUrl('https://file-examples.com/index.php/sample-documents-download/')

WebUI.scrollToPosition(0, 700)

WebUI.navigateToUrl('https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/')

WebUI.scrollToPosition(0, 700)

WebUI.doubleClick(findTestObject('FILE_DOWNLOAD_OR/150kb_file'))

WebUI.delay(6)

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\100kb.png')

WebUI.navigateToUrl('https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/')

WebUI.enhancedClick(findTestObject('FILE_DOWNLOAD_OR/500kb_file'))

WebUI.delay(6)

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\500kb.png')

WebUI.navigateToUrl('https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/')

WebUI.click(findTestObject('FILE_DOWNLOAD_OR/1mb_file'))

WebUI.delay(6)

WebUI.takeFullPageScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\1mb.png')

WebUI.closeBrowser()

