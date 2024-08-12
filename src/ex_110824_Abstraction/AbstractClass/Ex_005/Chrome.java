package ex_110824_Abstraction.AbstractClass.Ex_005;

public class Chrome extends Browser{

    @Override
    String openBrowser(String browser) {
        System.out.println("Start Chrome browser");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Close Chrome browser");
        return "";
    }
}
