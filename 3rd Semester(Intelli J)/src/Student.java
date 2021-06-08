public class Student {

    private StudentNode start;

    private static class StudentNode{
        private String name;
        private String rollno;
        private StudentNode next;

        public StudentNode(String name, String rollno) {
            this.name = name;
            this.rollno = rollno;
        }

        public StudentNode(String name, String rollno, StudentNode next) {
            this.name = name;
            this.rollno = rollno;
            this.next = next;
        }
    }

    // Insert Element
    public StudentNode insert(String name, String rollno){
        StudentNode p = start;
        if(start == null || start.rollno.compareTo(rollno) > 0){
            start = new StudentNode(name,rollno, start);
            return start;
        }
        while(p.next != null){
            if(p.next.rollno.compareTo(rollno) > 0) break;
            p=p.next;
        }
        p.next = new StudentNode(name,rollno, p.next);
        return start;
    }

    // Deleting Element
    public StudentNode delete(String name, String rollno){
        if(start == null || start.rollno.compareTo(rollno) > 0){
            //x is not in the list
            return start;
        }
        if(start.rollno.equals(rollno)){
            //x is the first element in the list
            start = start.next;
            return start;
        }
        for(StudentNode p = start; p.next!=null; p = p.next){
            if(p.next.rollno.compareTo(rollno) > 0) break;
            if(p.next.rollno.equals(rollno)){
                p.next=p.next.next;
                break;
            }
        }
        return start;
    }

    // Printing Whole List
    public  void printList(){
        for(StudentNode p = start; p !=null; p = p.next){
            System.out.println("{Name: "+p.name+", Roll No: "+p.rollno+"}");
        }
    }

    public static void main(String[] args) {
        Student students = new Student();
        students.insert("Munsif","19SW55");
        students.insert("You","19SW56");
        students.printList();
        students.delete("You","19SW56");
        System.out.println("----------After Deletion----------");
        students.printList();
    }
}
