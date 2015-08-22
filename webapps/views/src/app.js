var app = angular.module('calorizerApp', ['ngDialog']);
app
	.controller('MenuCtrl', function ($scope, ngDialog) {
		$scope.value = "MenuCtrl value";
		$scope.loginClick = function () {
			ngDialog.open({template: 'popupLogin.html',
			className: 'ngdialog-theme-plain',
			scope: $scope});
		};

	});