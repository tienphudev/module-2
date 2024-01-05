public class TongGiamDoc {
    private String name;
    private String id;
    private static TongGiamDoc instance;

    public TongGiamDoc() {
    }

    public TongGiamDoc(String name, String id) {
        this.name=name;
        this.id=id;
    }

    public static TongGiamDoc getInstance(String name, String id){
        if(instance==null){
            instance=new TongGiamDoc(name, id);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "TongGiamDoc{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
