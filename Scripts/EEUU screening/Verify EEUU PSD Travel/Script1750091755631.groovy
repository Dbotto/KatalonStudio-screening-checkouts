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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/button_Get Started on Your ESAPSD Letter'))

WebUI.click(findTestObject('Flow PSD letter/Step1 Letter selection/h3_Travel with my pet for free'))

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/button_Next'))

WebUI.click(findTestObject('Flow PSD letter/Step 2 Country Selection/h3_USA'))

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/button_Next'))

WebUI.verifyElementPresent(findTestObject('Flow PSD letter/Step 3 Option Selection psd/p_ESAs Are No Longer Accepted for Air Travel'), 
    0)

WebUI.verifyElementPresent(findTestObject('Flow PSD letter/Step 3 Option Selection psd/p_As of 2021, U.S. airlines are no longer required to accept Emotional Support Animals (ESAs) under federal law. ESAs are now treated as regular pets and may be subject to fees, cargo placement, or denied access altogeth'), 
    0)

WebUI.verifyElementPresent(findTestObject('Flow PSD letter/Step 3 Option Selection psd/p_If you want to fly with your dog in the cabin for free, youll need to qualify for a Psychiatric Service Dog (PSD).  This means'), 
    0)

WebUI.click(findTestObject('Flow PSD letter/Step 3 Option Selection psd/h3_I want a PSD Letter recommendation'))

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/button_Next'))

WebUI.setText(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/input_concat(What, , s your first name)_name'), 
    'Diego')

WebUI.setText(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/input_Age (Must be over 18)_age'), 
    '34')

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/h3_Dog'))

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/button_Next'))

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/h3_Always'))

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/button_Next'))

WebUI.setText(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/input_Please enter your Email to see your r_da2760'), 
    'diego+3d3d3d322@one.pet')

WebUI.setText(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/input_You can add your phone number and exp_a1a951'), 
    '3333333333')

WebUI.click(findTestObject('Object Repository/EEuu path/Page_Certapet Pre-screening/button_Get my ESA Housing LetterClick here _93bf37'))

WebUI.waitForElementPresent(findTestObject('EEuu path/Page_Certapet Checkout/h2_ESA Housing Letter Consultation'), 0)

//---------------------------------------------------------------------------
// VERIFICA SI LA URL CONTIENE EL PARAMETRO product=1 
//String currentUrlCheckout = WebUI.getUrl()
/*if (currentUrlCheckout.contains('product=1')) {
    KeywordUtil.markPassed('La URL contiene product=1')
} else {
    KeywordUtil.markFailed('ERROR: La URL NO contiene ninguno')
}*/
//---------------------------------------------------------------------------
//---------------------------------------------------------------------------
// VERIFICA SI LA URL TIENE EL PARAMETRO EXACTO prodcut=13
def currentUrlCheckout = WebUI.getUrl()

// Regex que busca exactamente el parámetro product=1 como valor completo
def pattern = '[?&]product=13([&#]|$)'

if (currentUrlCheckout ==~ ".*$pattern.*") {
    KeywordUtil.markPassed('La URL contiene product=13')
} else {
    KeywordUtil.markFailed('ERROR: La URL NO contiene product=13')
}

//---------------------------------------------------------------------------
// Intentamos esperar cada una de las variantes
boolean estaA = WebUI.waitForElementVisible(OR.findTestObject('Object Repository/EEuu path/Page_Certapet Checkout/H2_PSD_travel'), 
    5, FailureHandling.OPTIONAL)

boolean estaB = WebUI.waitForElementVisible(OR.findTestObject('Object Repository/You are a good candidate/Page_ESA Sales - CertaPet - Emotional Support Animal Letters/p_You are a Good Candidate'), 
    5, FailureHandling.OPTIONAL)

// Validamos
/*if (estaA || estaB) {
	KeywordUtil.markPassed("A/B test OK: se mostró una de las variantes.")
} else {
	KeywordUtil.markFailed("A/B test fallido: no se detectó ninguna variante.")
}
*/
// Validamos
if (estaA) {
    KeywordUtil.markPassed('Entro en el checkout Houisng Letter')
} else if (estaB) {
    KeywordUtil.markPassed('Entro a a la pagina You are a good candidate')
} else {
    KeywordUtil.markFailed('No entro Ni en Checkout ni en you are a good candidate.')
}

//WebUI.verifyElementVisible(findTestObject('Object Repository/EEuu path/Page_Certapet Checkout/h2_ESA Housing Letter Consultation'))
WebUI.closeBrowser()

