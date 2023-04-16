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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sogoodweb.com/help/Index?Module=Home&Page=Index')

WebUI.click(findTestObject('Object Repository/Page_-    SoGoodWeb/a_'))

WebUI.click(findTestObject('Object Repository/Page_-    SoGoodWeb/span_'))

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/a_'))

WebUI.setText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtEmail'), 'NewHaZao.4@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtUserName'), '')

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/input__txtUserName'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SoGoodWeb/div_'), 0)

WebUI.setText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtUserName'), 'Athiphong1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtPassword'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/input__txtLineID'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SoGoodWeb/div__1_2'), 0)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtPassword'), '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtPassword'), 'dgvoiSlblYXERVmCXbLyDw==')

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/input__txtMobile'))

WebUI.setText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtLineID'), 'newhazao123')

WebUI.setText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtMobile'), '0631710769')

WebUI.selectOptionByValue(findTestObject('Page_SoGoodWeb/select_-  -'), '', false)

WebUI.selectOptionByValue(findTestObject('Page_SoGoodWeb/select_-  -'), '2', false)

WebUI.setText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtSubDomain'), 'www.google')

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/div_(Cookies)'))

WebUI.setText(findTestObject('Object Repository/Page_SoGoodWeb/input__txtSubDomain'), 'google')

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/div_imgCaptcha         border 0        widt_f6fafc'))

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/div_(Cookies)'))

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/div_0505556001559_close'))

WebUI.click(findTestObject('Object Repository/Page_SoGoodWeb/span__lbl'))

WebUI.verifyTextPresent('อีเมลนี้สามารถใช้งานได้', false)

WebUI.verifyTextPresent('ชื่อผู้ใช้นี้สามารถใช้งานได้', false)

WebUI.verifyTextPresent('ชื่อซับโดเมนนี้สามารถใช้งานได้', false)

WebUI.closeBrowser()

