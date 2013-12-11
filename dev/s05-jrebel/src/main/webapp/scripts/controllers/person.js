angular.module('myApp').controller('PersonController',['$scope','$http',function($scope,$http){
    $scope.person = {};
    $http.get(path+'/api/person/emartinez').success(function(data){
        $scope.person = data;
    });
}]);