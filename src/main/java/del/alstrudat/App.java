package del.alstrudat;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      LinkedList<DataMahasiswa> mahasiswaList = new LinkedList<>();
      LinkedList<DataTugas> tugasList = new LinkedList<>();

      int jumlahMahasiswa = Integer.parseInt(scanner.nextLine());

      for (int i = 0; i < jumlahMahasiswa; i++) {
        String nama = scanner.nextLine();
        String jurusan = scanner.nextLine();
        int waktu = Integer.parseInt(scanner.nextLine());
        mahasiswaList.append(new DataMahasiswa(nama, jurusan, waktu));
      }

      int jumlahTugas = Integer.parseInt(scanner.nextLine());

      for (int i = 0; i < jumlahTugas; i++) {
        String kode = scanner.nextLine();
        String nama = scanner.nextLine();
        String jenis = scanner.nextLine();
        int durasi = Integer.parseInt(scanner.nextLine());
        int prioritas = Integer.parseInt(scanner.nextLine());
        tugasList.append(new DataTugas(kode, nama, jenis, durasi, prioritas));
      }

      System.out.println("Mahasiswa Tersedia:");
      Helper.sortMahasiswaAZ(mahasiswaList);
      mahasiswaList.printList();
      System.out.println();

      LinkedList<DataTugas> praktikumList = Helper.getTugasByJenis(tugasList, "Praktikum");
      LinkedList<DataTugas> teoriList = Helper.getTugasByJenis(tugasList, "Teori");
      Helper.sortTugasByPrioritas(praktikumList);
      Helper.sortTugasByPrioritas(teoriList);

      int totalPraktikum = Helper.totalDurasi(praktikumList);
      int totalTeori = Helper.totalDurasi(teoriList);

      System.out.println("Total Durasi Tugas Praktikum: " + totalPraktikum + " jam");
      praktikumList.printList();
      System.out.println();

      System.out.println("Total Durasi Tugas Teori: " + totalTeori + " jam");
      teoriList.printList();
      System.out.println();

      int tahap = 0;
      while (true) {
        tahap++;
        System.out.println("- Tahap " + tahap + " Penjadwalan!");

        LinkedList<DataTugas> prioritasList;
        boolean praktikumPrioritas = totalPraktikum >= totalTeori;

        if (praktikumPrioritas) {
          System.out.println("Prioritaskan Tugas Praktikum!");
          prioritasList = praktikumList;
        } else {
          System.out.println("Prioritaskan Tugas Teori!");
          prioritasList = teoriList;
        }

        DataMahasiswa mhs = Helper.getMahasiswaUntukTugas(mahasiswaList, prioritasList);
        if (mhs == null) {
          System.out.println("Tidak ada mahasiswa tersedia untuk penjadwalan!");
          break;
        }

        System.out.println("Mahasiswa Terpilih: " + mhs);

        LinkedList<DataTugas> tugasUntukMhs = Helper.ambilTugasUntukMahasiswa(prioritasList, mhs.waktuKosong);
        System.out.println("Tugas Dijadwalkan:");
        tugasUntukMhs.printList();

        int durasiTerambil = Helper.totalDurasi(tugasUntukMhs);
        mhs.waktuKosong -= durasiTerambil;

        Helper.hapusTugasYangSudahDiambil(prioritasList, tugasUntukMhs);

        totalPraktikum = Helper.totalDurasi(praktikumList);
        totalTeori = Helper.totalDurasi(teoriList);

        if (totalPraktikum == 0 && totalTeori == 0) {
          System.out.print("Semua tugas telah dijadwalkan!");
          break;
        }
      }
    }
  }
}
