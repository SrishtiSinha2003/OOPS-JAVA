class Derived extends Base{
    Derived(){
        super(10);
        System.out.println("Derived Constructor");
    }
    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println(d);
    }
}
