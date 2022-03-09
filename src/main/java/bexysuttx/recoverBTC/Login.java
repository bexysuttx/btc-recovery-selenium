package bexysuttx.recoverBTC;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Login {

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    

   @FindBy(xpath = "//*[contains(@name, 'mnemonic')]")
   private WebElement codeField;
   
   @FindBy(xpath = "//*[contains(@class, 'sc-VigVT dCeHGt')]")
   private WebElement Btn;
    
	
	  public void inputLogin(String login) {
	        codeField.sendKeys(login); }
	  
	    /**
	     * метод для осуществления нажатия кнопки входа в аккаунт
	     */
	    public void clickLoginBtn() {
	        Btn.click(); } }



