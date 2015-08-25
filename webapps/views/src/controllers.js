angular.module('CalorizerApp')
	.controller('MenuCtrl', function ($scope, ngDialog) {
		$scope.value = "MenuCtrl value";
		$scope.loginClick = function () {
			ngDialog.open({template: 'popupLogin.html',
			controller: 'LoginController',
			className: 'ngdialog-theme-plain',
			scope: $scope});
		};

	})
	.controller('LoginController', ['$scope', '$rootScope', 'AuthenticationService',function($scope, $rootScope, AuthenticationService){
		$scope.login = function() {
			AuthenticationService.SetCredentials($scope.username, $scope.password);
			alert('done');
		};
		
	}]);