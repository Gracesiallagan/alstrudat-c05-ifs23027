package del.alstrudat;

public class Helper {

  public static void sortMahasiswaAZ(LinkedList<DataMahasiswa> list) {
    // TODO: Implementasikan pengurutan mahasiswa berdasarkan nama (A-Z)
  }

  public static void sortTugasByPrioritas(LinkedList<DataTugas> list) {
    // TODO: Implementasikan pengurutan tugas berdasarkan prioritas
  }

  public static LinkedList<DataTugas> getTugasByJenis(LinkedList<DataTugas> list, String jenis) {
    // TODO: Kembalikan daftar tugas berdasarkan jenis
    return null;
  }

  public static int totalDurasi(LinkedList<DataTugas> list) {
    // TODO: Hitung total durasi semua tugas
    return 0;
  }

  public static DataMahasiswa getMahasiswaUntukTugas(LinkedList<DataMahasiswa> list, LinkedList<DataTugas> tugasList) {
    // TODO: Temukan mahasiswa yang bisa mengerjakan setidaknya satu tugas
    return null;
  }

  public static LinkedList<DataTugas> ambilTugasUntukMahasiswa(LinkedList<DataTugas> list, int waktuTersedia) {
    // TODO: Ambil tugas-tugas yang bisa dikerjakan berdasarkan waktu tersedia
    return null;
  }

  public static void hapusTugasYangSudahDiambil(LinkedList<DataTugas> tugasUtama,
      LinkedList<DataTugas> tugasYangDiambil) {
    // TODO: Hapus tugas-tugas yang sudah diambil dari tugas utama
  }
}
