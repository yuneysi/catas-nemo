package com.sii.catas.facade.okapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sii.catas.model.BussinessRules;
import com.sii.catas.model.OkapiContextParameter;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultConfiguration {

    private OkapiClient client;

    public Object getDefaultConfiguratio(OkapiContextParameter okapiContextParameter, BussinessRules bussinessRules){
        client.getConnection(okapiContextParameter);
        return null;
    }
}
