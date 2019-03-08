package dev.jotajr.spring.exampleloaderfromapi.beans.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedWeather {

    private Long id;
    private String weatherStateName;
    private String weatherStateAbbr;
    private String windDirectionCompass;
    private String created;
    private String applicableDate;
    private Double minTemp;
    private Double maxTemp;
    private Double theTemp;
    private Double windSpeed;
    private Double windDirection;
    private Double airPressure;
    private Double humidity;
    private Double visibility;
    private Double predictability;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the weatherStateName
     */
    public String getWeatherStateName() {
        return weatherStateName;
    }

    /**
     * @param weatherStateName the weatherStateName to set
     */
    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    /**
     * @return the weatherStateAbbr
     */
    public String getWeatherStateAbbr() {
        return weatherStateAbbr;
    }

    /**
     * @param weatherStateAbbr the weatherStateAbbr to set
     */
    public void setWeatherStateAbbr(String weatherStateAbbr) {
        this.weatherStateAbbr = weatherStateAbbr;
    }

    /**
     * @return the windDirectionCompass
     */
    public String getWindDirectionCompass() {
        return windDirectionCompass;
    }

    /**
     * @param windDirectionCompass the windDirectionCompass to set
     */
    public void setWindDirectionCompass(String windDirectionCompass) {
        this.windDirectionCompass = windDirectionCompass;
    }

    /**
     * @return the created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return the applicableDate
     */
    public String getApplicableDate() {
        return applicableDate;
    }

    /**
     * @param applicableDate the applicableDate to set
     */
    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    /**
     * @return the minTemp
     */
    public Double getMinTemp() {
        return minTemp;
    }

    /**
     * @param minTemp the minTemp to set
     */
    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    /**
     * @return the maxTemp
     */
    public Double getMaxTemp() {
        return maxTemp;
    }

    /**
     * @param maxTemp the maxTemp to set
     */
    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    /**
     * @return the theTemp
     */
    public Double getTheTemp() {
        return theTemp;
    }

    /**
     * @param theTemp the theTemp to set
     */
    public void setTheTemp(Double theTemp) {
        this.theTemp = theTemp;
    }

    /**
     * @return the windSpeed
     */
    public Double getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed the windSpeed to set
     */
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return the windDirection
     */
    public Double getWindDirection() {
        return windDirection;
    }

    /**
     * @param windDirection the windDirection to set
     */
    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }

    /**
     * @return the airPressure
     */
    public Double getAirPressure() {
        return airPressure;
    }

    /**
     * @param airPressure the airPressure to set
     */
    public void setAirPressure(Double airPressure) {
        this.airPressure = airPressure;
    }

    /**
     * @return the humidity
     */
    public Double getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the visibility
     */
    public Double getVisibility() {
        return visibility;
    }

    /**
     * @param visibility the visibility to set
     */
    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    /**
     * @return the predictability
     */
    public Double getPredictability() {
        return predictability;
    }

    /**
     * @param predictability the predictability to set
     */
    public void setPredictability(Double predictability) {
        this.predictability = predictability;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}