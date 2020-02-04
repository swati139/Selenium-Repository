package oops;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_HomePage {
	
	@FindBy(id="email")WebElement uid;
	@FindBy(id="pass")WebElement pwd;
    @FindBy(xpath="//a[@href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")WebElement link;
}
