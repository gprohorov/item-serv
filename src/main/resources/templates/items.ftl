<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Items</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<h1> ITEMS</h1>


 <table border="3" >
    <tr>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>Delete</th>
    </tr>
    <#list items as item>
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.description}</td>
            <td><a href="/ui/v1/items/del/${item.id}"><button>Delete</button></a></td>
        </tr>
    </#list>
 </table>
</body>
</html>
