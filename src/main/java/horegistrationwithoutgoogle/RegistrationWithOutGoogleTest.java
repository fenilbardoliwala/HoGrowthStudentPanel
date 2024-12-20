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

    public void StudentRegistrationBlankFieldValidationTest1() throws IOException, InterruptedException {

            Thread.sleep(5000);
            WebElement btnSignUp = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
            btnSignUp.click();

            WebElement btnContinue = driver.findElement(By.xpath("//span[text()='Continue']"));
            btnContinue.click();

            //FullName
            WebElement FullNameInput = driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']"));
            FullNameInput.clear();


            WebElement errorMessageFullName = driver.findElement(By.xpath("//div[normalize-space()='Please enter your full name']"));


            //email
            WebElement EmailInput = driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']"));
            EmailInput.clear();
            WebElement errorMessageEmail = driver.findElement(By.xpath("//div[normalize-space()='Please enter your email address']"));

            //Mobile
            WebElement MobileInput = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number (e.g. - 6123456789)']"));
            MobileInput.click();
            EmailInput.click();
            MobileInput.clear();
            WebElement errorMessageMobile = driver.findElement(By.xpath("//div[normalize-space()='Please enter your mobile number']"));


            //password
            WebElement PasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']"));
            PasswordInput.clear();
            WebElement errorMessagePassword = driver.findElement(By.xpath("//div[normalize-space()='Please create a password']"));


            System.out.println("\u001B[33m-----TestCases1:-Check blank full name validation-----\u001B[0m");
            //Check blank field handled or not
            if (errorMessageFullName.isDisplayed())
            {
                System.out.println("Blank full name fields handled correctly.");
            }
            else
            {
                System.out.println("Error handling is not working as expected.");
            }
            String expected1 = "Please enter your full name";
            String actual1 = driver.findElement(By.xpath("//div[normalize-space()='Please enter your full name']")).getText();
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
            {
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
            String expected2 = "Please enter your email address";
            String actual2 = driver.findElement(By.xpath("//div[normalize-space()='Please enter your email address']")).getText();
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
            System.out.println("\u001B[33m-----TestCases3:-Check blank mobile number validation-----\u001B[0m");
            //Check blank field handled or not
            if (errorMessageMobile.isDisplayed())
            {
                System.out.println("Blank mobile number fields handled correctly.");
            }
            else
            {
                System.out.println("Error handling is not working as expected.");
            }
            String expected3 = "Please enter your mobile number";
            String actual3 = driver.findElement(By.xpath("//div[normalize-space()='Please enter your mobile number']")).getText();
            test = reports.createTest("Check blank mobile number validation").assignAuthor("Fenil").assignCategory(getClass().
                    getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath
                    ("./TestcasesScreenshot/screenshots" + takingScreenshot(driver),"Check blank mobile number validation").build());
            Assert.assertTrue(true);//pass
            System.out.println("expected3=" + expected3);
            System.out.println("actual3=" + actual3);
            Assert.assertEquals("Mobile number required field validation not work", expected3, actual3);
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
            if (errorMessagePassword.isDisplayed())
            {
                System.out.println("Blank paasword fields handled correctly.");
            }
            else
            {
                System.out.println("Error handling is not working as expected.");
            }
            String expected4 = "Please create a password";
            String actual4 = driver.findElement(By.xpath("//div[normalize-space()='Please create a password']")).getText();
            test = reports.createTest("Check blank paasword validation").assignAuthor("Fenil").assignCategory(getClass().
                    getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath
                    ("./TestcasesScreenshot/screenshots" + takingScreenshot(driver),"Check blank paasword validation").build());
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
                test = reports.createTest("Check invalid email address validation").assignAuthor("Fenil").assignCategory(getClass().
            getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath("./TestcasesScreenshot/screenshots"+takingScreenshot(driver),"Check invalid email address validation").build());
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
                test = reports.createTest("Check invalid password validation").assignAuthor("Fenil").assignCategory(getClass().
                        getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath("./TestcasesScreenshot/screenshots"+takingScreenshot(driver),"Check invalid password validation").build());
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
    @Test
    public void StudentRegistrationPasswordMatchValidationTest4() throws IOException, InterruptedException {
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
        PasswordInput.sendKeys("Fenil@123");

        //re-enter password
        WebElement ReEnterPasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']"));
        ReEnterPasswordInput.sendKeys("Fenil@1234");
        WebElement btnRegister = driver.findElement(By.id("kt_sign_up_submit"));
        btnRegister.click();
        //WebElement errorMessagePasswordMatches = driver.findElement(By.xpath("//p[normalize-space()='Passwords do not match']"));
        System.out.println("\u001B[33m-----TestCases7:-Check password and re-enter password matched validation-----\u001B[0m");
        String expected7 = "Passwords do not match";
        String actual7 = driver.findElement(By.xpath("//p[normalize-space()='Passwords do not match']")).getText();
        test = reports.createTest("Check password and re-enter password matched validation").assignAuthor("Fenil").assignCategory(getClass().
                getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath("./TestcasesScreenshot/screenshots"+takingScreenshot(driver),"Check password and re-enter password matched validation").build());
        Assert.assertTrue(true);//pass
        System.out.println("expected7=" + expected7);
        System.out.println("actual7=" + actual7);
        Assert.assertEquals("Password and re-enter password validation not work", expected7, actual7);
        if (actual7.equalsIgnoreCase(expected7))
        {
            System.out.println("\u001B[32m***Test passed***\u001B[0m");
        }
        else
        {
            System.out.println("\u001B[31m***Test Failed***\u001B[0m");
        }
}
    @Test
    public void StudentRegistrationWithValidDataTest5() throws IOException, InterruptedException {
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
        PasswordInput.sendKeys(pass);
        //re-enter password
        WebElement ReEnterPasswordInput = driver.findElement(By.xpath("//input[@placeholder='Enter Confirm Password']"));
        ReEnterPasswordInput.sendKeys(pass);
        WebElement btnRegister = driver.findElement(By.id("kt_sign_up_submit"));
        btnRegister.click();
        System.out.println("\u001B[33m-----TestCases8:-Check registration with out google functionality with valid data with mobile OTP verification-----\u001B[0m");
        String expected8 = "Passwords do not match";
        String actual8 = driver.findElement(By.xpath("//p[normalize-space()='Passwords do not match']")).getText();
        test = reports.createTest("Check registration with out google functionality with valid data with mobile OTP verification").assignAuthor("Fenil").assignCategory(getClass().
                getName()).assignDevice(driver.getClass().getSimpleName()).pass(MediaEntityBuilder.createScreenCaptureFromPath("./TestcasesScreenshot/screenshots"+takingScreenshot(driver),"Check registration with out google functionality with valid data with mobile OTP verification").build());
        Assert.assertTrue(true);//pass
        System.out.println("expected8=" + expected8);
        System.out.println("actual8=" + actual8);
        Assert.assertEquals("Registration with out google functionality with valid data with mobile OTP verification not work", expected8, actual8);
        if (actual8.equalsIgnoreCase(expected8))
        {
            System.out.println("\u001B[32m***Test passed***\u001B[0m");
        }
        else
        {
            System.out.println("\u001B[31m***Test Failed***\u001B[0m");
        }
    }
}
