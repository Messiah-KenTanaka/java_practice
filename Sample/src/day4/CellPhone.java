package day4;

public class CellPhone implements IPhone, Email{

	private String mailAddress;
	
	private String number;
	
	public CellPhone(String mailAddress, String number) {
		this.mailAddress = mailAddress;
		this.number = number;
	}

	@Override
	public void senMail(String address) {
		System.out.println(address + "に、" + this.mailAddress + "からメールを出します");
	}

	@Override
	public void call(String number) {
		System.out.println(number + "に、" + this.number + "から電話をかけます");
	}
	
}
