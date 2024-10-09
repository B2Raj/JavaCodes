public class studentClass {
    public static class student{
        String name;
        int roll;
        double percentage;
    }
    public static class car{
        String name;
        String dom;    // date of manufacture
        int amount;
    }
    public static void main(String[] args){
        student s1=new student();   // obj1 of student
        s1.name="Bittu";
        s1.roll=32;
        s1.percentage=93.2;
        System.out.println("----->Student one");
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percentage);
        student s2=new student();   // obj2 of student
        s2.name="Vicky";
        s2.roll=31;
        s2.percentage=95.9;
        System.out.println("----->Student 2");
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.percentage);
        car a1=new car();   // obj1 of car
        a1.name="Audi";
        a1.dom="12-3-33";
        a1.amount=322112;
        System.out.println("----->car 1");
        System.out.println("Name:"+a1.name);
        System.out.println("DateOfManufacture:"+a1.dom);
        System.out.println("Price:"+a1.amount);
        car a2=new car();   // obj2 of car
        a2.name="Mercedes Benz";
        a2.dom="31-2-2001";
        a2.amount=3233223;
        System.out.println("------> car 2");
        System.out.println("Name:"+a2.name);
        System.out.println("DateOfManufacture:"+a2.dom);
        System.out.println("Price:"+a2.amount);
    }
}
