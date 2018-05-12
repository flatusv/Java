public class Bottle {
	    
	float r, h, f, ro;			    // the attributes of a bottle
									// the units used are cm
	static final float pi=3.14f;	// a constant of PI
	
	public Bottle() {
		r = 0.0f;
		h = 0.0f; 
		f = 0.0f;
		ro = 0.0f;
	}
	
	public Bottle(float r, float h, float f, float ro) {
		this.r = r;
		this.h = h; 
		this.f = f;
		this.ro = ro;
	}		
	
	public float getFootprint() {
		return pi*r*r;
	} 
	
	public float getVolume() {
		return pi*r*r*h;
	}
	
	public float getArea() {
		return 2*pi*r*r+2*pi*r*h;
	}
	
	public float getLiquidVolume() {
		return pi*r*r*f;
	}
	
	public float getMass() {
		return ro*getVolume();
	}		
	
	public static void main (String[] args) {
		Bottle bl = new Bottle(4.0f, 13.0f, 2.0f, 1.0f);
		float v = bl.getVolume();
		System.out.println("Volume of the bottle equals " + v +" cm\u00B3");
	}	
}