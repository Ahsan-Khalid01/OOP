public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       //Account obj1=new Account(12223333, 14000);
      // obj1.display();
      Account []arr=new Account[4];
      arr[0]=new Current(100020023, 12000);
      arr[1]=new Current(100210, 11000)   ;
      arr[2]=new Saving(99887766, 56000, 12.2) ;
      arr[3]=new Saving(44678833, 98000, 18.1);
      for(int i=0;i<arr.length;i++)
      {
        arr[i].display();
      }
    }
}
