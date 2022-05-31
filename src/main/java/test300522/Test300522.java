package test300522;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test300522 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\stplguest\\Downloads\\chromedriver_win32 (2705)\\chromedriver.exe\\");
		WebDriver d=new ChromeDriver();
        d.get("http://trti.mahamining.com/home");
        Thread.sleep(1000);
        d.manage().window().maximize();
        d.navigate().refresh();
        Thread.sleep(3000);
        d.findElement(By.id("home_login")).click();
        Thread.sleep(3000);
        d.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("admin");
        d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin");
        Thread .sleep(1000);	
  	  String s=JOptionPane.showInputDialog("enter your captcha");
  	    //JOptionPane for make dialog and to create dialog box 
  	  	d.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
  	      Thread .sleep(1000);
  	    
  	  	d.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
  	  	Thread .sleep(1000);
	    d.close();
	
	
	
	
	}

	}


