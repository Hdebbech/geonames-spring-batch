package com.debbech.geonames.batch.dump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeonameLineMapperTest {


    @Test
    void shouldFailWhenLineIsMalFormed() {

        assertThrows(UnexpectedLineFormatException.class, () -> {
            String line = "\t";
            GeonameLineMapper.map(line, 1);
        });
    }

    @Test
    void shouldMapLine() throws UnexpectedLineFormatException {
        String line = "2467403\tSahel de Sfax\tSahel de Sfax\tSahel,Sahel de Sfax,Sahel of Sfax,Sahil Safaqis,Sāḩil Şafāqis\t34.75\t10.75\tL\tRGN\tTN\t\t32\t\t\t\t0\t\t12\tAfrica/Tunis\t2015-09-06";
        GeonameLine geonameLine = GeonameLineMapper.map(line, 1);
        assertEquals("2467403", geonameLine.getGeonameId());
        assertEquals("Sahel de Sfax", geonameLine.getName());
        assertEquals("Sahel de Sfax", geonameLine.getAscciName());
        assertEquals("Sahel,Sahel de Sfax,Sahel of Sfax,Sahil Safaqis,Sāḩil Şafāqis", geonameLine.getAlternateNames());
        assertEquals("34.75", geonameLine.getLatitude());
        assertEquals("10.75", geonameLine.getLongitude());
        assertEquals("L", geonameLine.getFeatureClass());
        assertEquals("RGN", geonameLine.getFeatureCode());
        assertEquals("TN", geonameLine.getCountryCode());
        assertTrue(geonameLine.getCc2().isEmpty());
        assertEquals("32", geonameLine.getAdmin1Code());
        assertTrue(geonameLine.getAdmin2Code().isEmpty());
        assertTrue(geonameLine.getAdmin3Code().isEmpty());
        assertTrue(geonameLine.getAdmin4Code().isEmpty());
        assertEquals("0", geonameLine.getPopulation());
        assertTrue(geonameLine.getElevation().isEmpty());
        assertEquals("12", geonameLine.getDem());
        assertEquals("Africa/Tunis", geonameLine.getTimeZone());
        assertEquals("2015-09-06", geonameLine.getModificationDate());

    }

    @Test
    public void shouldFailWhenUnexpectedLineFormat(){
        String line = "2134013\tCirconscription de Tanna";
        UnexpectedLineFormatException ex = assertThrows(UnexpectedLineFormatException.class,
                () -> GeonameLineMapper.map(line, 1));
    }



}