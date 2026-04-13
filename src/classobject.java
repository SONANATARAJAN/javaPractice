public class classobject {
    private int id;
    private int age;
    private String name;
    public classobject(int id,int age,String name){
        this.id=id;
        this.age=age;
        this.name=name;
    }
    public void display(int age,String name){
        System.out.println("Hello "+name+ "  , is this your age " + age);
    }

    public static void main(String[] args){
        classobject co = new classobject(1,23,"Sona");
        co.display(23,"Sona");
    }
}
