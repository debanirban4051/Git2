package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.entity.Album;
import com.cg.entity.Artist;
import com.cg.repo.ArtistAlbumRepo;

@Service
@Transactional
public class ArtistAlbumServiceImpl implements ArtistAlbumService {

	@Autowired
	private ArtistAlbumRepo repo;
	
	public int addArtist(Artist artist) {
		return repo.saveArtist(artist);
	}

	public Artist fetchArtist(int artistId) {
		return repo.fetchArtist(artistId);
	}

	public int addAlbum(Album album) {
		return repo.saveAlbum(album);
	}

	public Album fetchAlbum(int albumId) {
		return repo.fetchAlbum(albumId);
	}

}
