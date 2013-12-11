angular.module('myApp').controller('PersonsController',
['$scope','Person',function($scope,Person){
    $scope.persons = Person.query();
    $scope.person = Person.get({personId : 'emartinez'});
//    Person.get('emartinez').success(function(data){
//       $scope.person = data;
//    });
//    $http.get(path+'/api/person/emartinez').success(function(data){
//        $scope.person = data;
//    });
}]);