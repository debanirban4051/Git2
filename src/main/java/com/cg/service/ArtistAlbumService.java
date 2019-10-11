package com.cg.service;

import com.cg.entity.Album;
import com.cg.entity.Artist;

public interface ArtistAlbumService {

	int addArtist(Artist artist);
	Artist fetchArtist(int artist_id);
	
	int addAlbum(Album album);
	Album fetchAlbum(int album_id);
}
