<html>
<head>
  <title>Catalog Report</title>
</head>
<body>
  <h1>Catalog Report</h1>
  <table>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Location</th>
      <th>Tags</th>
    </tr>
    <#list documents as doc>
      <tr>
          <td>${doc.id}</td>
        <#if doc.name?has_content>
                  <td>${doc.name}</td>
                <#else>
                  <td>Missing Name</td>
                </#if>
        <#if doc.location?has_content>
                          <td>${doc.location}</td>
                        <#else>
                          <td>Missing Location</td>
                        </#if>
       <td><#list doc.tags as key, value>
                           ${key}: ${value}<br>
                           </#list></td>

      </tr>
    </#list>
  </table>
</body>
</html>