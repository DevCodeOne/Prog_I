package Uebung122;

public class ComplexNumber 
{
	/**
	* real and imaginary part
	*/
	protected double a, b;
	
	/**
	* constructor, default
	*/
	public ComplexNumber() 
	{
		//...
	}
	
	/**
	* constructor
	* @param x real part
	* @param y imaginary part
	*/
	public ComplexNumber(double x, double y) 
	{
		this.a = x;
		this.b = y;
	}
	
	 
	/**
	* constructor
	* @param a another ComplexNumber
	*/
	public ComplexNumber(ComplexNumber a) 
	{
		this.a = a.a;
		this.b = a.b;
	}

	public String toString() 
	{
		return ("Realteil: " + this.a + " Imaginärteil: " + this.b);
	}
	
	/**
	* adds another complex number
	* @param a another ComplexNumber
	*/
	public void add(ComplexNumber a) 
	{
	this.a = this.a + a.a;
	this.b = this.b + a.b;
	
	}
	/**
	* subtracts another complex number
	* @param a another ComplexNumber
	* (a+i*b) - (c+i*d) = (a-c) + i*(b-d)
	*/
	public void sub(ComplexNumber a) 
	{
		this.a = this.a - a.a;
		this.b = this.b - a.b;	
	}
	
	/**
	* multiplies another complex number
	* @param a another ComplexNumber
	* (a+i*b) * (c+i*d) = (a*c - b*d) + i*(a*d + b*c)
	*/
	public void mul(ComplexNumber a) 
	{
		double tmpa = this.a;
		double tmpb = this.b;		
		this.a = (tmpa*a.a) - (tmpb*a.b);
		this.b = (tmpa*a.b) + (tmpb*a.a);
	}
	
	/**
	* divides by another complex number
	* @param a another ComplexNumber
	*   ((a*c) + (b*d)) / (c^2 + d^2)
	* + ((b*c) - (a*d))  / (c^2 + d^2))*i
	*/
	public void div(ComplexNumber a) 
	{
		double tmpa = this.a;
		double tmpb = this.b;	
		this.a = ((tmpa*a.a) + (tmpb*a.b)) / ((a.a*a.a) + (a.b*a.b));
		this.b = ((tmpb*a.a) - (tmpa*a.b)) / ((a.a*a.a) + (a.b*a.b));
	}
	
	/**
	* negates this complex number
	*
	*/
	public void neg() 
	{
		this.a *= -1;
		this.b *= -1;
	}
	
	/**
	* calculates squared absolute value <BR>
	* (sum of squared real part and squared imaginary part)
	* @return squared absolute value
	*/
	public double absSquare() 
	{
		return (Math.pow(a, 2)+Math.pow(b, 2));
	}
	
	 
	/**
	* calculates absolute value <BR>
	* (root of sum of squared real part and
	* squared imaginary part)
	* @return absolute value
	*/
	public double abs() 
	{
		return Math.sqrt(absSquare());
	}
	
	/**
	* access function; get real part
	* @return real part
	*/
	public double getReal() 
	{
		return this.a;
	}
	
	/**
	* access function; get imaginary part
	* @return imaginary part
	*/
	public double getImg() 
	{
		return this.b;
	}
	
	/**
	* access function; set real part
	* @param x new real part
	*/
	public void setReal(double x) 
	{
		this.a = x;
	}
	
	/**
	* access function; set imaginary part
	* @param y new imaginary part
	*/
	public void setImg(double y) 
	{
		this.b = y;
	}
	
	/**
	* calculates conjugate complex and
	* returns a corresponding new object
	* @return new ComplexNumber with conjugate complex
	*/
	public ComplexNumber con() 
	{
		this.b = this.b - (2*this.b);
		return this;
	}
	
	/**
	* copy constructor
	* @return copy of this ComplexNumber
	*/
	public ComplexNumber copy() 
	{
		
		return new ComplexNumber(this);

	}
	
	
}