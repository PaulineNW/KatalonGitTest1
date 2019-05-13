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

WebUI.click(findTestObject('Page_Lead Listing  Merlin The Wizard/a_Add a new Lead'))

WebUI.setText(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/input_Primary Mobile Number _mobile_no'), 
    '0799999999')

WebUI.setText(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/input_First Name _first_name'), 
    'John ')

WebUI.setText(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/input_Last Name _last_name'), 
    'Does')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/select_Banana'), 
    '217', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/select_Rongai'), 
    '50', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/select_Marigat Damaris'), 
    '220', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/select_No Business not'), 
    '8', true)

WebUI.setText(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/textarea_Outcome Explanation_lead_outcome'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/select_echo Branch Ambassadors'), 
    'Existing Customer', true)

WebUI.setText(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/textarea_If others Existing Customer please specify_other_sources'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/h2_Leads Log Comments'))

WebUI.click(findTestObject('Object Repository/Page_Create new Lead Detail(s)  Merlin The Wizard/span_Save'))

WebUI.closeBrowser()

