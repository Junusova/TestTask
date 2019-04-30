package testMethods;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static junit.framework.TestCase.assertEquals;

public class AssertMethods {

  @Step
  public static void clickOnElement(SelenideElement element) { element.shouldBe(visible, enabled).click();
  }

  @Step
  public static void clickOnElements(SelenideElement... element) {
    for (SelenideElement selenideElement : element) {
      clickOnElement(selenideElement);
    }
  }

  @Step
  public static void clickOnElementAndPressEnter(SelenideElement element) {
    element.shouldBe(visible, enabled).pressEnter();
  }

  @Step
  public static void clickOnElementByText(ElementsCollection elements, String text) {
    elements.findBy(text(text)).click();
  }

  @Step
  public static void sendKeysToElement(SelenideElement element, String text) {
    element.shouldBe(visible, enabled).sendKeys(text);
  }

  @Step
  public static void sendKeysToElementAndPressEnter(SelenideElement element, String text) {
    element.shouldBe(visible, enabled).setValue(text);

  }

  @Step
  public static void elementShouldHaveText(SelenideElement element, String text) {
    assertEquals(text, element.innerText());
  }

  @Step
  public static void elementShouldHaveValue(SelenideElement element, String text) {
    element.shouldHave(value(text));
  }

  @Step
  public static void elementShouldHaveMatchText(SelenideElement element, String text) {
    element.shouldHave(matchText(text));
  }

  @Step
  public static void elementShouldBeVisible(SelenideElement element) {
    element.shouldBe(visible);
  }

  @Step
  public static void elementShouldNotBeVisible(SelenideElement element) {
    element.shouldNotBe(visible);
  }

  @Step
  public static void elementShouldNotBeExist(SelenideElement element) {
    element.shouldNotBe(exist);
  }
}
