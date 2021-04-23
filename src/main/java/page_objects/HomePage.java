package page_objects;

import common.Constant;

public class HomePage extends BasePage {
    public void open() {
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
    }
}
