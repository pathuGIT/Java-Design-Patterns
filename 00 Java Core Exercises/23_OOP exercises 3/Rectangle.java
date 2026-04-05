class Rectangle{
	protected float width;
	protected float heigh;
	protected float area;
	protected float per;
	
	public void set(float x, float y){
		width = x;
		heigh = y;
	}
	
	public float Area(){
		area = width*heigh;
		return area;
	}
	
	public float Perameter(){
		per = (width*2)+(heigh*2);
		return per;
	}
	
}