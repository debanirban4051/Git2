package com.cg.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
@SequenceGenerator(name = "artist_seq", sequenceName = "artseq")
public class Artist {
	@Id
	@Column(name = "artist_id")
	@GeneratedValue(generator = "artist_seq")
	private int artistId;
	@Column(name = "name", length = 20)
	private String name;
	@Column(name = "genre", length = 20)
	private String genre;

	@OneToMany(mappedBy = "artist", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	Set<Album> albums = new HashSet<Album>();

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Set<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}

}
