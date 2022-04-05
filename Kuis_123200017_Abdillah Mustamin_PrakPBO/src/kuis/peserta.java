package kuis;

import kuis.inter.animasinya;
import kuis.inter.surat;
/**
 *
 * @author Lenovo
 */
public class peserta implements surat, animasinya {
    double alurCerita, konten, kreatifitas, sinematografi, total;
        double halurCerita , hkonten , hkreatifitas , hsinematografi;
        double ssurat, isiSurat, kreatifitass, pkb, total2;
        double hssurat, hisiSurat, hkreatifitass, hpkb;

    public peserta(double alurCerita, double konten, double kreatifitas, double sinematografi, double total, double halurCerita, double hkonten, double hkreatifitas, double hsinematografi, double ssurat, double isiSurat, double kreatifitass, double pkb, double total2, double hssurat, double hisiSurat, double hkreatifitass, double hpkb) {
        this.alurCerita = alurCerita;
        this.konten = konten;
        this.kreatifitas = kreatifitas;
        this.sinematografi = sinematografi;
        this.total = total;
        this.halurCerita = halurCerita;
        this.hkonten = hkonten;
        this.hkreatifitas = hkreatifitas;
        this.hsinematografi = hsinematografi;
        this.ssurat = ssurat;
        this.isiSurat = isiSurat;
        this.kreatifitass = kreatifitass;
        this.pkb = pkb;
        this.total2 = total2;
        this.hssurat = hssurat;
        this.hisiSurat = hisiSurat;
        this.hkreatifitass = hkreatifitass;
        this.hpkb = hpkb;
    }

    public double getAlurCerita() {
        return alurCerita;
    }

    public void setAlurCerita(double alurCerita) {
        this.alurCerita = alurCerita;
    }

    public double getKonten() {
        return konten;
    }

    public void setKonten(double konten) {
        this.konten = konten;
    }

    public double getKreatifitas() {
        return kreatifitas;
    }

    public void setKreatifitas(double kreatifitas) {
        this.kreatifitas = kreatifitas;
    }

    public double getSinematografi() {
        return sinematografi;
    }

    public void setSinematografi(double sinematografi) {
        this.sinematografi = sinematografi;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
        total = halurCerita + hkonten + hkreatifitas + hsinematografi;
    }

    public double getHalurCerita() {
        return halurCerita;
    }

    public void setHalurCerita(double halurCerita) {
        this.halurCerita = halurCerita;
        halurCerita = ((15/100)*alurCerita);
    }

    public double getHkonten() {
        return hkonten;
        
    }

    public void setHkonten(double hkonten) {
        this.hkonten = hkonten;
        hkonten = ((35/100)*konten);
    }

    public double getHkreatifitas() {
        return hkreatifitas;
    }

    public void setHkreatifitas(double hkreatifitas) {
        this.hkreatifitas = hkreatifitas;
         hkreatifitas = ((35/100)*kreatifitas);
    }

    public double getHsinematografi() {
        return hsinematografi;
    }

    public void setHsinematografi(double hsinematografi) {
        this.hsinematografi = hsinematografi;
        hsinematografi = ((15/100)*sinematografi);
    }

    public double getSsurat() {
        return ssurat;
    }

    public void setSsurat(double ssurat) {
        this.ssurat = ssurat;
    }

    public double getIsiSurat() {
        return isiSurat;
    }

    public void setIsiSurat(double isiSurat) {
        this.isiSurat = isiSurat;
    }

    public double getKreatifitass() {
        return kreatifitass;
    }

    public void setKreatifitass(double kreatifitass) {
        this.kreatifitass = kreatifitass;
    }

    public double getPkb() {
        return pkb;
    }

    public void setPkb(double pkb) {
        this.pkb = pkb;
    }

    public double getTotal2() {
        return total2;
    }

    public void setTotal2(double total2) {
        this.total2 = total2;
        total2 =  hssurat + hisiSurat + hkreatifitass + hpkb;
    }

    public double getHssurat() {
        return hssurat;
    }

    public void setHssurat(double hssurat) {
        this.hssurat = hssurat;
    }

    public double getHisiSurat() {
        return hisiSurat;
    }

    public void setHisiSurat(double hisiSurat) {
        this.hisiSurat = hisiSurat;
    }

    public double getHkreatifitass() {
        return hkreatifitass;
    }

    public void setHkreatifitass(double hkreatifitass) {
        this.hkreatifitass = hkreatifitass;
    }

    public double getHpkb() {
        return hpkb;
    }

    public void setHpkb(double hpkb) {
        this.hpkb = hpkb;
    }
        
    @Override
    public void menulisSurat() {
        hssurat = ((10/100)*ssurat);
        
    }

    @Override
    public void isiSurat() {
        hisiSurat = ((40/100)*isiSurat);
        
    }

    @Override
    public void kreatifitas() {
        hkreatifitass = ((30/100)*kreatifitass);
        
    }

    @Override
    public void pkb() {
        hpkb = ((20/100)*pkb);
        
    }

    @Override
    public void alurCerita() {
        halurCerita = ((15/100)*alurCerita);
        
    }

    @Override
    public void konten() {
        hkonten = ((35/100)*konten);
        
    }

    @Override
    public void sinematografi() {
        hsinematografi = ((15/100)*sinematografi);
        
    }
    
}
