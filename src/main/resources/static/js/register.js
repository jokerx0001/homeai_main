/**
 * register.js
 */

var registerContainerVue = new Vue({
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

            $.ajax({
                type : 'PUT',
                url : ctxPath + 'user',
                dataType : 'json',
                data : {
                    account : this.account,
                    password : this.password,
                    name : this.name,
                    age : this.age,
                    sex : this.sex
                },
                success : function(data) {

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