package sidharthsircorejava;

public class cartoons {
private Integer id;
private String name;
private String channel;
private String fevcharacter;
public cartoons(Integer id, String name, String channel, String fevcharacter) {
	super();
	this.id = id;
	this.name = name;
	this.channel = channel;
	this.fevcharacter = fevcharacter;
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
public String getChannel() {
	return channel;
}
public void setChannel(String channel) {
	this.channel = channel;
}
public String getFevcharacter() {
	return fevcharacter;
}
public void setFevcharacter(String fevcharacter) {
	this.fevcharacter = fevcharacter;
}
@Override
public String toString() {
	return "cartoons [id=" + id + ", name=" + name + ", channel=" + channel + ", fevcharacter=" + fevcharacter + "]";
}

}
