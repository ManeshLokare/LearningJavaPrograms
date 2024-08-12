package ex_110824_Abstraction.AbstractClass.Ex_005;

public class Firefox extends Browser{


    @Override
    String openBrowser(String browser) {
        System.out.println("Start Firefox browser");
        return "";
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Close Firefox browser");
        return "";
    }
}
