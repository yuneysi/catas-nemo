package com.sii.catas.cdb.service;

import java.util.List;

public class Cdb2Service {

  public List<Object> getAll(String market, String carline, String modelYear){
    return null;
  }

  public List<Object> getAttributes(String market, String carline, String modelYear, String modelCode){
    return null;
  }

  public List<Object> getItemAttributes(String market, String carline, String modelYear, ItemDomain itemDomain ){
    return null;
  }

  public List<Object> getTechnicalAttributes(){
    return null;
  }

  public List<Object> getModelName(){
    return null;
  }

  public List<Object> getItemName(){
    return null;
  }

  public static enum ItemDomain{
    ECL,
    MBV,
    AOZ,
    EXT
  }
}
