package OopsAssiignment;
//Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three fields.
//This class also has a method “volume()” to calculate the volume of this room.
//Create another class “RoomDemo” which will use the earlier class, create instances of rooms, and display the volume of room
class Room{
	int height;
	int width;
	int breadth;
	public Room(int h,int w,int b) {
		height =h;
		width =w;
		breadth =b;
		
	}
	void volume() {
		int v= height*width*breadth;
		System.out.println("Volume of given Room: "+ v);
	}
}

public class RoomDemo {

	public static void main(String[] args) {
	Room r = new Room(2,3,4);
	r.volume();

	}

}
