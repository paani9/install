package Software;
import org.Openqa.selenium.chrome.ChromeDriver;
public class opcb {
    public static void main(String[] args)
	{String key="webdriver.chrome.driver";
	String value="./Software/chromedriver.exe";
	System.setProperty(key,value);
	ChromeDriver driver=new ChromeDriver(); 
	}

}
