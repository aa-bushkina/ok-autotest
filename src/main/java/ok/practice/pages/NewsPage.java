package ok.practice.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NewsPage {

    private final SelenideElement searchField = $(byName("st.query"));
    private final SelenideElement user =
            $(byXpath("//div[contains(@class, 'card-caption__a0i64 card-caption-small__02cy5') and " +
                    "text() = \"technoPol17 technoPol17\"]"));

    public void findUser(String name) {
        searchField.setValue(name);
        user.click();
    }
}
