package com.sii.catas.facade.okapi;

import org.springframework.stereotype.Component;

import com.sii.catas.model.OkapiContextParameter;
import com.sii.catas.facade.okapi.RedisCache;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OkapiClient {

  //TODO uses spring caching
  private RedisCache cache;

  public Object getConnection(OkapiContextParameter okapiParameters){
    return null;
  }

}
