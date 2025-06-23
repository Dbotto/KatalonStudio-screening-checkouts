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

WebUI.click(findTestObject('Benefit of having/Housing flow/Page_Certapet Pre-screening/h3_Travel with my pet for free'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/img_1'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.getText(findTestObject('Screening canada/Page_Certapet Pre-screening/Page_Certapet Pre-screening/p_Benefits of having your ESA Letter'))

WebUI.verifyElementText(findTestObject('Screening canada/Page_Certapet Pre-screening/Page_Certapet Pre-screening/p_Benefits of having your ESA Letter'), 
    'Benefits of having your ESA Letter')

WebUI.verifyTextPresent('Air Travel Access: In Canada, only dogs (Emotional Support Dogs) may qualify for air travel. ESDs must meet airline and government requirements, including advance documentation and an airline-approved carrier. Please see each carrier\'s stipulations for sizing of carriers.', 
    false)

WebUI.verifyTextPresent('Reduced Stress: Having the ESD during travel can reduce anxiety and stress, making the journey more manageable and enjoyable.', 
    false)

WebUI.verifyTextPresent('Companionship: The presence of the ESD provides emotional support during travel, offering a familiar and comforting presence in unfamiliar surroundings.', 
    false)

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_concat(What, , s your first name)_name'), 
    'Diego')

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_Age (Must be over 18)_age'), '23')

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/img_1_2'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/div_Often'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Next'))

WebUI.verifyTextPresent('ESA Travel Letter', false)

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_Please enter your Email to see your r_da2760'), 
    'diego+48ur48@one.pet')

WebUI.setText(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/input_You can add your phone number and exp_a1a951'), 
    '24234234234234')

WebUI.click(findTestObject('Object Repository/Benefit of having/Page_Certapet Pre-screening (1)/button_Get my ESA Travel LetterClick here t_c90edf'))

WebUI.verifyTextPresent('ESA Travel Letter Consultation', false)

WebUI.closeBrowser()

