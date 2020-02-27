public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("America");
        list.add("Canada");
        list.add("Germany");
        list.add("Russia");
        list.add("France");
        list.add("Germany");
        list.add("Norway");
        //list.remove(2);
        System.out.println(list);

        //list.clear();
        System.out.println(list.contains("Germany"));
        System.out.println(list.get(3));
        System.out.println(list.indexOf("Germany"));
        System.out.println(list.lastIndexOf("Germany"));
    }
}
