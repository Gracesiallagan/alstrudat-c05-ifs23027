package del.alstrudat;

public class Data {
  public static LinkedList<DataMahasiswa> dataMahasiswa = new LinkedList<>();
  public static LinkedList<DataTugas> dataTugas = new LinkedList<>();

  public static void init() {

    dataMahasiswa.append(new DataMahasiswa("Andi", "Informatika", 10));
    dataMahasiswa.append(new DataMahasiswa("Budi", "Sistem Informasi", 12));
    dataMahasiswa.append(new DataMahasiswa("Citra", "Teknik Komputer", 8));
    dataMahasiswa.append(new DataMahasiswa("Dika", "Informatika", 15));
    dataMahasiswa.append(new DataMahasiswa("Evi", "Teknik Elektro", 11));

    dataTugas.append(new DataTugas("T001", "UAS Alstrudat", "Praktikum", 3, 5));
    dataTugas.append(new DataTugas("T002", "Makalah Pancasila", "Teori", 2, 3));
    dataTugas.append(new DataTugas("T003", "Project Java", "Praktikum", 5, 4));
    dataTugas.append(new DataTugas("T004", "Tugas UI/UX", "Praktikum", 1, 2));
    dataTugas.append(new DataTugas("T005", "Rangkuman Jarkom", "Teori", 2, 3));
    dataTugas.append(new DataTugas("T006", "Soal Coding", "Praktikum", 4, 4));
  }
}
