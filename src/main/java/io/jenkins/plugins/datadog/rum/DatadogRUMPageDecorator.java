package io.jenkins.plugins.datadog.rum;

import hudson.BulkChange;
import hudson.Extension;
import hudson.model.PageDecorator;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.StaplerRequest;

@Extension
public class DatadogRUMPageDecorator extends PageDecorator {

    private String clientToken;
    private String applicationId;
    private String site;
    private String service;
    private String env;
    private int sampleRate;
    private boolean enableSessionReplay;

    @DataBoundConstructor
    public DatadogRUMPageDecorator(String clientToken, String applicationId, String site, String service, String env, int sampleRate, boolean enableSessionReplay) {
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
        this.save();
        return true;
    }

    public String getClientToken() {
        return clientToken;
    }

    @DataBoundSetter
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getApplicationId() {
        return applicationId;
    }

    @DataBoundSetter
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getSite() {
        return site;
    }

    @DataBoundSetter
    public void setSite(String site) {
        this.site = site;
    }

    public String getService() {
        return service;
    }

    @DataBoundSetter
    public void setService(String service) {
        this.service = service;
    }

    public String getEnv() {
        return env;
    }

    @DataBoundSetter
    public void setEnv(String env) {
        this.env = env;
    }

    public int getSampleRate() {
        return sampleRate;
    }

    @DataBoundSetter
    public void setSampleRate(int sampleRate) {
        this.sampleRate = sampleRate;
    }

    public boolean isEnableSessionReplay() {
        return enableSessionReplay;
    }

    @DataBoundSetter
    public void setEnableSessionReplay(boolean enableSessionReplay) {
        this.enableSessionReplay = enableSessionReplay;
    }
}
