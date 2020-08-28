package hghjj;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

 




public class dfdfdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "Z:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();    
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        //driver.get("https://myinspire.microsoft.com/attendees?s=%257B%2522name%2522%253A%2522translate.refine.label.sort.a-z%2522%252C%2522type%2522%253A1%252C%2522%2524%2524hashKey%2522%253A%2522object%253A150%2522%257D");
	        driver.get("https://myinspire.microsoft.com/attendees?s=%257B%2522name%2522%253A%2522translate.refine.label.sort.a-z%2522%252C%2522type%2522%253A1%252C%2522%2524%2524hashKey%2522%253A%2522object%253A150%2522%257D#top-anchor");
	        
	        
	        
	        Thread.sleep(10001);
	        driver.findElement(By.id("ecCommonAADExchange")).click();
	        driver.findElement(By.id("i0116")).sendKeys("jaiprakash@racknap.com");
	        Thread.sleep(3000);
	        driver.findElement(By.id("idSIButton9")).click();
	        driver.findElement(By.id("i0118")).sendKeys("Znet@1234");
	        Thread.sleep(3000);
	        driver.findElement(By.id("idSIButton9")).click();
	        Thread.sleep(50000);
	        
	        driver.findElement(By.xpath("//div[@id='content-container']//authorized-by-scope//ng-transclude//div//div//search-header-bar//div//div//div//span//refine-results-button//mwf-button//a[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Country of Business')]")).click();
	        Thread.sleep(3000);

	 

	        driver.findElement(By.xpath("//mwf-refiner[4]//div[1]//div[1]//ul[1]//li[10]//mwf-button[1]//a[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Singapore')]")).click();
	        
	        Actions actions = new Actions(driver);

	 

	        Robot robot = new Robot();

	 

	        robot.mouseMove(50,50);

	 

	        actions.click().build().perform();
	        
	        //driver.navigate().to("https://myinspire.microsoft.com/attendees?s=%257B%2522name%2522%253A%2522translate.refine.label.sort.a-z%2522%252C%2522type%2522%253A1%252C%2522%2524%2524hashKey%2522%253A%2522object%253A150%2522%257D&p=2048#top-anchor");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[@id='content-container']//authorized-by-scope//ng-transclude//div//div//search-header-bar//div//div//div//mwf-select-react//div//button")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mwf-select-react//li[4]//a[1]")).click();
	    //    Thread.sleep(5000);
	    //    driver.navigate().to("https://myinspire.microsoft.com/attendees?s=%257B%2522name%2522%253A%2522translate.refine.label.sort.a-z%2522%252C%2522type%2522%253A1%252C%2522%2524%2524hashKey%2522%253A%2522object%253A150%2522%257D&p=2048#top-anchor");
	        //WritableWorkbook wb = Workbook.createWorkbook(new File("C:\\Users\\tarun\\Desktop\\testdata1.xls"));
	        //WritableSheet ws = wb.createSheet("customsheet",1);
	        Thread.sleep(5000);
	        //int i=0;
	        
	        
	        List<String> urlList=new ArrayList<>();
	        
	        //WebElement[] urlList = new WebElement[] {};
	        do {
	            Thread.sleep(3000);
	        List<WebElement> PMPageCMList = driver.findElements(By.xpath("//h4[@class='attendee-list-item__heading-name c-heading-4 f-lean']/a[1]"));
	        //String Attribute=PMPageCMList
	        
	    //    List<WebElement> PMPageCMList1 = driver.findElements(By.xpath("//div[@class='attendee-list-item__company']"));
	        int totalcms = PMPageCMList.size();
	        System.out.println("Size: "+totalcms);
	        //Iterator<WebElement> itr = PMPageCMList.iterator();
	     //   Iterator<WebElement> itr1 = PMPageCMList1.iterator();
	        int k=0;
	        while(k<PMPageCMList.size()){
	            //loading text of each element in to array all_elements_text
	            urlList.add(PMPageCMList.get(k).getAttribute("href"));
	            //System.out.println("Value of: "+k);
	            //System.out.println(PMPageCMList.get(k).getAttribute("href"));
	            k++;
	            
	        }
	        
	       
	        
//	        while(itr.hasNext()) {
//	            //WritableWorkbook workbook = Workbook.createWorkbook(new File("C:\\Users\\tarun\\Desktop\\testdata.xlsx"));
//	            //System.out.println(itr.next().getText());
//	            //wb.getSheet(0);
	//
//	               //urlList.add(PMPageCMList.get(i).getText());
//	            urlList.add(itr.next().getText());
//	            System.out.print(urlList);
//	            //System.out.print(" : ");
//	        //    System.out.print(itr1.next().getText());
//	            //System.out.println(" ");
////	            Label label = new Label(1,i,itr.next().getText());
////	            ws.addCell(label);
////	            Label label1 = new Label(2,i,itr1.next().getText());
////	            ws.addCell(label1);
//	            i++;
//	            }
	        //wb.write();
	       // wb.close();
	        
	        try {
	            
	            Thread.sleep(3000);
	        driver.findElement(By.xpath("//search-header-bar//li[7]//a[1]")).click();
	        }catch (Exception e){
	            Thread.sleep(4000);
	            
	            break;
	            //driver.findElement(By.xpath("//search-header-bar//li[7]//a[1]")).click();
	        }
	        
	        Thread.sleep(6000);
	        
	        }while(driver.findElement(By.xpath("//search-header-bar//li[7]//a[1]")).isEnabled());
//	        try {
//	            System.out.println("Ended");
//	        } finally {
	//
//	            if (wb != null) {
//	                try {
//	                    wb.close();
//	                    
//	                    System.out.println("Close file");
//	                } catch (IOException e) {
//	                    e.printStackTrace();
//	                } 
//	    }
	        for(int j=0;j<=urlList.size();j++)
	        {
	        driver.navigate().to(urlList.get(j));
	        Thread.sleep(3000);
	        System.out.print(driver.findElement(By.xpath("//div[@class='attendee-detail__info--heading']")).getText());
	        System.out.print(" : ");
	        System.out.print(driver.findElement(By.xpath("//p[@class='c-paragraph-2 f-lean']")).getText());
	        System.out.print(" : ");
	        System.out.print(driver.findElement(By.xpath("//div[@class='metadata__property']")).getText());
	        System.out.println(" ");
	        System.out.println(" ");
	        
	    }
	}

}
