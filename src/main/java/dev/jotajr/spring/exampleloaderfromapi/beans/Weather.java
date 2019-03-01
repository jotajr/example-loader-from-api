package dev.jotajr.spring.exampleloaderfromapi.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {


    private String title;
    private String locationType;
    private int woeid;
    private String lattLong;
    private String timezone;
    private Parent parent;
    private List<ConsolidatedWeather> consolidatedWeather;

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

    /**
     * @return the timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @param timezone the timezone to set
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * @return the parent
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    /**
     * @return the consolidatedWeather
     */
    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    /**
     * @param consolidatedWeather the consolidatedWeather to set
     */
    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }


}