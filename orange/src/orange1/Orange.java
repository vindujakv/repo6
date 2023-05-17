package orange1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orange
{
public static void main(String[] args)
{
System.out.println("stc first demo test ");
System.setProperty("webdriver.gecko.driver","C:\\Users\\coolbin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.get("http://localhost/orangehrm/orangehrm-5.4/web/index.php/auth/login");
       driver.findElement(By.name("username")).sendKeys("adminn");
       driver.findElement(By.name("password")).sendKeys("Passb@1234");
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.findElement(By.name("firstName")).sendKeys("vinduja");
       driver.findElement(By.name("middleName")).sendKeys("vijayan");
       driver.findElement(By.name("lastName")).sendKeys("k");
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("vindujakv");
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Vinduja@835");
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Vinduja@835");
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/div[2]/div/label")).click();
       driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
       
}

}



