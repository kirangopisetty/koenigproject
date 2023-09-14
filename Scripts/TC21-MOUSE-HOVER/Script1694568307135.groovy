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

WebUI.navigateToUrl('https://www.koenig-solutions.com/')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('KoenigSolutions_OR/aboutUs'))

WebUI.enhancedClick(findTestObject('KoenigSolutions_OR/qubits'))

WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\qubits.png')

// WebUI.verifyTextPresent(' qubits', false, FailureHandling.STOP_ON_FAILURE)
String qubitsURL = 'https://www.koenig-solutions.com/qubits-test'

String currentURL = WebUI.getUrl()

if (currentURL == qubitsURL) {
    // continue the test execution
    println('The user is successfully navigated to qubits URL and the test execution continues ..')

    WebUI.mouseOver(findTestObject('KoenigSolutions_OR/Course Catalogue'))

    WebUI.enhancedClick(findTestObject('KoenigSolutions_OR/microsoft'))

    WebUI.click(findTestObject('KoenigSolutions_OR/Microsoft Azure Administrator'))

    WebUI.takeScreenshot('C:\\Users\\kiran\\Downloads\\Katalon\\azure.png')

    //  WebUI.verifyTextPresent('Microsoft Azure Administrator', false, FailureHandling.STOP_ON_FAILURE)
    String microsoftURL = 'https://www.koenig-solutions.com/microsoft-azure-administrator-training'

    String receivedURL = WebUI.getUrl()

    if (receivedURL == microsoftURL) {
        // continue the test execution
        println('The user is successfully navigated to Azure URL and the test execution continues ..' // stop the test execution
            )
    } // stop the test execution
    else {
        println('The user is not navigated to Azure URL and the test execution stops ..')

        WebUI.closeBrowser()
    }
} else {
    println('The user is not navigated to qubits URL and the test execution stops ..')

    WebUI.closeBrowser()
}

