/**
 * login.js
 */

var loginContainerVue = new Vue({
    el : '#registerContainerDiv',
    data : {
        account: '',
        password: '',
        name: '',
        sex: '0',
        age: ''
    },
    methods : {
    	register : function() {
            var that = this;
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
                    console.log(data);
                    $("form").submit();
                },
                error : function(message) {
                    alert('failed ' + message);
                }
            })
        }
    }
})