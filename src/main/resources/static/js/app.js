angular.module('demo', [])
    .controller('Hello', function($scope, $http) {
        $http.get('http://localhost:8080/api/all').
        then(function(response) {
            $scope.bookings = response.data;
        });
    });