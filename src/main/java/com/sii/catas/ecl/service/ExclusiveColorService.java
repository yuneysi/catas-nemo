package com.sii.catas.ecl.service;

import java.util.List;

import com.sii.catas.cdb.service.Cdb2Service;

public class ExclusiveColorService {
  Cdb2Service cdb2Service;

  public List<Object> getExclusives(String market, String carline, String modelYear, String model){
    return cdb2Service.getItemAttributes(market, carline, modelYear, Cdb2Service.ItemDomain.ECL);
  }
}
