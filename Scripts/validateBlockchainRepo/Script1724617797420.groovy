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

WebUI.click(findTestObject('Object Repository/Page_galik1999 (Galik)/span_Repositories'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Your Repositories/a_Electronic-Voting-App-Blockchain'), 'Electronic-Voting-App-Blockchain')

WebUI.click(findTestObject('Object Repository/Page_Your Repositories/a_Electronic-Voting-App-Blockchain'))

WebUI.navigateToUrl('https://github.com/galik1999/Electronic-Voting-App-Blockchain')

WebUI.rightClick(findTestObject('Object Repository/Page_galik1999Electronic-Voting-App-Blockchain/a_Electronic-Voting-App-Blockchain'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_galik1999Electronic-Voting-App-Blockchain/a_Electronic-Voting-App-Blockchain'), 
    'Electronic-Voting-App-Blockchain')

String givenText = WebUI.getText(findTestObject('Object Repository/Page_galik1999Electronic-Voting-App-Blockchain/readme'))

String actualTextPrefix = '# Decentralized Voting Application'

assert givenText.startsWith(actualTextPrefix)


