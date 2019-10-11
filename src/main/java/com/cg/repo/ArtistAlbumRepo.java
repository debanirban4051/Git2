package com.cg.repo;

import com.cg.entity.Album;
import com.cg.entity.Artist;

public interface ArtistAlbumRepo {
	
	int saveArtist(Artist a);

	int saveAlbum(Album a);
	
	Artist fetchArtist(int artistId);

	Album fetchAlbum(int albumId);

}
