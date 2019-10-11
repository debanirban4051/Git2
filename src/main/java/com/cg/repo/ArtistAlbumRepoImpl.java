package com.cg.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entity.Album;
import com.cg.entity.Artist;

@Repository
public class ArtistAlbumRepoImpl implements ArtistAlbumRepo {

	@PersistenceContext(name = "MyJPA")
	private EntityManager mgr;
	
	public Artist fetchArtist(int artistId) {
		Artist a1 = (Artist)mgr.find(Artist.class, artistId);
		return a1;
	}

	public Album fetchAlbum(int albumId) {
		Album a1 = (Album)mgr.find(Album.class, albumId);
		return a1;
	}

	public int saveArtist(Artist a) {
		mgr.persist(a);
		return a.getArtistId();
	}

	public int saveAlbum(Album a) {
		mgr.persist(a);
		return a.getAlbumId();
	}
}