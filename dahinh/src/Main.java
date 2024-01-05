public class Main {
    public static void main(String[] args) {
        Cha[] con = new Cha[3];
        con[0] = new Cha();
        con[1] = new ConGai();
        con[2] = new ConTrai();
        for (int i = 0; i < con.length; i++) {
            con[i].nauCom();
            Cha c = new ConGai();
            ConGai c1 = (ConGai) c;
            c1.trangDiem();
        }

    }}