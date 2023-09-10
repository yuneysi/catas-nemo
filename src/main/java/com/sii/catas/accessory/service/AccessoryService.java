package com.sii.catas.accessory.service;

import java.util.List;

import com.sii.catas.accessory.client.AccessoryClient;
import com.sii.catas.cdb.service.Cdb2Service;

public class AccessoryService {
  Cdb2Service cdb2Service;
  AccessoryClient accessoryClient;
  public List<Object> getAttributes(String market, String carline, String modelyear, String accessory){
    Cdb2Service.ItemDomain itemDomain = Cdb2Service.ItemDomain.AOZ;

    List<Object> attributes = cdb2Service.getItemAttributes(market, carline, modelyear, itemDomain);
    Object programm = accessoryClient.getAozProgramm(market, modelyear, carline);
  return null;
  }
}
