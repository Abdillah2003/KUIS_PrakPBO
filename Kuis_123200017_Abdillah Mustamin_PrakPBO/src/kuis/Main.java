
package kuis;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilih,pil;
        int nilai;
        String nama, asekolah;
        double alurCerita, konten, kreatifitas, sinematografi, total;
        double halurCerita , hkonten , hkreatifitas , hsinematografi;
        double ssurat, isiSurat, kreatifitass, pkb, total2;
        double hssurat, hisiSurat, hkreatifitass, hpkb;
        Scanner input = new Scanner(System.in);
        System.out.println("1. kategori Animasi");
        System.out.println("2. Kategori Menulis Surat");
        System.out.println("3. lihat Hasil");
        System.out.println("4. Edit Data");
        System.out.println("5. Exit");
        System.out.print("Masukan Pilihan : "); pilih = input.nextInt();
        
        if(pilih==1){
            
            System.out.print("Masukan Nama : ");  nama = input.next();
            System.out.print("Masukan Asal sekolah : ");  asekolah = input.next();
            System.out.print("Masukan nilai alur cerita : ");  alurCerita = input.nextInt();
            System.out.print("Masukan  nilai Konten : ");  konten = input.nextInt();
            System.out.print("Masukan  nilai kreatifitas : ");  kreatifitas = input.nextInt();
            System.out.print("Masukan  nilai Sinematografi : ");  sinematografi = input.nextInt();
            
            halurCerita = ((15/100)*alurCerita);
            hkonten = ((35/100)*konten);
            hkreatifitas = ((35/100)*kreatifitas);
            hsinematografi = ((15/100)*sinematografi);
           
           total = halurCerita + hkonten + hkreatifitas + hsinematografi;
            
           System.out.println("total : " +total);
           
            if(total>85){
               System.out.println("Peserta dinyatakan lulus");
            }else{
                System.out.println("Peserta TidakLulus");            }
        
            
        }else if(pilih ==2){

            System.out.print("Masukan Nama : ");  nama = input.next();
            System.out.print("Masukan Asal sekolah : ");  asekolah = input.next();
            System.out.print("Masukan nilai alur cerita : ");  ssurat = input.nextInt();
            System.out.print("Masukan  nilai Konten : ");  isiSurat = input.nextInt();
            System.out.print("Masukan  nilai kreatifitas : ");  kreatifitass = input.nextInt();
            System.out.print("Masukan  nilai Sinematografi : ");  pkb = input.nextInt();
            
            hssurat = ((10/100)*ssurat);
            hisiSurat = ((40/100)*isiSurat);
            hkreatifitass = ((30/100)*kreatifitass);
            hpkb = ((20/100)*pkb);
            
            total2 =  hssurat + hisiSurat + hkreatifitass + hpkb;
            System.out.println("total  = " +total2);
            
            if(total2>85){
                System.out.println("Peserta dinyatakan lulus");
            }else{
                System.out.println("Peserta TidakLulus");
            }
        
            
            
        }else if(pilih ==3){
            
            System.out.println("hasil kelulusan");
            System.out.println("1. kategori animas");
            System.out.println("2. kategori surat");
            System.out.println("masukan pilihan ; "); pil = input.nextInt();
            if(pil==1){
                //kategori animasi
            }else if(pil==2){
                //kategori surat
            }
            
            
        }else if(pilih == 4){
            //edit data
        }
        else if(pilih == 5){
            System.exit(0);
        }
    }
    
}
