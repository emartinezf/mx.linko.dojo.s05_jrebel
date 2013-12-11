var myApp = angular.module('myApp',['ngResource','ngRoute']);
myApp.config(function($routeProvider){
    $routeProvider.when('/',{
        templateUrl: 'views/allpersons.html',
        controller: 'PersonsController'
    }).when('/search',{        
        templateUrl: 'views/search.html',
        controller: 'SearchController'
    }).otherwise({redirectTo:'/'});
});