<%-- 
    Document   : Product_Create
    Created on : Dec 13, 2018, 4:52:33 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Add New Pruduct </h1>
        <form action="Product_Store" method="POST">
            ID Produk : <input type="text" name="id_produk"><br><br>
            Nama : <input type="text" name="nama_produk"><br><br>
            Stok : <input type="text" name="stok"><br><br>
            Price : <input type="text" name="price"><br><br>
            <input type="submit" value="Simpan">
        </form>
    </body>
</html>
