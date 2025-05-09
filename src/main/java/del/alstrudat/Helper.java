package del.alstrudat;

public class Helper {

  public static void sortMahasiswaAZ(LinkedList<DataMahasiswa> list) {
    for (int i = 0; i < list.length - 1; i++) {
      for (int j = 0; j < list.length - i - 1; j++) {
        DataMahasiswa a = (DataMahasiswa) list.get(j).value;
        DataMahasiswa b = (DataMahasiswa) list.get(j + 1).value;
        if (a.nama.compareTo(b.nama) > 0) {
          list.set(j, b);
          list.set(j + 1, a);
        }
      }
    }
  }

  public static void sortTugasByPrioritas(LinkedList<DataTugas> list) {
    for (int i = 0; i < list.length - 1; i++) {
      for (int j = 0; j < list.length - i - 1; j++) {
        DataTugas a = (DataTugas) list.get(j).value;
        DataTugas b = (DataTugas) list.get(j + 1).value;
        if (a.prioritas < b.prioritas
            || (a.prioritas == b.prioritas && a.jenis.equals("Praktikum") && !b.jenis.equals("Praktikum"))) {
          list.set(j, b);
          list.set(j + 1, a);
        }
      }
    }
  }

  public static LinkedList<DataTugas> getTugasByJenis(LinkedList<DataTugas> list, String jenis) {
    LinkedList<DataTugas> result = new LinkedList<>();
    for (int i = 0; i < list.length; i++) {
      DataTugas tugas = (DataTugas) list.get(i).value;
      if (tugas.jenis.equals(jenis)) {
        result.append(tugas);
      }
    }
    return result;
  }

  public static int totalDurasi(LinkedList<DataTugas> list) {
    int total = 0;
    for (int i = 0; i < list.length; i++) {
      DataTugas tugas = (DataTugas) list.get(i).value;
      total += tugas.durasi;
    }
    return total;
  }

  public static DataMahasiswa getMahasiswaUntukTugas(LinkedList<DataMahasiswa> list, LinkedList<DataTugas> tugasList) {
    for (int i = 0; i < list.length; i++) {
      DataMahasiswa mhs = (DataMahasiswa) list.get(i).value;
      int sisa = mhs.waktuKosong;
      LinkedList<DataTugas> terpilih = new LinkedList<>();

      for (int j = 0; j < tugasList.length; j++) {
        DataTugas tugas = (DataTugas) tugasList.get(j).value;
        if (tugas.durasi <= sisa) {
          sisa -= tugas.durasi;
          terpilih.append(tugas);
        }
      }

      if (terpilih.length > 0) {
        return mhs;
      }
    }
    return null;
  }

  public static LinkedList<DataTugas> ambilTugasUntukMahasiswa(LinkedList<DataTugas> list, int waktuTersedia) {
    LinkedList<DataTugas> result = new LinkedList<>();
    int waktuSisa = waktuTersedia;
    for (int i = 0; i < list.length; i++) {
      DataTugas tugas = (DataTugas) list.get(i).value;
      if (tugas.durasi <= waktuSisa) {
        result.append(tugas);
        waktuSisa -= tugas.durasi;
      }
    }
    return result;
  }

  public static void hapusTugasYangSudahDiambil(LinkedList<DataTugas> tugasUtama,
      LinkedList<DataTugas> tugasYangDiambil) {
    for (int i = 0; i < tugasYangDiambil.length; i++) {
      DataTugas tugas = (DataTugas) tugasYangDiambil.get(i).value;
      for (int j = 0; j < tugasUtama.length; j++) {
        DataTugas cek = (DataTugas) tugasUtama.get(j).value;
        if (cek.kode.equals(tugas.kode)) {
          tugasUtama.remove(j);
          break;
        }
      }
    }
  }
}
