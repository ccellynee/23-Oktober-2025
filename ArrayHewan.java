public class ArrayHewan {
    public static void main(String[] args) {
        String nama [] = {"Anjing", "Kucing", "Babi", "Ayam", "Burung"};

        for (int i = 0; i < nama.length; i++){
            if (nama[i].length() <= 4){
                System.out.println(nama[i]);
            }
        }
    }
}
