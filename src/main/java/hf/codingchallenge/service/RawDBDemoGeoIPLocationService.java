package hf.codingchallenge.service;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;

import hf.codingchallenge.entities.GeoIP;

public class RawDBDemoGeoIPLocationService {

	private static DatabaseReader dbReader;

	public RawDBDemoGeoIPLocationService() throws IOException{
		File database = new File("your-mmdb-location");
		dbReader = new DatabaseReader.Builder(database).build();
	}

	public static GeoIP getLocation(String ip) 
			throws IOException, GeoIp2Exception {
		InetAddress ipAddress = InetAddress.getByName(ip);
		CityResponse response = dbReader.city(ipAddress);

		String cityName = response.getCity().getName();
		String latitude = 
				response.getLocation().getLatitude().toString();
		String longitude = 
				response.getLocation().getLongitude().toString();
		return new GeoIP(ip, cityName, latitude, longitude);
	}

}
