/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Product;


@WebServlet(name = "Product_Update", urlPatterns = {"/Product_Update"})
public class Product_Update extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id_produk = request.getParameter("id_produk");
            String nama_produk = request.getParameter("nama_produk");
            String stok = request.getParameter("stok");
            String price = request.getParameter("price");
Product obj = new Product();
obj.setIDProd(Integer.parseInt(id_produk));
obj.setNama(nama_produk);
obj.setStok(Integer.parseInt(stok));
obj.setPrice(Integer.parseInt(price));
int res = obj.update();
if (res!=0) {
 response.sendRedirect("Product_Index?message=updatesuccess");
} else {
 response.sendRedirect("Product_Index?message=updatefailed");
}

        }
        
    }
    
}
        
    
 
