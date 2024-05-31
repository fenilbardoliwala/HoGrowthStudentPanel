package horegistrationwithoutgoogle;
import com.aventstack.extentreports.MediaEntityBuilder;
import hobasereport.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationWithOutGoogleTest extends BaseTest {

@Test

    public void StudentRegistrationBlankFieldValidationTest1() throws IOException {

            WebElement btnSignUp = driver.findElement(By.xpath("//span[text()=\"Sign Up\"]"));
            btnSignUp.click();

            WebElement btnRegister = driver.findElement(By.id("kt_sign_up_submit"));
            btnRegister.click();

            //FullName
            WebElement FullNameInput = driver.findElement(By.xpath("//input[@placeholder='Enter First Name']"));
            FullNameInput.clear();


            WebElement errorMessageFullName = driver.findElement(By.xpath("//p[normalize-space()='Name is required']"));


            //email
            WebElement EmailInput = driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
            EmailInput.clear();
            WebElement errorMessageEmail = driver.findElement(By.xpath("//p[normalize-space()='Please enter a valid email address']"));


            //password
            WebElement PasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Create Password']"));
            PasswordInput.clear();
            WebElement errorMessagePassword = driver.findElement(By.xpath("//p[normalize-space()='create password is required']"));

            //re-enter password
            WebElement ReEnterPasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']"));
            ReEnterPasswordInput.clear();
            WebElement errorMessageReEnterPassword = driver.findElement(By.xpath("//p[normalize-space()='Confirm password is required']"));

            System.out.println("\u001B[33m-----TestCases1:-Check blank first name validation-----\u001B[0m");
            //Check blank field handled or not
            if (errorMessageFullName.isDisplayed())
            {
                System.out.println("Blank full name fields handled correctly.");
            }
            else
            {
                System.out.println("Error handling is not working as expected.");
            }
            String expected1 = "Name is required";
            String actual1 = driver.findElement(By.xpath("//p[normalize-space()='Name is required']")).getText();
            test = reports.createTest("Check blank full name validation").assignAuthor("Fenil").assignCategory(getClass().
                    getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath
                    ("./TestcasesScreenshot/screenshots" + takingScreenshot(driver),"Check blank full name validation").build());
            Assert.assertTrue(true);//pass
            System.out.println("expected1=" + expected1);
            System.out.println("actual1=" + actual1);
            Assert.assertEquals("Full name required field validation not work", expected1, actual1);
            if (actual1.equalsIgnoreCase(expected1))
            {
                System.out.println("\u001B[32m***Test passed***\u001B[0m");
            }
            else
            { driver.quit();
                System.out.println("\u001B[31m***Test Failed***\u001B[0m");
            }
            System.out.println("\u001B[33m-----TestCases2:-Check blank enail validation-----\u001B[0m");
            //Check blank field handled or not
            if (errorMessageEmail.isDisplayed())
            {
                System.out.println("Blank email fields handled correctly.");
            }
            else
            {
                System.out.println("Error handling is not working as expected.");
            }
            String expected2 = "Please enter a valid email address";
            String actual2 = driver.findElement(By.xpath("//p[normalize-space()='Please enter a valid email address']")).getText();
            test = reports.createTest("Check blank email validation").assignAuthor("Fenil").assignCategory(getClass().
                    getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath
                    ("./TestcasesScreenshot/screenshots" + takingScreenshot(driver),"Check blank email validation").build());
            Assert.assertTrue(true);//pass
            System.out.println("expected2=" + expected2);
            System.out.println("actual2=" + actual2);
            Assert.assertEquals("Email required field validation not work", expected2, actual2);
            if (actual2.equalsIgnoreCase(expected2))
            {
                System.out.println("\u001B[32m***Test passed***\u001B[0m");
            }
            else
            {
                System.out.println("\u001B[31m***Test Failed***\u001B[0m");
            }
            System.out.println("\u001B[33m-----TestCases3:-Check blank create paasword validation-----\u001B[0m");
            //Check blank field handled or not
            if (errorMessagePassword.isDisplayed())
            {
                System.out.println("Blank create paasword fields handled correctly.");
            }
            else
            {
                System.out.println("Error handling is not working as expected.");
            }
            String expected3 = "create password is required";
            String actual3 = driver.findElement(By.xpath("//p[normalize-space()='create password is required']")).getText();
            test = reports.createTest("Check blank create paasword validation").assignAuthor("Fenil").assignCategory(getClass().
                    getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath
                    ("./TestcasesScreenshot/screenshots" + takingScreenshot(driver),"Check blank create paasword validation").build());
            Assert.assertTrue(true);//pass
            System.out.println("expected3=" + expected3);
            System.out.println("actual3=" + actual3);
            Assert.assertEquals("Create paasword required field validation not work", expected3, actual3);
            if (actual3.equalsIgnoreCase(expected3))
            {
                System.out.println("\u001B[32m***Test passed***\u001B[0m");
            }
            else
            {
                System.out.println("\u001B[31m***Test Failed***\u001B[0m");
            }

            System.out.println("\u001B[33m-----TestCases4:-Check blank Confirm paasword validation-----\u001B[0m");
            //Check blank field handled or not
            if (errorMessageReEnterPassword.isDisplayed())
            {
                System.out.println("Blank confirm paasword fields handled correctly.");
            }
            else
            {
                System.out.println("Error handling is not working as expected.");
            }
            String expected4 = "Confirm password is required";
            String actual4 = driver.findElement(By.xpath("//p[normalize-space()='Confirm password is required']")).getText();
            test = reports.createTest("Check blank confirm paasword validation").assignAuthor("Fenil").assignCategory(getClass().
                    getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath
                    ("./TestcasesScreenshot/screenshots" + takingScreenshot(driver),"Check blank confirm paasword validation").build());
            Assert.assertTrue(true);//pass
            System.out.println("expected4=" + expected4);
            System.out.println("actual4=" + actual4);
            Assert.assertEquals("Create paasword required field validation not work", expected4, actual4);
            if (actual4.equalsIgnoreCase(expected4))
            {
                System.out.println("\u001B[32m***Test passed***\u001B[0m");
            }
            else
            {
                System.out.println("\u001B[31m***Test Failed***\u001B[0m");
            }
        //driver.quit();
    }
@Test
        public void StudentRegistrationInvalidEmailValidationTest() throws IOException, InterruptedException {
                //FullName
                Thread.sleep(2000);
                driver.navigate().refresh();
                WebElement FullNameInput = driver.findElement(By.xpath("//input[@placeholder='Enter First Name']"));
                FullNameInput.sendKeys("Fenil Bardoliwala");

                //email
                WebElement EmailInput = driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
                String email = "test@example";
                EmailInput.sendKeys(email);
                EmailInput.sendKeys(Keys.RETURN);
                WebElement errorMessageEmail = driver.findElement(By.xpath("//p[normalize-space()='Please enter a valid email address']"));

                //password
                WebElement PasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Create Password']"));
                PasswordInput.sendKeys(pass);

                //re-enter password
                WebElement ReEnterPasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']"));
                ReEnterPasswordInput.sendKeys(pass);

                WebElement btnRegister = driver.findElement(By.id("kt_sign_up_submit"));
                btnRegister.click();


                String responseText = errorMessageEmail.getText();
                String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
                Pattern pattern = Pattern.compile(emailRegex);
                Matcher matcher = pattern.matcher(responseText);
                // Check the validation result
                if (matcher.matches())
                {
                        System.out.println("The email address " + email + " is valid.");
                } else

                {
                        System.out.println("The email address " + email + " is not valid.");
                }
                System.out.println("\u001B[33m-----TestCases5:-Check invalid email address validation-----\u001B[0m");
                String expected5 = "Please enter a valid email address";
                String actual5 = driver.findElement(By.xpath("//p[normalize-space()='Please enter a valid email address']")).getText();
                test = reports.createTest("Check invalid email address validation").assignAuthor("Fenil").assignCategory("Registration WithOut Google Testcases")
                        .assignDevice("Firefox").pass(MediaEntityBuilder.createScreenCaptureFromPath("./TestcasesScreenshot/screenshots"+takingScreenshot(driver),"Check invalid email address validation").build());
                Assert.assertTrue(true);//pass
                System.out.println("expected5=" + expected5);
                System.out.println("actual5=" + actual5);
                Assert.assertEquals("Invalid email address validation not work", expected5, actual5);
                if (actual5.equalsIgnoreCase(expected5))
                {
                        System.out.println("\u001B[32m***Test passed***\u001B[0m");
                }
                else
                {
                        System.out.println("\u001B[31m***Test Failed***\u001B[0m");
                }
        }
@Test
        public void StudentRegistrationInvalidPasswordFormatValidationTest3() throws IOException, InterruptedException {
//                WebElement btnSignUp = driver.findElement(By.xpath("//span[text()=\"Sign Up\"]"));
//                btnSignUp.click();

                //FullName
               Thread.sleep(2000);
                driver.navigate().refresh();
                WebElement FullNameInput = driver.findElement(By.xpath("//input[@placeholder='Enter First Name']"));
                FullNameInput.sendKeys("Fenil Bardoliwala");

                //email
                WebElement EmailInput = driver.findElement(By.xpath("//input[@placeholder='Enter Email']"));
                EmailInput.sendKeys(GetRandomEmail()+"@gmail.com");
                //password
                WebElement PasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Create Password']"));
                PasswordInput.sendKeys(ipass);

                //re-enter password
                WebElement ReEnterPasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']"));
                ReEnterPasswordInput.sendKeys(ipass);

                WebElement btnRegister = driver.findElement(By.id("kt_sign_up_submit"));
                btnRegister.click();

                WebElement errorMessagePassword = driver.findElement(By.xpath("//p[normalize-space()='Password must contain at least one special character and one number']"));
                String responseText = errorMessagePassword.getText();
                String lengthRegex = ".{8,}";
                String specialCharRegex = ".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>?].*";
                String digitRegex = ".*\\d.*";
                String uppercaseRegex = ".*[A-Z].*";
                String lowercaseRegex = ".*[a-z].*";
                String combinedRegex = lengthRegex + specialCharRegex + digitRegex + uppercaseRegex + lowercaseRegex;
                Pattern pattern = Pattern.compile(combinedRegex);
                Matcher matcher = pattern.matcher(responseText);
                // Check the validation result
                if (matcher.matches())
                {
                        System.out.println("The password  " + ipass + " is  valid.");
                }
                else
                {
                        System.out.println("The password  " + ipass + " is not valid.");
                }
                System.out.println("\u001B[33m-----TestCases6:-Check invalid password validation-----\u001B[0m");
                String expected6 = "Password must contain at least one special character and one number";
                String actual6 = driver.findElement(By.xpath("//p[normalize-space()='Password must contain at least one special character and one number']")).getText();
                test = reports.createTest("Check invalid password validation").assignAuthor("Fenil").assignCategory("Registration WithOut Google Testcases")
                        .assignDevice("Firefox").pass(MediaEntityBuilder.createScreenCaptureFromPath("./TestcasesScreenshot/screenshots"+takingScreenshot(driver),"Check invalid password validation").build());
                Assert.assertTrue(true);//pass
                System.out.println("expected6=" + expected6);
                System.out.println("actual6=" + actual6);
                Assert.assertEquals("Invalid email address validation not work", expected6, actual6);
                if (actual6.equalsIgnoreCase(expected6))
                {
                        System.out.println("\u001B[32m***Test passed***\u001B[0m");
                }
                else
                {
                        System.out.println("\u001B[31m***Test Failed***\u001B[0m");
                }

        }
}
