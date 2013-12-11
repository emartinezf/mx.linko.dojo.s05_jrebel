<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myApp">
    <head>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.1/angular.min.js"></script>
        <script type="text/javascript" src="scripts/app.js"></script>
        <script type="text/javascript" src="scripts/controllers/person.js"></script>
    </head>
    <body ng-controller="PersonController">
        {{person}}
    </body>
    
    <script type="text/javascript">
        path = '${pageContext.servletContext.contextPath}';
    </script>
</html>