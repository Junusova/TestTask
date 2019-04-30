package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byXpath;

public class BoardsPageObjects {

  public static SelenideElement
  boards = $(byXpath("//span[normalize-space()='Boards']")),
  createNewBoardButton = $(byXpath("//*[contains(@class, 'quiet-button js-add-board')][normalize-space()='Create new board…']")),
  chooseBlueColorQuadrant = $(byXpath("//*[@id='chrome-container']//li[5]/button")),
  fillInBoardNameInput = $(byXpath("//*[contains(@class, 'subtle-input')]")),
  clickCreateBoardButton = $(byXpath("//span[normalize-space()='Create Board']")),
  getBoardName = $(byXpath("//span[normalize-space()='My test task']")),
  getPersonalLink = $(byXpath("//a[normalize-space()='Personal']")),
  getPrivateLink = $(byXpath("//a[normalize-space()='Private']")),
  getInviteButton = $(byXpath("//a[normalize-space()='Invite']")),
  getAddListInput = $(byXpath("//a[normalize-space()='Add a list']"));
}
