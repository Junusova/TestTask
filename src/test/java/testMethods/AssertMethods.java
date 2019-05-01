package testMethods;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static junit.framework.TestCase.assertEquals;

public class AssertMethods {

  @Step
  public static void clickOnElement(SelenideElement element) {
    element.shouldBe(visible, enabled).click();
  }

  @Step
  public static void sendKeysToElement(SelenideElement element, String text) {
    element.shouldBe(visible, enabled).sendKeys(text);
  }

  @Step
  public static void elementShouldHaveText(SelenideElement element, String text) {
    assertEquals(text, element.innerText());
  }
}
