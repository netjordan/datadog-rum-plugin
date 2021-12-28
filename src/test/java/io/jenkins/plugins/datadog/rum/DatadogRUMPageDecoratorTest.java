package io.jenkins.plugins.datadog.rum;

import com.gargoylesoftware.htmlunit.WebAssert;
import com.gargoylesoftware.htmlunit.html.HtmlHead;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import static org.junit.Assert.assertTrue;

public class DatadogRUMPageDecoratorTest {

    private JenkinsRule.WebClient webClient;

//
//    /**
//     * Asserts that the analytics script is in the head element.
//     */
//    @Test
//    public void testHeadElementContainsScript() throws Exception {
//        webClient.setJavaScriptEnabled(false);
//        HtmlPage page = webClient.goTo("configure");
//        WebAssert.assertInputContainsValue(page, "_.profileId", "AProfileId");
//        HtmlHead item = (HtmlHead) page.getElementsByTagName(HtmlHead.TAG_NAME).item(0);
//        assertTrue("The page text did not contain the google analytics script",
//                item.asXml().contains("_gaq.push(['_setAccount', 'AProfileId']);"));
//    }

}
