package bexysuttx.recoverBTC;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	 /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    
    @FindBy(xpath = "//*[contains(@class, 'sc-kxynE jBhdpm')]")
    private WebElement balance;
    
    @FindBy(xpath = "//*[contains(@class, 'sc-htoDjs ddiVGA')]")
    private WebElement wallet;
    
    
    @FindBy(xpath = "//*[contains(@class, 'sc-ifAKCX ekfPQL sc-dTdPqK hhSIYG')]")
    private WebElement menu;
    
    
    @FindBy(xpath = "//*[contains(@class, 'sc-dTdPqK sc-jtRlXQ bQODQt')]")
    private WebElement signOut;
    
    public String getBalance() {
        String balance1 = balance.getText();
        return balance1; }
    
    public String getWallet() {
        String wallet1 = wallet.getText();
        return wallet1; }
    
    public void clickSignOut() {
        signOut.click(); } 
    
    public void clickMenu() {
    	menu.click();
    }
    

    
}
    
    
    
    
    
