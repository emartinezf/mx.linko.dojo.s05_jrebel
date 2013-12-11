<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myApp">
    <head>
        <script type="text/javascript" src="http://code.angularjs.org/1.2.4/angular.js"></script>
        <script type="text/javascript" src="http://code.angularjs.org/1.2.4/angular-resource.js"></script>
        <script type="text/javascript" src="http://code.angularjs.org/1.2.4/angular-route.js"></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.5.2/underscore-min.js"></script>
        <script type="text/javascript" src="scripts/app.js"></script>
        <script type="text/javascript" src="scripts/controllers/persons.js"></script>
        <script type="text/javascript" src="scripts/controllers/search.js"></script>
        <script type="text/javascript" src="scripts/services/person.js"></script>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body >
        <ul>
            <li><a href="#/search">Search</a></li>
            <li><a href="#/all">All</a></li>
        </ul>
        <div ng-view/>
    </body>
    
    <script type="text/javascript">
        path = '${pageContext.servletContext.contextPath}';
    </script>
</html>