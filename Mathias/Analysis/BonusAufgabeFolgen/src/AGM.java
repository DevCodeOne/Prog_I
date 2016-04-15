
public class AGM {
	double a0 = 0.0;
	double b0 = 1.0;
	double aplus,bplus,an,bn;	
	
	public AGM(){}
	
	public AGM(double a0, double b0){
		this.a0 = a0;
		this.b0 = b0;
	}
	
	public AGM Schreibtischtest(){
		an = a0;
		bn = b0;
		
		for(int i=0;i<=5;i++){
			aplus = (an+bn)/2;
			bplus = Math.sqrt(an*bn);
			this.print();
			an=aplus;
			bn=bplus;
		}	
		return this;
	}
	
	public void print(){
		
		System.out.println("Variable a : " + an + " Variable b : " + bn);
	}
	
	
}
