angular.module('myApp').controller('SearchController',['$scope','Person',function($scope,Person){
    $scope.id = '';
    $scope.person = {};
    $scope.search = function(){
        console.log('Searching, id: '+$scope.id);
        $scope.person = Person.get({ personId : $scope.id });
    };
}]);