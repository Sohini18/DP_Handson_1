package solidprinciple;

public class PhoneOrder implements ProcessOrder {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(modelName);
		
	}

}
