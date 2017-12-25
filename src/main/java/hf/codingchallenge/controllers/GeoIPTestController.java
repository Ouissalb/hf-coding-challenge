package hf.codingchallenge.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hf.codingchallenge.entities.GeoIP;
import hf.codingchallenge.service.RawDBDemoGeoIPLocationService;

@RestController
public class GeoIPTestController {

	private RawDBDemoGeoIPLocationService locationService;

	public GeoIPTestController() throws IOException {
		locationService = new RawDBDemoGeoIPLocationService();
	}

	@PostMapping("/GeoIPTest")
	public GeoIP getLocation(
			@RequestParam(value="ipAddress", required=true) String ipAddress
			) throws Exception {

		RawDBDemoGeoIPLocationService locationService 
		= new RawDBDemoGeoIPLocationService();
		return locationService.getLocation(ipAddress);
	}

}
