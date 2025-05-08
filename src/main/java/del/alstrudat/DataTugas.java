package del.alstrudat;

public class DataTugas {
  public String kode;
  public String nama;
  public String jenis;
  public int durasi;
  public int prioritas;

  public DataTugas(String kode, String nama, String jenis, int durasi, int prioritas) {
    this.kode = kode;
    this.nama = nama;
    this.jenis = jenis;
    this.durasi = durasi;
    this.prioritas = prioritas;
  }

  @Override
  public String toString() {
    return String.format("{[%s|%d jam]}", kode, durasi);
  }
}
