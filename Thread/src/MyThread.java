public class MyThread extends Thread{
    public String name;
    public MyThread(String name){
        this.name=name;
    }
    public void run (){
        for (int i=0;i<10;i++){
            System.out.println(name +""+i);
        }
    }

    public static void main(String[] args) {
        MyThread t1= new MyThread("Phong");
        MyThread t2= new MyThread("Thang");
        t2.start();
        t1.start();
    }

}
