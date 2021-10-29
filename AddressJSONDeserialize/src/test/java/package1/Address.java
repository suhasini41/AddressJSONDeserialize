package package1;

public class Address 
{
	private String BuildingNo;
	private String AppartmentName;
	private String Street;
	private String Zipcode;
	private String State;
	private String Country;
	public String getBuildingNo() {
		return BuildingNo;
	}
	public void setBuildingNo(String buildingNo) {
		BuildingNo = buildingNo;
	}
	public String getAppartmentName() {
		return AppartmentName;
	}
	public void setAppartmentName(String appartmentName) {
		AppartmentName = appartmentName;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [BuildingNo=" + BuildingNo + ", AppartmentName=" + AppartmentName + ", Street=" + Street
				+ ", Zipcode=" + Zipcode + ", State=" + State + ", Country=" + Country + "]";
	}
	public Address(String buildingNo, String appartmentName, String street, String zipcode, String state,
			String country) {
		super();
		BuildingNo = buildingNo;
		AppartmentName = appartmentName;
		Street = street;
		Zipcode = zipcode;
		State = state;
		Country = country;
	}

}
