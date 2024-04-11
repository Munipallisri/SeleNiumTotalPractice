package Numbers;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		Actions act=new Actions(driver);
//		WebElement element=driver.findElement(By.id("elementid"));
//		act.doubleClick(element).perform();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		int orgnum = num;

		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println(rev + " is the reverse Number");

		if (String.valueOf(orgnum).equals(rev.toString())) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
