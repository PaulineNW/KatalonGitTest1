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

WebUI.click(findTestObject('Page_Dashboards  Merlin The Wizard/a_Leads'))

WebUI.click(findTestObject('Object Repository/Page_Lead Listing  Merlin The Wizard/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/select_DrMasterMissMrMrsNo TitleProf'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_National ID _national_id'), 
    '3214321421')

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_Format 254xxxxxxxxx_dis_phone'), 
    '214321414314')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/select_DivorcedMarriedSeparatedSingleWidowed'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/select_MaleFemale'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_Ref 1 Last Name _ref_last_name'), 
    '24142314143')

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_Format 254xxxxxxxxx_ref_phone_number'), 
    '141432143214')

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_Ref 2 First Name _ref_landlord_first_name'), 
    'BERNAD')

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_Ref 2 Last Name _ref_landlord_last_name'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_Format 254xxxxxxxxx_ref_landlord_phone'), 
    '123432143214')

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/input_No of Dependants_dependants'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/textarea_Home Address _home_address'), 
    'TEST')

WebUI.click(findTestObject('Object Repository/Page_Update Customer Detail(s)  Merlin The Wizard/button_Submit'))

WebUI.closeBrowser()

