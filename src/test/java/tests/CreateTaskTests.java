package tests;

import io.qameta.allure.Story;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static pageObjects.BoardsPageObjects.*;
import static testMethods.AssertMethods.*;
import static testMethods.AuthorizationMethods.loginSuccessful;

public class CreateTaskTests {

  @Test
  public void before() {
    open("https://trello.com/login");
    loginSuccessful();
  }

  @Story("Create And Assert New Board Fields")
  @Test
  public void test_01_createNewBoards() {
    elementShouldHaveText(boards, "Boards");
    clickOnElement(boards);
    elementShouldHaveText(createNewBoardButton, "Create new board…");
    clickOnElement(createNewBoardButton);
    clickOnElement(chooseBlueColorQuadrant);
    sendKeysToElement(fillInBoardNameInput, "My test task");
    clickOnElement(clickCreateBoardButton);
    elementShouldHaveText(getBoardName, "My test task");
    elementShouldHaveText(getPersonalLink, "Personal");
    elementShouldHaveText(getPrivateLink, "Private");
    elementShouldHaveText(getAddListInput, "Add a list");
    elementShouldHaveText(getInviteButton, "Invite");
  }
}