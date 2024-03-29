package com.sgf.buscacep.Modelo;

public class Endereco {

    public String cep;
    public String logradouro ;
    public String complemento ;
    public String bairro ;
    public String localidade;
    public String uf ;
    public String unidade ;
    public String ibge ;
    public String gia;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

//    @Override
//    public String toString() {
//
//        return "CEP: " + getCep()
//                + "\nLogradouro: " + getLogradouro()
//                + "\nComplemento: " + getComplemento()
//                + "\nBairro: " + getBairro()
//                + "\nLocalidade: " + getLocalidade()
//                + "\nUF: " + getUf()
//                + "\nUnidade: " + getUnidade()
//                + "\nIbge: " + getIbge()
//                + "\nGia: " + getGia();
//
//    }
}
