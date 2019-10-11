package com.cg.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.entity.Album;
import com.cg.entity.Artist;
import com.cg.service.ArtistAlbumService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class Testing {

	@Autowired
	private ArtistAlbumService service;

	@Test
	public void testAddArtist() {
		Artist a1 = new Artist();
		a1.setName("Linkin Park");
		a1.setGenre("Rock");
		service.addArtist(a1);
	}
	
	@Test
	public void testAddAlbum() {
		Album alb1 = new Album();
		alb1.setPrice(99);
		alb1.setTitle("HybridTheory");
		Artist a = service.fetchArtist(1);
		alb1.setArtist(a);
		service.addAlbum(alb1);
	}

	@Test
	public void testFetchArtist() {
		Artist art1 = service.fetchArtist(1);
		assertNotNull(art1);
	}

	@Test
	public void testFetchAlbum() {
		Album alb1 = service.fetchAlbum(1);
		assertNotNull(alb1);
	}
}