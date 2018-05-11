import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriverGetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 如果火狐浏览器没有默认安装在C盘，需要制定其路径
		// System.setProperty("webdriver.firefox.bin",
		// "D:/Program Files/Mozilla firefox/firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		// 获取url
		String currentUrl = driver.getCurrentUrl();
		// 获取页面的全部源代码
		String pageSource = driver.getPageSource();
		// 获取页面的标题
		String title = driver.getTitle();
		// 返回该窗口的句柄，可以用来进行窗口切换
		String winHandle = driver.getWindowHandle();
		Set<String> winHandles = driver.getWindowHandles();
		System.out.println("CurrentURL:" + currentUrl);
		System.out.println("PageSource:" + pageSource);
		System.out.println("Title:" + title);
		System.out.println("WinHandle:" + winHandle);

	}

}
