import java.util.*;
import java.io.OutputStreamWriter;
import java.lang.Math.*;

class Interest
{
	static
	{
		Scanner sca=new Scanner(System.in);
		try
		{
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		streamWriter.write("Hello");
		streamWriter.write("Principal Amount: ");
		int p=sca.nextInt();
		streamWriter.write("Interest Rate: ");
		double r=sca.nextInt();
		streamWriter.write("Time Period(in years): ");
		double t=sca.nextInt();
		Main obj=new Main();
		streamWriter.write("Simple interest: "+obj.si(p, r, t));
		streamWriter.write("Compound interest: "+obj.ci(p, r, t));
		streamWriter.flush();
		}
		catch(Exception e)
		{
		e.getMessage();
		}
	}
	double si(int p,double r,double t )
	{
		double s=(p*r*t)/100;
		return s;
	}
	double ci(int p,double r, double t )
	{
		double c=p*Math.pow(1.0+r/100.0,t)-p;
		return c;
	}
}