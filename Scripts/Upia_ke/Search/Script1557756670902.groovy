import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://3.16.86.130/upia_ke/login.php')

WebUI.setText(findTestObject('Page_Login  Merlin The Wizard/input_Username _username'), 'pauline.wafula')

WebUI.setEncryptedText(findTestObject('Page_Login  Merlin The Wizard/input_Password _password'), '48jqt1+jBvbC7FH/OZuPTg==')

WebUI.click(findTestObject('Page_Login  Merlin The Wizard/input_Password _submit'))

WebUI.click(findTestObject('Object Repository/Page_Dashboards  Merlin The Wizard/a_Search'))

WebUI.click(findTestObject('Object Repository/Page_Dashboards  Merlin The Wizard/a_Search_1'))

WebUI.closeBrowser()

