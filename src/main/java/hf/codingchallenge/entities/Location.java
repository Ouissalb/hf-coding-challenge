package hf.codingchallenge.entities;
import java.lang.reflect.Array;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Location {

		private String type;
		private Array coordinates;

		public Location(String type, Array coordinates) {
			super();
			this.type = type;
			this.coordinates = coordinates;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Array getCoordinates() {
			return coordinates;
		}
		public void setCoordinates(Array coordinates) {
			this.coordinates = coordinates;
		}
		
		

}
