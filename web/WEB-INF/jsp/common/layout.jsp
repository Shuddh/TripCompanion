<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <meta name="Keywords" content="<tiles:insertAttribute name='metaKeywords' ignore='true' />"/>
        <meta name="description" content="<tiles:insertAttribute name='metaDescription' ignore='true' />"/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
        <tiles:insertAttribute name="global_js" />
        <tiles:insertAttribute name="local_js" />
        <tiles:insertAttribute name="global_css" />
        <tiles:insertAttribute name="local_css" />
    </head>
    <body>
        <tiles:insertAttribute name="body" />
        <tiles:insertAttribute name="footer" />
    </body>
</html>
