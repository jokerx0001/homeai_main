/**
 * userManage.js
 */

var userManageVue = new Vue({
    el : '#userManageContainer',
    data : {
        selectUser: '',
        disUserFlg: false,
        name: '',
        sex: '',
        age: '',
        level: ''
    },
    methods : {
        detail : function() {

            this.disUserFlg = true
            $.ajax({
                type : 'GET',
                url : ctxPath + 'token',
                dataType : 'json',
                data : {
                    account : this.account
                },
                success : function(data) {

                    console.log(data)
                    $("form").submit()
                },
                error : function(message) {
                    alert('failed ' + message)
                }
            })
        }
    }
})