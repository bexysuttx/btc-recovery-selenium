package bexysuttx.recoverBTC;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import party.loveit.bip44forjava.utils.Bip44Utils;

/**
 * Hello world!
 *
 */
public class App {
	public static Login loginPage;
	public static DataPage dataPage;
	public static HomePage homePage;
	public static WebDriver driver;
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {
		setup();
		start();
		driver.quit();

	}

	public static void start() throws Exception {

		for (int j = 0; j < 1000; j++) {

			driver.get(ConfProperties.getProperty("loginpage"));
			String words = getCode();

			loginPage.inputLogin(words);

			loginPage.clickLoginBtn();

			dataPage.inputEmail("testblog1230@gmail.com");

			dataPage.inputPassword("XXX");

			dataPage.inputConfPassword("XXX");

			dataPage.clickContinueBtn();

			dataPage.clickSkipBtn();
			String balance = homePage.getBalance();

			
			driver.get(ConfProperties.getProperty("generalpage"));

			String wallet = homePage.getWallet();

			LOGGER.info("Code:" + words + " | Balance: " + balance + " | Wallet: " + wallet);
		}

	}

	public static String getCode() throws Exception {
		List<String> words = Bip44Utils.generateMnemonicWords();
		String s = words.toString().replace(", ", " ");
		s = s.substring(1, s.length() - 1);
		return s;
	}

	public static void setup() {
		System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
		ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");

		 driver = new ChromeDriver(options);
		loginPage = new Login(driver);
		dataPage = new DataPage(driver);
		homePage = new HomePage(driver);

		// задержка на выполнение теста = 10 сек.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// получение ссылки на страницу входа из файла настроек

	}
}
