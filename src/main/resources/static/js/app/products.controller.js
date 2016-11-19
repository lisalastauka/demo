(function () {
    'use strict';
    angular
    .module('app')
    .controller('ProductsController', function($scope, $http) {

        $scope.getAll = getAll;
        $scope.removeProduct = removeProduct;
        $scope.getPage = getPage;

        init();

        function init() {
            getAll();
        }

        function getAll() {
            $http.get('/../api/product/').
            then(function(response) {
                $scope.products = response.data;
            });
        }

        function getPage(id) {
            $http.get('/../api/product/page/' + id).
            then(function(response) {
                $scope.products = response.data.content;
            });
        }

        function removeProduct (product) {
            $http.delete('/../api/product/' + product.id).
                then(function () {
                $scope.products.splice($scope.products.indexOf(product), 1);
                console.log('success delete ' + product.productName);

            })
        }
    })
;
})();