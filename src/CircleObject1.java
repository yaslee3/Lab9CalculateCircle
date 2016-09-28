import java.text.DecimalFormat;

public class CircleObject1 {

	private static int circlecount;
	private double radius;

	public CircleObject1(double radius) {//constructor
		this.radius = radius;
				CircleObject1.circlecount++;
	}
// get Circumference
	public double getCircumference() {
	
		return (2* Math.PI * radius) ;
		
		
	}
	//Get Formatted Circumference
public String getFormattedCircumference () {
	return formatNumber (getCircumference());
}
	
private String formatNumber(double x) {
	
	return new DecimalFormat ("##.##").format (x);
}
// Get Area
public double getArea () {
	return (Math.PI * radius * radius);
}

	//Get Formatted Area
	public String getFormattedArea() {
		
		return formatNumber(getArea());
	}

	// Get Object Count 
	public static int getObjectCount() {
		
		return CircleObject1.circlecount;
	}

	}


