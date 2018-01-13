(function() {
    'use strict';

    angular
        .module('jzApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider.state('app', {
            abstract: true,
            views: {
                'navbar@': {
                    templateUrl: 'app/layouts/navbar/navbar.html',
                    controller: 'NavbarController',
                    controllerAs: 'vm'
                },'sidebar@': {
                    templateUrl: 'app/layouts/navbar/sidebar.html',
                    controller: '',
                    controllerAs: ''
                },'footbar@': {
                    templateUrl: 'app/layouts/navbar/footbar.html',
                    controller: '',
                    controllerAs: ''
                }
            },
            resolve: {
                authorize: ['Auth',
                    function (Auth) {
                        return Auth.authorize();
                    }
                ],
                translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                    $translatePartialLoader.addPart('global');
                }]
            }
        });
    }
})();
