/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import config.koneksi;
import java.sql.*;




public class Product {
    koneksi kon = new koneksi();
    String nama_produk;
    int id_produk , stok , price;

 public int getIDProd(){return id_produk;}
 public String getNama(){return nama_produk;}
 public int getStok(){return stok;}
 public int getPrice(){return price;}

 public void setIDProd(int id_produk){this.id_produk=id_produk;}
 public void setNama(String nama_produk){this.nama_produk=nama_produk;}
 public void setStok(int stok){this.stok=stok;}
 public void setPrice(int price){this.price=price;}

 public ResultSet readAll() {
 try
 {
        Connection con = kon.openConnection();
        String sql = "select * from tb_produk";
        Statement state = con.createStatement();
        ResultSet rs = state.executeQuery(sql);
        return rs;
 } catch (Exception e) {
        System.err.println(e);
        return null;
     }
 }

 public int store() {
 try
 {
        Connection con = kon.openConnection();
        String sql = "insert tb_produk values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, this.id_produk);
        ps.setString(2, this.nama_produk);
        ps.setInt(3, this.stok);
        ps.setInt(4, this.price);
        int res = ps.executeUpdate();
        return res;
 } catch (Exception e) {
        System.err.println(e);
        return 0;
 }
 }

 public ResultSet readByID() {
 try
 {
        Connection con = kon.openConnection();
        String sql = "select * from tb_produk where id_produk = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, this.id_produk);
        ResultSet rs = ps.executeQuery();
        return rs;
 } catch (Exception e) {
        System.err.println(e);
        return null;
 }
 }

 public int update() {
 try
 {
        Connection con = kon.openConnection();
        String sql = "update tb_produk set nama_produk=?, stok=?, price=? where id_produk=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, this.nama_produk);
        ps.setInt(2, this.stok);
        ps.setInt(3, this.price);
        ps.setInt(4, this.id_produk);
        int res = ps.executeUpdate();
        return res;
 } catch (Exception e) {
        System.err.println(e);
        return 0;
    }
 }

 public int destroy() {
 try
 {
        Connection con = kon.openConnection();
        String sql = "delete from tb_produk where id_produk = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, this.id_produk);
        int res = ps.executeUpdate();
        return res;
 } catch (Exception e) {
        System.err.println(e);
        return 0;
         }
    }
}

