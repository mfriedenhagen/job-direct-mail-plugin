package org.jenkinsci.plugins.jobmail.actions;

//import hudson.plugins.emailext.*;
//import org.jenkins-ci.plugins.*;
import org.jenkinsci.plugins.jobmail.utils.Constants;

import hudson.model.Action;
import hudson.model.Actionable;

public class JobMailBaseAction extends Actionable implements Action {
    
    //private static final Logger LOGGER = Logger.getLogger(JobMailBaseAction.class.getName());
    
    public final String getDisplayName() {
        return Constants.NAME;
    }

    public final String getIconFileName() {
        return Constants.ICONFILENAME;
    }

    public String getUrlName() {
        return Constants.URL;
    }

    public String getSearchUrl() {
        return Constants.URL;
    }
}
