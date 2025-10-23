public class ArrayPelajaran {
    public static void main(String[] args) {
        String mapel [] = {"Matematika", "PJOK", "Produktif", "Sejarah", "Bahasa Indonesia", "Seni Budaya"};

        System.out.println("List Mata Pelajaran: ");
        for (int i = 0; i < mapel.length; i++){
            System.out.println(i + 1 + ". " + mapel[i] );
        }
    }
}
