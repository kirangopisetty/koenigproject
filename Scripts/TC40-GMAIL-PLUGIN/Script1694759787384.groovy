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

CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.sendEmail'('tiger@lion.com', password, 'deer@jungle.com', 'Welcome to Jungle', 
    'This is a dense forest having wild animals & domestic animals.')

int emailsCount = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.getEmailsCount'('tiger@lion.com', password, 'INBOX')

System.out.println('The # of emails in INBOX folder are ' + emailsCount)

String latestEmailContent = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'('tiger@lion.com', 
    password, 'INBOX')

System.out.println('The latest email content in INBOX folder is ' + latestEmailContent)

CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.deleteAllEMails'('tiger@lion.com', password, 'INBOX')

