lmsApp
	.controller(
		"authorController",
		function ($scope, $http, lmsFactory, lmsConstants, Pagination) {
			lmsFactory.getAll(lmsConstants.GET_AUTHOR)
				.then(function (res) {
					$scope.authors = res;
					$scope.authorsSize = res.length;
					$scope.pagination = Pagination.getNew(10);
					$scope.pagination.numPages = Math.ceil($scope.authors.length
							/ $scope.pagination.perPage);
				})

			$scope.deleteAuthor = function (authorId) {
				var author = {
					authorId: authorId
				}
				lmsFactory.saveObject(lmsConstants.SAVE_AUTHOR,
						author)
					.then(
						function (res) {
							lmsFactory
								.getAll(
									lmsConstants.GET_AUTHOR)
								.then(
									function (res) {
										$scope.authors = res;
										$scope.authorsSize = res.length;
									})
						})
			}
			
			$scope.prepareEdit = function (author) {
				$scope.authorToEdit = author;
				
			}
			
			$scope.updateAuthor = function () {
				lmsFactory.saveObject(lmsConstants.SAVE_AUTHOR,
						$scope.authorToEdit)
					.then(
						function (res) {
							lmsFactory
								.getAll(
									lmsConstants.GET_AUTHOR)
								.then(
									function (res) {
										$scope.authors = res;
										$scope.authorsSize = res.length;
									})
						})
				
			}
			
			$scope.searchAuthor = function(){
				lmsFactory.getAll(lmsConstants.GET_AUTHOR+$scope.searchString)
				.then(function (res) {
					$scope.authors = res;
					$scope.authorsSize = res.length;
					$scope.pagination = Pagination.getNew(10);
					$scope.pagination.numPages = Math.ceil($scope.authors.length
							/ $scope.pagination.perPage);
				})
			}
		})