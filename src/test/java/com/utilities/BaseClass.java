package com.utilities;

public class BaseClass {
    public static WebDriver driver;
    public static Logger logger;  //Log4j
    public static Properties p;
    @BeforeMethod
    public static WebDriver setUp() throws IOException {
        FileReader file=new FileReader("./src//test//resources//config.properties");
        p=new Properties();
        p.load(file);
        String browser=System.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")) {
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        }
        else {
            driver=null;
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

        driver.get(p.getProperty("appURL")); // reading url from properties file.
        driver.manage().window().maximize();
        return driver;


    }
}
