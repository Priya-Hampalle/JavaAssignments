package OopsAssiignment;
//Write a class “Box” that with three member-variables “height”, “width” and “breadth”.
//Write suitable constructors to initialize them. Add functions like “getVolume” and “getArea” 
//that will return volume and surface area respectively. 
//Instantiate two arbitrary boxes and then print their volume and surface area
public class Box {
	int height, width, breadth;

    public Box(int x, int y, int z) {
        height = x;
        width = y;
        breadth = z;
    }
    public void display() {

        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Breadth" + breadth);
    }

    public int getArea()
    {
        int a=  width * breadth;
        return a;
        
    }

    public int getVolume()
    {
       int v= height * width * breadth;
       return v;
    }

	public static void main(String[] args) {
		
			Box b1 = new Box(6, 7, 4);
	        Box b2 = new Box(6, 5, 6);

	        System.out.println("Area of Box 1 :"+ b1.getArea());
	        System.out.println("Area of Box 2 :"+ b2.getArea());
	        System.out.println("Volume of Box 1 : " + b1.getVolume());
	        System.out.println("Volume of Box 2 : " + b2.getVolume());

	}

}
