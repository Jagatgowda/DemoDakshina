/*There are vehicles. Vehicle has a name and an engine capacity [like 100bhp, 200bhp
etc => take as int] and provide parameterised constructor. Create a Tester class, create
2 Vehicle objects with same state and invoke v1.equals(v2) and verify what you get as
result? Why are you getting that result?
A vehicle is equal to another if both the name and capacity are the same. Override
equals() method in Vehicle to implement this functionality. Put SOP in equals() with
something like SOP(“Vehicle->equals()->testing…”) and concat the states of the two objects into sop. In a tester class, create two vehicle objects, invoke equals on it and find
out whether object equality check is working correctly. Create an ArrayList object, add
first vehicle ref and check if the contains(second ref) returns true or not => it should return true as equality check would be used to search.*/
package com.collection.c2;

import java.util.Objects;

public class Vehicle implements Comparable {
	private String name;
	private String EngineCapacity;

	public Vehicle() {
		super();
	}

	public Vehicle(String name, String engineCapacity) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Provide proper name");
		}
		if (engineCapacity == null || engineCapacity.trim().equals("") || engineCapacity.trim().equals("0bhp")) {
			throw new IllegalArgumentException("Provide proper engineCapacity");
		} else {
			this.EngineCapacity = engineCapacity;
			this.name = name;
		}
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		if (name == null || name.trim().equals("")) {
			throw new IllegalArgumentException("Provide proper name");
		} else {
			this.name = name;
		}
	}

	public String getEngineCapacity() {
		return EngineCapacity;
	}

	public void setEngineCapacity(String engineCapacity) {
		if (engineCapacity == null || engineCapacity.trim().equals("") || engineCapacity.trim().equals("0bhp")) {
			throw new IllegalArgumentException("Provide proper engineCapacity");
		} else {
			EngineCapacity = engineCapacity;
		}
	}

	public int hashCode() {
		System.out.println("Vehicle->hashCode()-testing...");
		return Objects.hash(EngineCapacity, name);
	}

	public boolean equals(Object obj) {
		System.out.println("Vehicle->equals()-testing...");
		if (obj instanceof Vehicle) {
			Vehicle other = (Vehicle) obj;
			if ((other.name == null || other.name.trim().equals("")) && (other.EngineCapacity == null
					|| other.EngineCapacity.trim().equals("") || other.EngineCapacity.trim().equals("0bhp")))

			{
				return false;
			} else {
				return true;
			}
		} else
			return false;
	}

	public String toString() {
		return "Vehicle name=" + name + ", EngineCapacity=" + EngineCapacity;
	}

	public int compareTo(Object o) {
		if (o instanceof Vehicle) {
			Vehicle V = (Vehicle) o;
			return this.EngineCapacity.compareTo(V.EngineCapacity);
		} else {
			throw new IllegalArgumentException();
		}
	}

}
