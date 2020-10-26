package com.debbech.geonames.batch.dump;

public class GeonameLineMapper {

    public static GeonameLine map(String line, int lineNumber) throws UnexpectedLineFormatException {
        String[] s = line.split("\t");
        if(s.length != 19){
            throw new UnexpectedLineFormatException(lineNumber, line);
        }
        return new GeonameLine(s[0],s[1],s[2],s[3],s[4],s[5],s[6],s[7],s[8],s[9],s[10],s[11],
                s[12],s[13],s[14],s[15],s[16],s[17],s[18]);
    }
}
