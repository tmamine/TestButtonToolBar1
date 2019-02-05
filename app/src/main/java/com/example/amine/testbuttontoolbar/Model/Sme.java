package com.example.amine.testbuttontoolbar.Model;

import java.util.ArrayList;
import java.util.List;

public class Sme {

    private Long annee;
    private String direction;
    private String sites;
    private Long ra;
    private Long raVoli;
    private Long raConf;
    private Long consOri;
    private Long consOnp;
    private Long consOrp;
    private Long fruitO;
    private Long dechMet;
    private Long dechHuil;
    private Long dechMach;
    private Long rgGes;
    private Long rgSf6;
    private Long rgNox;
    private Long rgSo2;
    private Long rgPous;
    private Long incEi;
    private Long incMaint;
    private Long incPoi;
    private Long epRet;
    private Long epDev;
    private Long consRdr;
    private Long consSn;
    private Long consHuil;
    private Long engEnv;
    private Long engVist;

    public static List<Sme> smeList;

    public Sme(){}

    public Sme(Long annee,
               String direction,
               String sites,
               Long ra,
               Long raVoli,
               Long reConf,
               Long consOri,
               Long consOnp,
               Long consOrp,
               Long fruitO,
               Long dechMet,
               Long dechHuil,
               Long dechMach,
               Long rgGes,
               Long rgSf6,
               Long rgNox,
               Long rgSo2,
               Long rgPous,
               Long incEi,
               Long incMaint,
               Long incPoi,
               Long epRet,
               Long epDev,
               Long consRdr,
               Long consSn,
               Long consHuil,
               Long engEnv,
               Long engVist) {

        this.annee = annee;
        this.direction = direction;
        this.sites = sites;
        this.ra = ra;
        this.raVoli = raVoli;
        this.raConf = raConf;
        this.consOri = consOri;
        this.consOnp = consOnp;
        this.consOrp = consOrp;
        this.fruitO = fruitO;
        this.dechMet = dechMet;
        this.dechHuil = dechHuil;
        this.dechMach = dechMach;
        this.rgGes = rgGes;
        this.rgSf6 = rgSf6;
        this.rgNox = rgNox;
        this.rgSo2 = rgSo2;
        this.rgPous = rgPous;
        this.incEi = incEi;
        this.incMaint = incMaint;
        this.incPoi = incPoi;
        this.epRet = epRet;
        this.epDev = epDev;
        this.consRdr = consRdr;
        this.consSn = consSn;
        this.consHuil = consHuil;
        this.engEnv = engEnv;
        this.engVist = engVist;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSites() {
        return sites;
    }

    public void setSites(String sites) {
        this.sites = sites;
    }

    public Long getRa() {
        return ra;
    }

    public void setRa(Long ra) {
        this.ra = ra;
    }

    public Long getRaVoli() {
        return raVoli;
    }

    public void setRaVoli(Long raVoli) {
        this.raVoli = raVoli;
    }

    public Long getRaConf() {
        return raConf;
    }

    public void setRaConf(Long raConf) {
        this.raConf = raConf;
    }

    public Long getConsOri() {
        return consOri;
    }

    public void setConsOri(Long consOri) {
        this.consOri = consOri;
    }

    public Long getConsOnp() {
        return consOnp;
    }

    public void setConsOnp(Long consOnp) {
        this.consOnp = consOnp;
    }

    public Long getConsOrp() {
        return consOrp;
    }

    public void setConsOrp(Long consOrp) {
        this.consOrp = consOrp;
    }

    public Long getFruitO() {
        return fruitO;
    }

    public void setFruitO(Long fruitO) {
        this.fruitO = fruitO;
    }

    public Long getDechMet() {
        return dechMet;
    }

    public void setDechMet(Long dechMet) {
        this.dechMet = dechMet;
    }

    public Long getDechHuil() {
        return dechHuil;
    }

    public void setDechHuil(Long dechHuil) {
        this.dechHuil = dechHuil;
    }

    public Long getDechMach() {
        return dechMach;
    }

    public void setDechMach(Long dechMach) {
        this.dechMach = dechMach;
    }

    public Long getRgGes() {
        return rgGes;
    }

    public void setRgGes(Long rgGes) {
        this.rgGes = rgGes;
    }

    public Long getRgSf6() {
        return rgSf6;
    }

    public void setRgSf6(Long rgSf6) {
        this.rgSf6 = rgSf6;
    }

    public Long getRgNox() {
        return rgNox;
    }

    public void setRgNox(Long rgNox) {
        this.rgNox = rgNox;
    }

    public Long getRgSo2() {
        return rgSo2;
    }

    public void setRgSo2(Long rgSo2) {
        this.rgSo2 = rgSo2;
    }

    public Long getRgPous() {
        return rgPous;
    }

    public void setRgPous(Long rgPous) {
        this.rgPous = rgPous;
    }

    public Long getIncEi() {
        return incEi;
    }

    public void setIncEi(Long incEi) {
        this.incEi = incEi;
    }

    public Long getIncMaint() {
        return incMaint;
    }

    public void setIncMaint(Long incMaint) {
        this.incMaint = incMaint;
    }

    public Long getIncPoi() {
        return incPoi;
    }

    public void setIncPoi(Long incPoi) {
        this.incPoi = incPoi;
    }

    public Long getEpRet() {
        return epRet;
    }

    public void setEpRet(Long epRet) {
        this.epRet = epRet;
    }

    public Long getEpDev() {
        return epDev;
    }

    public void setEpDev(Long epDev) {
        this.epDev = epDev;
    }

    public Long getConsRdr() {
        return consRdr;
    }

    public void setConsRdr(Long consRdr) {
        this.consRdr = consRdr;
    }

    public Long getConsSn() {
        return consSn;
    }

    public void setConsSn(Long consSn) {
        this.consSn = consSn;
    }

    public Long getConsHuil() {
        return consHuil;
    }

    public void setConsHuil(Long consHuil) {
        this.consHuil = consHuil;
    }

    public Long getEngEnv() {
        return engEnv;
    }

    public void setEngEnv(Long engEnv) {
        this.engEnv = engEnv;
    }

    public Long getEngVist() {
        return engVist;
    }

    public void setEngVist(Long engVist) {
        this.engVist = engVist;
    }

}
