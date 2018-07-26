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
            {name: "Warrior", value: 'WARRIOR'}];

        vm.getAllCharacters = getAllCharacters;
        vm.create = create;
        vm.remove = remove;

        init();

        function init() {
            getAllCharacters();
        }

        function getAllCharacters() {
            var url = "/characters";
            var charactersPromise = $http.get(url);
            charactersPromise.then(function (response) {
                vm.characters = response.data;
            });
        }

        function create(name, gender, breed) {
            var url = "/characters?name=" + name + "&gender=" + gender + "&breed=" + breed;
            var charactersPromise = $http.post(url, {headers: {'Content-Type': 'application/json'}});
            charactersPromise.then(function (response) {
                vm.characters = response.data;
            });
            getAllCharacters();
        }

        function remove(id) {
            var url = "/characters/" + id;
            var charactersPromise = $http.delete(url);
            charactersPromise.then(function (response) {
                vm.characters = response.data;
            });
            getAllCharacters();
        }
    }
})();