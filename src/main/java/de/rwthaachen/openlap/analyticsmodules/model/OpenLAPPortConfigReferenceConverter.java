package de.rwthaachen.openlap.analyticsmodules.model;

import DataSet.OLAPPortConfiguration;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import java.io.IOException;

/**
 * An object Mapper for the DataAccessLayer to convert an AnalyticsMethodReference to a String during persistence
 * operations
 */
public class OpenLAPPortConfigReferenceConverter implements AttributeConverter<OLAPPortConfiguration, String> {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(OLAPPortConfiguration attribute) {
        try {
            return mapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return attribute.toString();
        }
    }

    @Override
    public OLAPPortConfiguration convertToEntityAttribute(String dbData) {
        try {
            return mapper.readValue(dbData, OLAPPortConfiguration.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
