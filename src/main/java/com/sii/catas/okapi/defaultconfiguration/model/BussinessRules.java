package com.sii.catas.okapi.defaultconfiguration.model;

import java.util.List;

public class BussinessRules {
    record OkapiParameter(String pdk, String brand, String countryCode, String languague, List<String> forbiddenOptions, List<String> preferredOptions ){

    }

}
