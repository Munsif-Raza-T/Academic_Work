public class HotelRooms {
    // Trees for rooms
    private BSTree allocatedRooms;
    private BSTree freeRooms;
    // initialize tree and give 50 room for hotel
    public HotelRooms(){
        freeRooms = new BSTree();
        allocatedRooms = new BSTree();
        for(int i=1,j=50; i<26 && j>25; i++,j--){
            freeRooms.insert(i);
            freeRooms.insert(j);
        }
    }

    // to allocate a room
    public void allocateRoom(int roomno){
        if(freeRooms.search(roomno)){
            allocatedRooms.insert(roomno);
            freeRooms.delete(roomno);
        }

    }

    // To get back a room
    public void getBackRoom(int roomno){
        if(allocatedRooms.search(roomno)){
            allocatedRooms.delete(roomno);
            freeRooms.insert(roomno);
        }

    }

    // give the list of allocated rooms
    public void showAllocatedRooms(){
        System.out.print("[ ");
        allocatedRooms.inorder();
        System.out.println("]");
    }

    // give the list of free rooms
    public void showFreeRooms(){
        System.out.print("[ ");
        freeRooms.inorder();
        System.out.println("]");
    }

    public static void main(String[] args) {
        HotelRooms hotel = new HotelRooms();
        System.out.print("List of free Rooms: ");
        hotel.showFreeRooms();
        hotel.allocateRoom(1);
        hotel.allocateRoom(50);
        hotel.allocateRoom(45);
        hotel.allocateRoom(33);
        hotel.allocateRoom(42);
        hotel.allocateRoom(13);
        System.out.print("List of allocated Rooms: ");
        hotel.showAllocatedRooms();
        System.out.print("List of free Rooms: ");
        hotel.showFreeRooms();


    }
}
