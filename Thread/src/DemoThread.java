public class DemoThread extends Thread {
    public String name;
    public  DemoThread(String name){
        this.name=name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name+""+ i);
        }
    }

    public static void main(String[] args) {
        DemoThread Phu= new DemoThread("Phu");
        DemoThread Minh= new DemoThread("Minh");
        Thread t1= new Thread(Phu);
        Thread t2= new Thread(Minh);
        t2.start();
        t1.start();
    }
}
