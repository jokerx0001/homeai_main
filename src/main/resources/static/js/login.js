/**
 * login.js
 */

var loginContainerVue = new Vue({
	el : '#loginContainerDiv',
	data : {
		account : '',
		password : '',
		name : ''
	},
	methods : {
		login : function() {
			var that = this
			$.ajax({
				type : 'GET',
				url : ctxPath + 'token',
				dataType : 'json',
				data : {
					account : this.account,
					password : this.password
				},
				success : function(data) {
					// TODO
					console.log(data)
					$("form").submit()
				},
				error : function(message) {
					alert('failed ' + message)
				}
			})
		},
		register : function() {

			$("form").attr('action', ctxPath + 'userRegister')
			$("form").submit()
		}
	}
})