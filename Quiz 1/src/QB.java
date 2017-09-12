
public class QB {
	int TD;
	double Yards;
	int INT;
	int comp;
	int ATT;
	
	public QB(int TD, double Yards, int INT, int comp, int ATT){
		this.TD = TD;
		this.Yards = Yards;
		this.INT = INT;
		this.comp = comp;
		this.ATT = ATT;
	}
	
	public double qbRating(){
		double rating;
		double a;
		double b;
		double c;
		double d;
		a = (this.comp/this.ATT) * 5;
		b = (this.Yards/this.ATT - 3) * 0.25;
		c = (this.TD/this.ATT) * 20;
		d = 2.375 - (this.INT/this.ATT * 25);
		a = (a < 0) ? 0:a;
		a = (a > 2.375) ? 2.375:a;
		b = (b < 0) ? 0:b;
		b = (b > 2.375) ? 2.375:b;
		c = (c < 0) ? 0:c;
		c = (c > 2.375) ? 2.375:c;
		d = (d < 0) ? 0:d;
		d = (d > 2.375) ? 2.375:d;
		rating  = (a + b + c + d)/6 * 100;
		return rating;
	}
}
