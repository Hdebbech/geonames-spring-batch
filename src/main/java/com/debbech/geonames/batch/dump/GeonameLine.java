package com.debbech.geonames.batch.dump;

public class GeonameLine {

        private String geonameId;
        private String name;
        private String ascciName;
        private String alternateNames;
        private String latitude;
        private String longitude;
        private String featureClass;
        private String featureCode;
        private String countryCode;
        private String cc2;
        private String admin1Code;
        private String admin2Code;
        private String admin3Code;
        private String admin4Code;
        private String population;
        private String elevation;
        private String dem;
        private String timeZone;
        private String modificationDate;

    public GeonameLine(String geonameId, String name, String ascciName, String alternateNames, String latitude, String longitude, String featureClass, String featureCode, String countryCode, String cc2, String admin1Code, String adminCode2, String adminCode3, String adminCode4, String population, String elevation, String dem, String timeZone, String modificationDate) {
        this.geonameId = geonameId;
        this.name = name;
        this.ascciName = ascciName;
        this.alternateNames = alternateNames;
        this.latitude = latitude;
        this.longitude = longitude;
        this.featureClass = featureClass;
        this.featureCode = featureCode;
        this.countryCode = countryCode;
        this.cc2 = cc2;
        this.admin1Code = admin1Code;
        this.admin2Code = adminCode2;
        this.admin3Code = adminCode3;
        this.admin4Code = adminCode4;
        this.population = population;
        this.elevation = elevation;
        this.dem = dem;
        this.timeZone = timeZone;
        this.modificationDate = modificationDate;
    }

        public String getGeonameId() {
        return geonameId;
    }

        public void setGeonameId(String geonameId) {
        this.geonameId = geonameId;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getAscciName() {
        return ascciName;
    }

        public void setAscciName(String ascciName) {
        this.ascciName = ascciName;
    }

        public String getAlternateNames() {
        return alternateNames;
    }

        public void setAlternateNames(String alternateNames) {
        this.alternateNames = alternateNames;
    }

        public String getLatitude() {
        return latitude;
    }

        public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

        public String getLongitude() {
        return longitude;
    }

        public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

        public String getFeatureClass() {
        return featureClass;
    }

        public void setFeatureClass(String featureClass) {
        this.featureClass = featureClass;
    }

        public String getFeatureCode() {
        return featureCode;
    }

        public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
    }

        public String getCountryCode() {
        return countryCode;
    }

        public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

        public String getCc2() {
        return cc2;
    }

        public void setCc2(String cc2) {
        this.cc2 = cc2;
    }

        public String getAdmin1Code() {
        return admin1Code;
    }

        public void setAdmin1Code(String admin1Code) {
        this.admin1Code = admin1Code;
    }

        public String getAdmin2Code() {
        return admin2Code;
    }

        public void setAdmin2Code(String admin2Code) {
        this.admin2Code = admin2Code;
    }

        public String getAdmin3Code() {
        return admin3Code;
    }

        public void setAdmin3Code(String admin3Code) {
        this.admin3Code = admin3Code;
    }

        public String getAdmin4Code() {
        return admin4Code;
    }

        public void setAdmin4Code(String admin4Code) {
        this.admin4Code = admin4Code;
    }

        public String getPopulation() {
        return population;
    }

        public void setPopulation(String population) {
        this.population = population;
    }

        public String getElevation() {
        return elevation;
    }

        public void setElevation(String elevation) {
        this.elevation = elevation;
    }

        public String getDem() {
        return dem;
    }

        public void setDem(String dem) {
        this.dem = dem;
    }

        public String getTimeZone() {
        return timeZone;
    }

        public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

        public String getModificationDate() {
        return modificationDate;
    }

        public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

}
