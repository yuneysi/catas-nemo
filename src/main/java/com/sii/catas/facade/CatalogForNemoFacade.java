package com.sii.catas.facade;
import org.springframework.stereotype.Service;

import com.sii.catas.facade.accessory.AccessoryService;
import com.sii.catas.facade.category.CategoryService;
import com.sii.catas.facade.cdb.Cdb2Service;
import com.sii.catas.facade.okapi.DefaultConfiguration;
import com.sii.catas.facade.okapi.StaticRepertoireService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CatalogForNemoFacade {

  private Cdb2Service cdb2Service;

  private DefaultConfiguration defaultConfiguration;

  private StaticRepertoireService repertoireService;

  private CategoryService categoryService;

  private AccessoryService accessoryService;


  public Object getGroups(){
    return null;
  }

  public Object getFamilies(){
    return null;
  }

  public Object getEcls(){
    return null;
  }

  public Object getAllAttributes(){
    return null;
  }
}
