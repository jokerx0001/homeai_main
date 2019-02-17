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
        }
    }
})