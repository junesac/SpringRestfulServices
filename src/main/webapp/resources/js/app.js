'use strict';

angular.module('todoApp',
		[ 'ngRoute', 'todoApp.services', 'todoApp.controllers' ]).config(
		function($routeProvider) {
			$routeProvider.when('/', {
				templateUrl : 'resources/partial/list.html',
				controller : 'TodoListCtrl'
			});
			$routeProvider.when('/todoDetail/:todoId', {
				templateUrl : 'resources/partial/detail.html',
				controller : 'TodoDetailCtrl'
			});
			$routeProvider.when('/todoUpdate/:todoId', {
				templateUrl : 'resources/partial/update.html',
				controller : 'TodoUpdateCtrl'
			});
			$routeProvider.otherwise({
				redirectTo : '/'
			});
		});
