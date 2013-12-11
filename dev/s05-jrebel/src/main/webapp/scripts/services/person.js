angular.module('myApp').factory('Person',['$http','$resource',function($http,$resource){
//    var service = {};
//    service.get = function(id){
//        var response = {};
//        $http.get(path+'/api/person/'+id).success(function(data){
//            console.log('Person retrieved: '+JSON.stringify(data));
//            console.log('Keys: '+JSON.stringify(_.keys(data)));
//            for(var field in data){
//                response[field] = data[field];
//            }
//        });
//        return response;
//    };
//    return service;
    return $resource(path+'/api/person/:personId',{personId:'@id'});
}]);