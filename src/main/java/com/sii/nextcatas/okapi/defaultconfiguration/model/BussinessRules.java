package com.sii.nextcatas.okapi.defaultconfiguration.model;

import java.util.List;

public class BussinessRules {
    record OkapiParaeter(String pdk, String languague, List<String> forbiddenOptions, List<String> preferredOptions ){

    }

}
