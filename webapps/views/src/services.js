angular.module('CalorizerApp')
	.factory('AuthenticationService',['$http','$cookieStore', '$rootScope', function($http,$cookieStore,$rootScope){
			var service = {};
			service.SetCredentials = function(username, pass) {
				$rootScope.globals = {
					currentUser: {
					username: username,
					authdata: pass}
				};
				$cookieStore.put('globals', $rootScope.globals);
			};
			service.ClearCredentials = function() {
				$rootScope.globals = {};
            	$cookieStore.remove('globals');
			};
			return service;
		}]);