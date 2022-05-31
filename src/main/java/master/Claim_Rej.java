package master;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Claim_Rej {

	public static void main(String[] args) throws InterruptedException, IOException
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://trti.mahamining.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"home_login\"]")).click();
	Thread .sleep(1000);
	//Admin login
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
   Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
    Thread .sleep(1000);	
    String s=JOptionPane.showInputDialog("enter your captcha");
    
  	driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
      Thread .sleep(1000);
    
  	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
  	Thread .sleep(1000);
	// master selection
	driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
	Thread .sleep(1000);
	// claim rej   sel
	driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[7]/a")).click();
	Thread .sleep(1000);   
	//click on select commit
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/div[2]/div")).click();
	Thread .sleep(1000);  
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	Thread .sleep(1000);  
	//Enter rej .title
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/input")).sendKeys("DVLCdemo");
	Thread .sleep(1000);  
	//enter description
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/textarea")).sendKeys("KEVAL VANvibhaganes nakaratmak decision dila");
	Thread .sleep(1000);  
	//click on submit butt
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
	Thread .sleep(1000); 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[1]")).click();
	Thread .sleep(1000);
	driver.findElement(By.xpath("// input[@ placeholder='Enter Rejection Title']")).clear();
	Thread .sleep(1000);
	driver.findElement(By.xpath("// input[@ placeholder='Enter Rejection Title']")).sendKeys("DLC Edited");
	Thread .sleep(1000);
	//update record
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
	Thread .sleep(3000);
	//delete record
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[2]/i")).click();
	Thread .sleep(1000);
	driver.switchTo().alert().accept();
	Thread .sleep(3000);
	//takes screenshot
	Screenshot k= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

	ImageIO.write(k.getImage(), "png", new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\Claim_rej_01.png"));
// close browser
	Thread .sleep(4000);
	  driver.close();	
}
	

}
