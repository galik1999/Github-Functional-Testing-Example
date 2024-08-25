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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

WebUI.click(findTestObject('Object Repository/Page_galik1999Electronic-Voting-App-Blockchain/span_Code'))

WebUI.click(findTestObject('Object Repository/Page_galik1999Electronic-Voting-App-Blockchain/span_Download ZIP'))

// Path to the Downloads folder
String userHome = System.getProperty("user.home");
Path downloadsFolder = Paths.get(userHome, "Downloads");

// File name you want to check
String fileName = "Katalon_Studio_Engine_Windows_64-9.5.0.zip"; // Replace with your file name
Path filePath = downloadsFolder.resolve(fileName);

// Check if the file exists
assert Files.exists(filePath)
