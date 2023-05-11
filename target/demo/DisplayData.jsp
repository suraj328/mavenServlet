<%@page import = "model.StoreData"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>display data</title>
</head>
<body bgcolor="cyan">
    fetch data = 
    <!-- StoreData D =  (StoreData) request.getAttribute("data"); -->
    <%
        StoreData D =  (StoreData) session.getAttribute("data");
        out.println(D);
    %>
</body>
</html>