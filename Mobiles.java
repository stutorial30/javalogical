package sidharthsircorejava;

public class Mobiles implements Comparable<Mobiles>
{
	private Integer id;
	private String name;
	private String brand;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Mobiles(Integer id, String name, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobiles [id=" + id + ", name=" + name + ", brand=" + brand + "]";
	}
	@Override
	public int compareTo(Mobiles o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}
	
	
}