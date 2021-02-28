import java.util.*;

class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Mango", "Apple", "Alpha",
                "Cheese", "Beta", "Banana",
                "Dog", "Cat", "Java",
                "Mango", "Milk", "Cream",
                "Dog", "Beta", "Cream",
                "Cat", "Java", "Milk", "Dog"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("gerasimov", "89393196243");
        directory.add("alekseev", "89033078340");
        directory.add("petrov", "89655918321");
        directory.add("petrov", "89047150215");
        directory.add("andreev", "89656023422");
        directory.add("nikolaev", "89673626230");
        directory.add("petrov", "89033070869");
        directory.add("melnikov", "89655912342");
        directory.add("nikolaev", "89175628634");

        System.out.println(directory.get("gerasimov"));
        System.out.println(directory.get("nikolaev"));
        System.out.println(directory.get("petrov"));
        System.out.println(directory.get("andreev"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
