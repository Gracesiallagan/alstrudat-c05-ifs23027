# alstrudat-c05-ifs23017

## Description

APTAMA adalah aplikasi untuk membantu mahasiswa menjadwalkan tugas-tugas ke dalam slot waktu yang tersedia di minggu tersebut. Setiap mahasiswa punya sejumlah slot waktu, dan setiap tugas punya jenis, prioritas, serta durasi. Aplikasi ini akan menjadwalkan tugas berdasarkan prioritas dan total durasi tugas.

## Source Codes

| No  | File               | Deskripsi         |
| --- | ------------------ | ----------------- |
| 1   | App.java           | Bawaan            |
| 2   | Helper.java        | Melengkapi Fungsi |
| 3   | Data.java          | Bawaan            |
| 4   | DataMahasiswa.java | Bawaan            |
| 5   | DataTugas.java     | Bawaan            |
| 6   | LinkedList.java    | Buat Sendiri      |

## Test Cases

#1
| No| Input | Output |
|---| ------------------ | ------------------------------------------ |
| 1 | 2 | Mahasiswa Tersedia: |
| 2 | Andi | <|Andi|Infomatika|10 jam|> |
| 3 | Informatika | <|Budi|Sistem Infomasi|12 jam|> |
| 4 | 10 | Total Durasi Tugas Praktikum:13 jam
| 5 | Budi | {[T001|3 jam]} |
| 6 | Sistem Informasi | {[T002|5 jam]} |
| 7 | 12 | {[T004|5 jam]} |
| 8 | 4 | |
| 9 | T001 | Total Durasi Tugas Teori: 2 jam |
| 10 | Tugas 1 | {[T003|2 jam]} |
| 11 | Praktikum | |
| 12 | 3 | - Tahap 1 Penjadwalan! |
| 13 | 5 | Prioritaskan Tugas Praktikum! |
| 14 | T002 | Mahasiswa Terpilih: <|Andi|Infomatika|10 jam
|> |
| 15 | Tugas 2 | Tugas Dijadwalkan: |
| 16 | Praktikum | Prioritaskan Tugas Praktikum! |
| 17 | 5 | Mahasiswa Terpilih:<|Andi|Infomatika|10 jam
|> |
| 18 | 4 | Tugas Dijadwalkan: |
| 19 | T003 | {[T001|3 jam]} |
| 20 | Tugas 3 | {[T002|5 jam]} |
| 21 | Teori | - Tahap 2 Penjadwalan! |
| 22 | 2 | Prioritaskan Tugas Praktikum! |
| 23 | 3 | Mahasiswa Terpilih: <|Budi|Sistem Infomasi|12 jam
|> |
| 24 | T004 | Tugas Dijadwalkan: |
| 25 | Tugas 4 | {[T004|5 jam]} |
| 26 | Praktikum | - Tahap 3 Penjadwalan! |
| 27 | 5 | Prioritaskan Tugaas Teori! |
| 28 | 2 | Mahasiswa Terpilih: <|Andi|Infomatika|2 jam
|> |
| | | Tugas Dijadwalkan: |
| | | {[T003|2 jam]} |
| | | Semua tugas telah dijadwalkan!

## Compile

`mvn clean package`

## Run

`java -cp target/app.jar del.alstrudat.App`
