(function() {
    'use strict';

    angular
        .module('jzApp')
        .controller('SidebarController', SidebarController);

    SidebarController.$inject = ['$state', 'Auth', 'Principal', 'ProfileService', 'Menu'];

    function SidebarController ($state, Auth, Principal, ProfileService, Menu) {
        var vm = this;

        vm.isNavbarCollapsed = true;
        vm.isAuthenticated = Principal.isAuthenticated;

        vm.menuList = Menu.query();

    }
})();
