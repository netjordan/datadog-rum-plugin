package io.jenkins.plugins.datadog.rum;

import hudson.Extension;
import hudson.model.PageDecorator;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;

@Extension
public class DatadogRUMPageDecorator extends PageDecorator {

    private String clientToken;
    private String applicationId;
    private String site;
    private String service;
    private String env;
    private String sampleRate;
    private boolean enableSessionReplay;

    @DataBoundConstructor
    public DatadogRUMPageDecorator(String clientToken, String applicationId, String site, String service, String env, String sampleRate, boolean enableSessionReplay) {
        this();
        this.clientToken = clientToken;
        this.applicationId = applicationId;
        this.site = site;
        this.service = service;
        this.env = env;
        this.sampleRate = sampleRate;
        this.enableSessionReplay = enableSessionReplay;
    }

    public DatadogRUMPageDecorator() {
        super(DatadogRUMPageDecorator.class);
        load();
    }

    @Override
    public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
        req.bindJSON(this, json);
        save();
        return true;
    }

    private void validateFieldClientToken(String fieldValue) {

    }

    private void validateFieldApplicationId(String fieldValue) {

    }

    private void validateFieldSite(String fieldValue) {

    }

    private void validateFieldService(String fieldValue) {

    }

    private void validateFieldEnv(String fieldValue) {}

    private void validateFieldSampleRate(String fieldValue) {

    }

    private void validateFieldEnableSessionReplay(String fieldValue) {

    }

    public String getClientToken() {
        return clientToken;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public String getSite() {
        return site;
    }

    public String getService() {
        return service;
    }

    public String getEnv() {
        return env;
    }

    public String getSampleRate() {
        return sampleRate;
    }

    public boolean isEnableSessionReplay() {
        return enableSessionReplay;
    }

}
