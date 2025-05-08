package del.alstrudat;

public class DataMahasiswa {
  public String nama;
  public String jurusan;
  public int waktuKosong;

  public DataMahasiswa(String nama, String jurusan, int waktuKosong) {
    this.nama = nama;
    this.jurusan = jurusan;
    this.waktuKosong = waktuKosong;
  }

  @Override
  public String toString() {
    return String.format("<|%s|%s|%d jam|>", nama, jurusan, waktuKosong);
  }
}
