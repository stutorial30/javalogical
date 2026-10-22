package sidharthsircorejava;

public class Festivals implements Comparable<Festivals> {
private Integer id;
private String name;
private String splDish;
public Festivals() {
	super();
	// TODO Auto-generated constructor stub
}
public Festivals(Integer id, String name, String splDish) {
	super();
	this.id = id;
	this.name = name;
	this.splDish = splDish;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSplDish() {
	return splDish;
}
public void setSplDish(String splDish) {
	this.splDish = splDish;
}
@Override
public String toString() {
	return "Festivals [id=" + id + ", name=" + name + ", splDish=" + splDish + "]";
}
@Override
public int compareTo(Festivals o) {
	return this.id.compareTo(o.id);
}

}
