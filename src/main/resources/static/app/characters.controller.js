(function () {
    'use strict';

    angular
        .module('app')
        .controller('CharactersController', CharactersController);

    CharactersController.$inject = ['$http'];

    function CharactersController($http) {
        var vm = this;

        vm.characters = [];
        vm.getAll = getAll;
        init();
        
        function init() {
            console.log(vm);
            getAll();
        }

        function getAll() {
            var url = "/characters";
            var charactersPromise = $http.get(url);
            charactersPromise.then(function (response) {
                vm.characters = response.data;
            });
        }
    }
})();