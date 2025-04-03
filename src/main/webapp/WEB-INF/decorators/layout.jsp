<%@ page contentType="text/html; charset=UTF-8" %>
<html>
  <head>
    <title><sitemesh:write property="title"/></title>
    <sitemesh:write property="head"/>
  </head>
  <body>
    <h1 class="title">SiteMesh example site: <sitemesh:write property="title"/></h1>
    <div class="mainBody">
      <sitemesh:write property="body"/>
    </div>
    <div class="disclaimer">Site disclaimer. This is an example.</div>
  </body>
</html>
