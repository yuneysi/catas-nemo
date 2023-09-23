package com.sii.catas.facade.okapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sii.catas.model.OkapiContextParameter;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StaticRepertoireService {

    OkapiClient okapiClient;
    Object connection;
    public Object getAll(OkapiContextParameter okapiContextParameter){
        return null;
    }

    public Object getOptions(OkapiContextParameter okapiContextParameter){
        return null;
    }

    public Object getStandards(OkapiContextParameter okapiContextParameter){
        return null;
    }

    public Object getColors(OkapiContextParameter okapiContextParameter){
        return null;
    }
    public Object getStealths(OkapiContextParameter okapiContextParameter){
        return null;
    }

    public Object getIncentives(OkapiContextParameter okapiContextParameter){
        return null;
    }

    public Object getInteriorCombination(OkapiContextParameter okapiContextParameter){
        return null;
    }
}
