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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testobject.ObjectRepository as OR

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-screening.certapet.com/v1/start')

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/button_Get Started on Your ESAPSD Letter'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/h3_Both'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/button_Next'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/h3_Canada'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/button_Next'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/li_Landlords waive pet fees or deposits for ESAs'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/li_Legal protection, allowing you to fly wi_42acc6'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/li_Having an ESA can reduce feelings of lon_e26dd4'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/button_Next'))

WebUI.setText(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/input_concat(What, , s your first name)_name'), 
    'Diego ')

WebUI.setText(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/input_Age (Must be over 18)_age'), 
    '456')

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/h3_Dog'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/button_Next'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/div_Often'))

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/button_Next'))

WebUI.setText(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/input_Please enter your Email to see your r_da2760'), 
    'diego+4r4f4f4@one.pet')

WebUI.setText(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/input_You can add your phone number and exp_a1a951'), 
    '453453453453')

WebUI.click(findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Pre-screening/span_Get my ESA Housing  Travel Letter'))

WebUI.delay(2)

def currentUrlCheckout = WebUI.getUrl()

// Regex que busca exactamente el parámetro product=1 como valor completo
def pattern = '[?&]product=3([&#]|$)'

if (currentUrlCheckout ==~ ".*$pattern.*") {
	KeywordUtil.markPassed('La URL contiene product=3')
} else {
	KeywordUtil.markFailed('ERROR: La URL NO contiene product=3')
}

// Intentamos esperar cada una de las variantes
boolean estaA = WebUI.waitForElementVisible(OR.findTestObject('Object Repository/Benefit of having/Both Canada/Page_Certapet Checkout/ESAhousingTravelCanadaText'),
	5, FailureHandling.OPTIONAL)

boolean estaB = WebUI.waitForElementVisible(OR.findTestObject('Object Repository/You are a good candidate/Page_ESA Sales - CertaPet - Emotional Support Animal Letters/p_You are a Good Candidate'),
	5, FailureHandling.OPTIONAL)



WebUI.closeBrowser()
