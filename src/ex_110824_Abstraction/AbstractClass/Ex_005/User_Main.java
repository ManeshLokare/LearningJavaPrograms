package ex_110824_Abstraction.AbstractClass.Ex_005;

public class User_Main {
    public static void main(String[] args) {

        Chrome c= new Chrome();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");

        Firefox f = new Firefox();
        f.openBrowser("Firefox");
        f.closeBrowser("Firefox");

        Browser b1 = new Chrome();
        Browser b2 = new Firefox();
              b1.openBrowser("Chrome");
              b1.closeBrowser("Chrome");
              b2.openBrowser("Firefox");
              b2.closeBrowser("Firefox");


    }
}
