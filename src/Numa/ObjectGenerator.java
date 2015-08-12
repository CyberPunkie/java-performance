package Numa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectGenerator implements Serializable{
	private static final long serialVersionUID = -8825850597962623656L;
	private final List<SerializableObject> events;

	public ObjectGenerator(int size) {
		events = new ArrayList<SerializableObject>();
		generateObject(size);
	}

	private void generateObject(int size){
		for (int i = 0 ; i < size ; i++){
			events.add(new SerializableObject());

		}
	}

	public List<SerializableObject> getObject() {
		return events;
	}
}
