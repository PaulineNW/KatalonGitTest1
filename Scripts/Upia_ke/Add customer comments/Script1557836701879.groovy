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

WebUI.click(findTestObject('Page_Dashboards  Merlin The Wizard/a_Search'))

WebUI.click(findTestObject('Page_Dashboards  Merlin The Wizard/a_Search_1'))

WebUI.setText(findTestObject('Page_Search Filter  Merlin The Wizard/input_Search by Phone Number_mobile_no'), '254741698330')

WebUI.click(findTestObject('Page_Search Filter  Merlin The Wizard/span_Search'))

WebUI.click(findTestObject('Page_Search Filter  Merlin The Wizard/img'))

WebUI.click(findTestObject('Object Repository/Page_Customer Details  Merlin The Wizard/a_Comments'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Customer Details  Merlin The Wizard/select_200 000 - The customer will have repeater access200 - The customer will not have'), 
    '2500', true)

WebUI.setText(findTestObject('Object Repository/Page_Customer Details  Merlin The Wizard/textarea_Customer alternative number 254714281317'), 
    'Customer alternative number 254714281317. His store is open and run by his neighbour who said the customer traveled and will be back in a week.test')

WebUI.click(findTestObject('Object Repository/Page_Customer Details  Merlin The Wizard/span_Save'))

WebUI.closeBrowser()

