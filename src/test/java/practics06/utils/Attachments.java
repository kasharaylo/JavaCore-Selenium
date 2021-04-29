package practics06.utils;

import io.qameta.allure.Attachment;

public class Attachments {
	@Attachment
	public String savePageContent(String pageHtml) {
	    return pageHtml;
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshot(byte[] screenShot) {
	    return screenShot;
	}
}
