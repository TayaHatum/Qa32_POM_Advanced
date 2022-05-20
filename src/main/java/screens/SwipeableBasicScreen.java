package screens;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SwipeableBasicScreen extends BaseScreen{
    public SwipeableBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/container']")
    List<MobileElement> list;

    public SwipeableBasicScreen swipeFromLeftToRight(int index){

        // home work
        return this;
    }

    public SwipeableBasicScreen swipeFromRightToLeft(int index){

        // home work
        return this;
    }
}
