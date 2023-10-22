public class Main {
    public static void main(String[] args) {
        MyListClass<Integer> liste = new MyListClass<>();
        /*System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        System.out.println("*************************************");
*/
        liste.add(10); liste.add(20); liste.add(30); liste.add(40);
        System.out.println(liste.toString());

        System.out.println("2. indisteki değer : " + liste.get(2));
        liste.remove(0);
        liste.remove(1);
        System.out.println(liste.toString());

        liste.add(40);
        //liste.set(0, 100);
        System.out.println("2. indisteki değer : " + liste.get(2));
        System.out.println(liste.toString());


    }
}