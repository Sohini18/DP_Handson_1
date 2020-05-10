package solidprinciple;

public class ProcessRepair implements ProcessPhoneRepair,ProcessAccesoryRepair {

	@Override
	public void ProcessAccesoryRepair(String accesoryType) {
		// TODO Auto-generated method stub
		System.out.println(accesoryType);
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName);
	}


}
