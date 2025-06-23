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

WebUI.navigateToUrl('https://test-screening.certapet.com/v1/start')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Get Started on Your ESAPSD Letter'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/h3_Live with my pet for free'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/img_1'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.getText(findTestObject('Benefit of having/Page_Certapet Pre-screening/p_Benefits of having your ESA Letter'))

WebUI.verifyElementPresent(findTestObject('Benefit of having/Page_Certapet Pre-screening/p_Benefits of having your ESA Letter'), 
    0)

WebUI.verifyTextPresent('Landlords waive pet fees or deposits for ESAs', false)

WebUI.verifyTextPresent('Keep your ESA with you in housing even if there are no-pet policies.', false)

WebUI.verifyTextPresent('Having an ESA can reduce feelings of loneliness and isolation, increase feelings of social support and connection', 
    false)

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_concat(What, , s your first name)_name'), 
    'Diego')

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_Age (Must be over 18)_age'), '22')

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/img_1_2'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.click(findTestObject('Benefit of having/Page_Certapet Pre-screening (1)/div_Often'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_Please enter your Email to see your r_da2760'), 
    'diego+000021@one.pet')

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_You can add your phone number and exp_a1a951'), 
    '34234234234234')

WebUI.verifyTextPresent('Get my ESA Housing Letter', false)

WebUI.getText(findTestObject('Benefit of having/Page_Certapet Pre-screening/Page_Certapet Pre-screening/button_Get my ESA Housing LetterClick here to continue'))

WebUI.verifyElementText(findTestObject('Benefit of having/Page_Certapet Pre-screening/Page_Certapet Pre-screening/button_Get my ESA Housing LetterClick here to continue'), 
    'Get my ESA Housing Letter\nClick here to continue')

WebUI.click(findTestObject('Benefit of having/Page_Certapet Pre-screening/Page_Certapet Pre-screening/button_Get my ESA Housing LetterClick here to continue'))

WebUI.verifyTextPresent('ESA Housing Letter Consultation', false)

WebUI.closeBrowser()

