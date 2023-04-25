package com.sping.IPL.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sping.IPL.repository.IPLrepository;

@Service
public class IPLservice {
  @Autowired
  private IPLrepository repository;
  
  public List<IPL> getIPL(){
	  return repository.findAll();
  }
  public Optional<IPL> getIPLId(int id) {
	  return repository.findById(id);
	  
  }
  public IPL addIPL(IPL Ipl) {
	  return repository.save(Ipl);
  }
  public IPL editIPL(int id, com.sping.IPL.model.IPL Ipl) {
	  com.sping.IPL.model.IPL Iplx = repository.findById(id).orElse(null);
	  if (Iplx !=null)
	  {
		  Iplx.setName(Ipl.getName());
		  Iplx.setPoints(Ipl.getPoints());
		  Iplx.setWinnings(Ipl.getWinnings());
		  Iplx.setLoses(Ipl.getLoses());
		  Iplx.setStrikerate(Ipl.getStrikerate());
		  Iplx.setNetrunrate(Ipl.getNetrunrate());
		  Iplx.setPosition(Ipl.getPosition());
		  return repository.saveAllAndFlush(Iplx);
	  }
	  else {
		  return null;
	  }
  }
  public String  deleteIpl()  {
	  repository.deleteById(id);
	  return id + " ELIMINATED ";
	  
  }
}
