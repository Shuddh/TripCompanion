package com.travelCompanion.taglib;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.tags.RequestContextAwareTag;

public class StaticTextTagLib extends RequestContextAwareTag {

    private Logger LOGGER = Logger.getLogger(StaticTextTagLib.class);
    private String key;

    protected int doStartTagInternal() throws Exception {
        return 0;
    }
}
