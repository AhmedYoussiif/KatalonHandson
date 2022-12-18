import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeywords {

	@Keyword
	def SelectSortdrpdwnd (TestObject objectelem) {
		WebElement element = WebUiCommonHelper.findWebElement(objectelem, 20);
		Select se = new Select(element);
		ArrayList originalList = new ArrayList();

		for (WebElement e : se.getOptions()) {
			originalList.add(e.getText());;
		}

		Collections.sort(originalList);
		System.out.println("Sorted Domains " + "in Ascending order : " + originalList);

		Collections.sort(originalList, Collections.reverseOrder());
		System.out.println("Sorted Domains " + "in Descending order : " + originalList);
	}
}
