package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;
import ru.netology.page.DashboardPage;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
	private SelenideElement verificationField = $("[data-test-id='code']input");
	private SelenideElement verifyButton = $("[data-test-id='action-verify']");

	public DashboardPage verify(String code) {
		verificationField.setValue(code);
		verifyButton.click();
		return new DashboardPage();
	}
}
