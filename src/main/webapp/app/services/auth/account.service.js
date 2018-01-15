(function() {
    'use strict';

    angular
        .module('jzApp')
        .factory('Account', Account)
        .factory('Menu', Menu);

    Account.$inject = ['$resource'];
    Menu.$inject = ['$resource'];

    function Account ($resource) {
        var service = $resource('api/account', {}, {
            'get': { method: 'GET', params: {}, isArray: false,
                interceptor: {
                    response: function(response) {
                        // expose response
                        return response;
                    }
                }
            }
        });

        return service;
    }

    /**
     * 获取当前用户的下的菜单
     * @param $resource
     * @returns {*}
     * @constructor
     */
    function Menu ($resource) {
        var service = $resource('api/menu', {}, {
            'query': { method: 'GET', isArray: true}

        });

        return service;
    }
})();
