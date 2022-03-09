package bexysuttx.recoverBTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataPage {

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public DataPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    
    @FindBy(xpath = "//*[contains(@name, 'email')]")
    private WebElement email;
    
    @FindBy(xpath = "//*[contains(@name, 'password')]")
    private WebElement password;
    
    @FindBy(xpath = "//*[contains(@name, 'confirmationPassword')]")
    private WebElement confirmPassword;
    
    @FindBy(xpath = "//*[contains(@class, 'sc-VigVT dCeHGt')]")
    private WebElement Btn;
    
    @FindBy(xpath = "//*[contains(@class, 'sc-bxivhb kXfOqz')]")
    private WebElement skip;
    
    public void inputEmail(String em) {
        email.sendKeys(em); }
    
  
    public void inputPassword(String ps) {
        password.sendKeys(ps); }
    
    public void inputConfPassword(String confPs) {
        confirmPassword.sendKeys(confPs); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickContinueBtn() {
        Btn.click(); } 

public void clickSkipBtn() {
	skip.click();
}
     

}
