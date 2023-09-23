package com.sii.catas.facade.accessory;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccessoryService {

  private AccessoryClient accessoryClient;
  public List<Object> getAccessories(String market, String carline, String modelyear, String accessory){


    return (List<Object>) accessoryClient.getAozProgramm(market, modelyear, carline);
  }
}
