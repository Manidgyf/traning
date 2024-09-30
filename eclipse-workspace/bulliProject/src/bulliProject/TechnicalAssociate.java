package bulliProject;

public class TechnicalAssociate extends Employee {
	
	double tsal;
	
	
	public TechnicalAssociate() {
		super();
	}



	public TechnicalAssociate(int id,double wages,int years,int ncert)
	{
		super(id,wages,years);
		super.ncert = ncert;
		super.title = "TECNICAL ASSOCIATE";
		super.catgeory='P';
	}
	public TechnicalAssociate(int id,double wages,int years,int ncert,int hrs)
	{
		super(id,wages,years);
		super.ncert = ncert;
		super.hrs=hrs; 
		super.title = "TECNICAL ASSOCIATE";
		super.catgeory='T';
	}

	@Override
	public double calSal(Employee e) {
		// TODO Auto-generated method stub
		if(e.catgeory=='P')
		{
			tsal = (5000*e.years) + 1000*e.ncert;
		}
		else
		{
			if(e.hrs<=40)
			{
				tsal = e.wages*hrs;
			}
			else
			{
				tsal = 40*wages + (hrs-40)*wages*2;
			}
		}
		return tsal;
	}



	@Override
	public double mediClaim() {
		// TODO Auto-generated method stub
		if(this.catgeory=='P')
			return 2.0*tsal;
		else
		{
			System.out.println("sorry temporrary employees are not eligibe for mediclaim");
			return 0.0;
		}
	}
	

}
