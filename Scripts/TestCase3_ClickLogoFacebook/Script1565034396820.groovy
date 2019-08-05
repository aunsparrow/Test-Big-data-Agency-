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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bda.co.th/')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/TC3_clickLogoFacebook/i_adminbdacoth_fab fa-facebook fa-2x'))
WebUI.delay(1)

WebUI.switchToWindowUrl('https://www.facebook.com/bda.co.th/')

WebUI.delay(1)

String urlget = WebUI.getUrl()

System.out.println(urlget)

String urltest = 'https://www.facebook.com/bda.co.th/'

WebUI.delay(1)

if (urlget.equals(urltest)) {
    WebUI.comment('Pass')
} else {
    WebUI.executeJavaScript('alert(\'Test Fail\')', null)
}

WebUI.delay(1)

WebUI.verifyMatch(urlget, 'https://www.facebook.com/bda.co.th/', false)

