<%--
  Created by IntelliJ IDEA.
  User: acheron
  Date: 03/08/2017
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create customer</h1>

<form id="customer_form" enctype="multipart/form-data">
    <table>
        <tr>
            <td>name:</td>
            <td><input type="text" name="name" value="${customer.name}"/></td>
        </tr>
        <tr>
            <td>photo:</td>
            <td><input type="file" name="photo" value="${cutomer.photo}"></type="file">/></td>
        </tr>
        <button type="submit">save</button>
    </table>

</form>

<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/jquery.form/4.2.1/jquery.form.min.js"></script>
<script>
    $(function () {
       $("#customer_form").ajaxForm({
           type:'post',
           url:'${BASE}/customer_create',
           success:function (data) {
               if(data) {
                   location.href='${BASE}/customer';
               }
           }

       });
    });
</script>
</body>
</html>
