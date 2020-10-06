package com.escalade.dao;

import java.util.List;

import com.escalade.model.Topo;

public interface TopoDao {

	List<Topo> rechercheTousParSite(int siteId);

	Topo save(Topo topo);

	Topo rechercheParId(int topoId);

}
