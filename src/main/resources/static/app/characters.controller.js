(function () {
    'use strict';

    angular
        .module('app')
        .controller('CharactersController', CharactersController);

    CharactersController.$inject = ['$http'];

    function CharactersController($http) {
        var vm = this;

        vm.characters = [];

        vm.genders = [
            {name: "Male", value: 'MALE'},
            {name: "Female", value: 'FEMALE'}];

        vm.breeds = [
            {name: "Alchemist", value: 'ALCHEMIST'},
            {name: "Assassin", value: 'ASSASSIN'},
            {name: "Barbarian", value: 'BARBARIAN'},
            {name: "Bard", value: 'BARD'},
            {name: "Cleric", value: 'CLERIC'},
            {name: "Druid", value: 'DRUID'},
            {name: "Elf", value: 'ELF'},
            {name: "Khajiit", value: 'KHAJIIT'},
            {name: "Lancer", value: 'LANCER'},
            {name: "Magician", value: 'MAGICIAN'},
            {name: "Monk", value: 'MONK'},
            {name: "Pirate", value: 'PIRATE'},
            {name: "Ranger", value: 'RANGER'},
            {name: "Reptilian", value: 'REPTILIAN'},
            {name: "Rogue", value: 'ROGUE'},
            {name: "Shaman", value: 'SHAMAN'},
            {name: "Thief", value: 'THIEF'},
            {name: "Villager", value: 'VILLAGER'},
            {name: "Warrior", value: 'WARRIOR'}];

        vm.getAllCharacters = getAllCharacters;
        vm.create = create;
        vm.remove = remove;
        vm.randomCharacter = randomCharacter;
        vm.removeAll = removeAll;

        init();

        function init() {
            getAllCharacters();
        }

        function getAllCharacters() {
            $http({
                method: 'GET',
                url: '/characters'
            }).then(function successCallback(response) {
                vm.characters = response.data;
            }, function errorCallback(response) {
            });
        }


        function create(name, gender, breed) {
            var req = {
                method: 'POST',
                url: '/characters',
                headers: {
                    'Content-Type': 'application/json'
                },
                data: {
                    name: name,
                    gender: gender,
                    breed: breed
                }
            };

            $http(req).then(function successCallback(response) {
                vm.characters = response.data;
                getAllCharacters();
            }, function errorCallback(response) {
            });
        }

        function randomCharacter() {
            var req = {
                method: 'POST',
                url: '/random-character'
            };

            $http(req).then(function successCallback(response) {
                vm.characters = response.data;
                getAllCharacters();
            }, function errorCallback(response) {
            });
        }

        function remove(id) {
            var req = {
                method: 'DELETE',
                url: '/characters/' + id
            };

            $http(req).then(function successCallback(response) {
                vm.characters = response.data;
                getAllCharacters();
            }, function errorCallback(response) {
            });
        }

        function removeAll() {
            var req = {
                method: 'DELETE',
                url: '/characters'
            };

            $http(req).then(function successCallback(response) {
                vm.characters = response.data;
                getAllCharacters();
            }, function errorCallback(response) {
            });
        }
    }
})();