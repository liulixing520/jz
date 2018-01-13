(function() {
    'use strict';

    angular
        .module('jzApp')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['$scope', 'Principal', 'LoginService', '$state'];

    function HomeController ($scope, Principal, LoginService, $state) {
        var vm = this;

        vm.account = null;
        vm.isAuthenticated = null;
        // vm.login = LoginService.open;
        vm.login = login;
        vm.register = register;
        $scope.$on('authenticationSuccess', function() {
            getAccount();
        });

        getAccount();

        function getAccount() {
            Principal.identity().then(function(account) {
                vm.account = account;
                vm.isAuthenticated = Principal.isAuthenticated;
                if(vm.account == null){
                    login();
                }
            });
        }
        function register () {
            $state.go('register');
        }
        function login () {
            $state.go('login');
        }
    }
})();
