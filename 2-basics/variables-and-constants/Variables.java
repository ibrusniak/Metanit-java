
class Variables {

    public static void main(String[] args) {
        
        Integer i = 100;
        Double d = 200d;
        Float f;

        f = 20f;
        f = 40f;
        
        System.out.println(i.getClass().getName());
        System.out.println(d.getClass().getName());
        System.out.println(f.getClass().getName());

        var v = 200; // Since java 10

        // Error: int cannot be dereferenced
        // System.out.println(v.getClass.getName());

        // Error: 'var' is not allowed in a compound declaration
        // var q = 2, z = 3;
    }
}
