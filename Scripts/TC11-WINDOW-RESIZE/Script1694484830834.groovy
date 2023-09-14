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

WebUI.setViewPortSize(1024, 768)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\vp1.png')

vp1Height = WebUI.getViewportHeight()

vp1Width = WebUI.getViewportWidth()

System.out.println("The view port1 height is "+vp1Height)
System.out.println("The view port1 width is "+vp1Width)

WebUI.delay(2)

WebUI.setViewPortSize(375, 667)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\vp2.png')

vp2Height = WebUI.getViewportHeight()

vp2Width = WebUI.getViewportWidth()

System.out.println("The view port1 height is "+vp2Height)
System.out.println("The view port1 width is "+vp2Width)

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ORANGE-HRM-OR/UN'), 'Admin')

WebUI.setEncryptedText(findTestObject('ORANGE-HRM-OR/PWD'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('ORANGE-HRM-OR/loginButton'))

WebUI.setViewPortSize(1024, 768)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\vp3.png')

vp1Height = WebUI.getViewportHeight()

vp1Width = WebUI.getViewportWidth()

System.out.println("The view port1 height is "+vp1Height)
System.out.println("The view port1 width is "+vp1Width)

WebUI.delay(2)

WebUI.setViewPortSize(375, 667)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\vp4.png')

vp2Height = WebUI.getViewportHeight()

vp2Width = WebUI.getViewportWidth()

System.out.println("The view port1 height is "+vp2Height)
System.out.println("The view port1 width is "+vp2Width)

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ORANGE-HRM-OR/menu'))

WebUI.setViewPortSize(1024, 768)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\vp5.png')

vp1Height = WebUI.getViewportHeight()

vp1Width = WebUI.getViewportWidth()

System.out.println("The view port1 height is "+vp1Height)
System.out.println("The view port1 width is "+vp1Width)

WebUI.delay(2)

WebUI.setViewPortSize(375, 667)

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\vp6.png')

vp2Height = WebUI.getViewportHeight()

vp2Width = WebUI.getViewportWidth()

System.out.println("The view port1 height is "+vp2Height)
System.out.println("The view port1 width is "+vp2Width)

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('ORANGE-HRM-OR/logoutButton'))

WebUI.closeBrowser()

