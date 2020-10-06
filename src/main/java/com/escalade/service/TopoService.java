package com.escalade.service;

import java.util.List;

import com.escalade.dao.TopoDao;
import com.escalade.dao.UtilisateurDao;
import com.escalade.model.Disponibilites;
import com.escalade.model.Topo;

public class TopoService {

	private TopoDao topoDao;
	private UtilisateurDao utilisateurDao;

	// Consulter la liste des topo disponible
	public List<Topo> consultation(int siteId) {
		return topoDao.rechercheTousParSite(siteId);
	}

	// Enregistrer les topos
	public Topo enregistrer(Topo topo) {
		return topoDao.save(topo);
	}

	// reserver et preter un topo
	public boolean reserver(int topoId, int emprunteurId) {
		Topo topo = topoDao.rechercheParId(topoId);
		if (topo.getDisponibilite() == Disponibilites.DISPONIBLE) {
			topo.setDisponibilite(Disponibilites.EN_ATTENTE);
			topo.setUtilisateurEmprunteur(utilisateurDao.rechercheParId(emprunteurId));
			topoDao.save(topo);
			return true;
		} else
			return false;
	}

	public boolean preter(int topoId, int proprietaireId) {
		Topo topo = topoDao.rechercheParId(topoId);
		if (topo.getUtilisateurProprietaire().getId() != proprietaireId) {
			return false;
		}
		if (topo.getDisponibilite() != Disponibilites.EN_ATTENTE) {
			return false;
		}
		topo.setDisponibilite(Disponibilites.EMPRUNTE);
		topoDao.save(topo);
		return true;
	}
}
