/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

/**
 *
 * @author Vidi
 */
public class Utama {
    public static void main(String[] args) {
          Laboran budi = new Laboran();
          TataUsaha edi = new TataUsaha();
          Guru agus = new Guru("TKI","Rekayasa Perangkat Lunak");
          GuruTT ida = new GuruTT();
          Sekolah smkn1sby = new Sekolah();
          MataPelajaran mapel = new MataPelajaran();
          Pustakawan pustakawan = new Pustakawan();
          ProgramKeahlian progli = new ProgramKeahlian();
          KomLi komli = new KomLi();
          Siswa putri = new Siswa();
          Siswa putra = new Siswa();
          String nama1="", nama2="", nama3 ="", nama4="";
          
          smkn1sby.setNama("SMK Negeri 1 Surabaya");
          smkn1sby.setKodeSek(177);
          smkn1sby.setStatus(true);
          smkn1sby.setNISS("123143124314");
          smkn1sby.setNamaKepSek("Drs. Pardiono, M.Pd.");
          nama1 = "Sulenggono, M.Pd.";
          nama2 = "Drs. Sapto, M.Pd.";
          nama3 = "Dra. Sri Wulansari, M.Pd.";
          nama4 = "Dra. Pratnyo, M.Pd.";
          smkn1sby.setNamaWaka1(nama1);
          smkn1sby.setNamaWaka2(nama2);
          smkn1sby.setNamaWaka3(nama3);
          smkn1sby.setNamaWaka4(nama4);
          
          smkn1sby.tampilSekolah(smkn1sby.getNama(), smkn1sby.getKodeSek(), smkn1sby.isStatus(), 
                  smkn1sby.getNISS(), smkn1sby.getNamaKepSek(), smkn1sby.getNamaWaka1(), smkn1sby.getNamaWaka2(),
                  smkn1sby.getNamaWaka3(), smkn1sby.getNamaWaka4());
          
          agus.entryPegawai();
          agus.entryGuru();
          ida.entryGuruTT();
          agus.tampilGuru(agus.getIjazahTerakhir(), agus.getPengampuMapel(), agus.getBidangKomp(), agus.getNama(), agus.getNip());
          progli.entryProgLi();
          komli.entryKomLi();
          putri.entrySiswa();
          
    } 
}
