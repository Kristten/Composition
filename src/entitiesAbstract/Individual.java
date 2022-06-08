package entitiesAbstract;

public class Individual extends Pessoa {
	
	private Double healthExpenditures;
	
	public Individual() {
		
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if(getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - (healthExpenditures * 0.25);
						
		}
		else {
			return getAnualIncome() *  0.25 - (healthExpenditures * 0.25);
		}
		
	}
	
	

}
