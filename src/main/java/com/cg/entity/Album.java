package com.cg.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "album")
@SequenceGenerator(name = "album_seq", sequenceName = "albseq")
public class Album {

	@Id
	@Column(name = "album_id")
	@GeneratedValue(generator = "album_seq")
	private int albumId;
	@Column(name = "title", length = 30)
	private String title;
	@Column(name = "price")
	private int price;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "artist_id")
	private Artist artist;

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
