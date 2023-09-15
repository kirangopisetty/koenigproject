package pkgKoening

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class classKoenig {

	@Keyword
	def browserInit() {

		WebUI.openBrowser("")		// opens an empty browser
		WebUI.maximizeWindow()		// maximizes the opened browser to full window size
	}

	@Keyword
	def browserExit() {

		WebUI.deleteAllCookies()		// deletes all the cookies stored on the browser
		WebUI.closeBrowser()			// closes the browser window
	}

	@Keyword
	def browserCleanup() {

		WebUI.deleteAllCookies()		// deletes all the cookies stored on the browser
	}

	@Keyword
	def browserResize() {

		WebUI.setViewPortSize(600, 650)  	// resizes the browser window according to specified size
		WebUI.setViewPortSize(700, 800)
		WebUI.setViewPortSize(900, 550)
		WebUI.setViewPortSize(1000, 900)
		WebUI.setViewPortSize(1090, 1050)
	}
}
