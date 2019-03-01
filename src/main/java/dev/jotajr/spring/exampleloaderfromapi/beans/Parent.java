package dev.jotajr.spring.exampleloaderfromapi.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Parent {

    private String title;
    private String locationType;
    private int woeid;
    private String lattLong;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the locationType
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * @param locationType the locationType to set
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * @return the woeid
     */
    public int getWoeid() {
        return woeid;
    }

    /**
     * @param woeid the woeid to set
     */
    public void setWoeid(int woeid) {
        this.woeid = woeid;
    }

    /**
     * @return the lattLong
     */
    public String getLattLong() {
        return lattLong;
    }

    /**
     * @param lattLong the lattLong to set
     */
    public void setLattLong(String lattLong) {
        this.lattLong = lattLong;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}