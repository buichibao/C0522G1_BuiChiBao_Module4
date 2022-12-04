package com.example.ve_xe.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
public class VeXe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String giaVe;
    String diemDi;
    String diemDen;
    String ngayKhoiHanh;
    String gioKhoiHanh;
    String soLuong;
    boolean isDelete = false;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nhaXe_id",referencedColumnName = "id")
    NhaXe nhaXe;

    public VeXe() {
    }

    public VeXe(int id, String giaVe, String diemDi, String diemDen, String ngayKhoiHanh, String gioKhoiHanh, String soLuong, NhaXe nhaXe) {
        this.id = id;
        this.giaVe = giaVe;
        this.diemDi = diemDi;
        this.diemDen = diemDen;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.gioKhoiHanh = gioKhoiHanh;
        this.soLuong = soLuong;
        this.nhaXe = nhaXe;
    }


    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(String giaVe) {
        this.giaVe = giaVe;
    }

    public String getDiemDi() {
        return diemDi;
    }

    public void setDiemDi(String diemDi) {
        this.diemDi = diemDi;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    public void setGioKhoiHanh(String gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public NhaXe getNhaXe() {
        return nhaXe;
    }

    public void setNhaXe(NhaXe nhaXe) {
        this.nhaXe = nhaXe;
    }

    @Override
    public String toString() {
        return "VeXe{" +
                "id=" + id +
                ", giaVe='" + giaVe + '\'' +
                ", diemDi='" + diemDi + '\'' +
                ", diemDen='" + diemDen + '\'' +
                ", ngayKhoiHanh='" + ngayKhoiHanh + '\'' +
                ", gioKhoiHanh='" + gioKhoiHanh + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", nhaXe=" + nhaXe +
                '}';
    }
}
