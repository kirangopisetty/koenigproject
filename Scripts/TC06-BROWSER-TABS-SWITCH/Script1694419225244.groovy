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

'page1 [index=0]'
WebUI.navigateToUrl('https://mindmajix.com/')

'page2 [index=1]'
WebUI.click(findTestObject('MINDMAJIX/corpTraining'))

'page3 [index=2]'
WebUI.click(findTestObject('MINDMAJIX/becomeInstructor'))

WebUI.switchToWindowTitle('Leading Online Training & Certification Course Platform - MindMajix')

WebUI.delay(2)

WebUI.switchToWindowTitle('Corporate Training - Mindmajix')

WebUI.delay(2)

WebUI.switchToWindowTitle('Become an Instructor - Mindmajix')

WebUI.delay(2)

WebUI.closeWindowTitle('Become an Instructor - Mindmajix')

WebUI.delay(2)

WebUI.closeWindowTitle('Corporate Training - Mindmajix')

WebUI.delay(2)

WebUI.closeWindowTitle('Leading Online Training & Certification Course Platform - MindMajix')

