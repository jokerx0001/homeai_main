/**
 * userManage.js
 */

var userManageVue = new Vue({
    el: '#userManageContainer',
    data: {
        selectUser: '',
        disUserFlg: false,
        name: '',
        sex: '',
        age: '',
        level: ''
    },
    methods: {
        detail: function () {

            var that = this
            this.disUserFlg = true
            $.ajax({
                type: 'GET',
                url: ctxPath + 'user',
                dataType: 'json',
                data: {
                    account: this.selectUser
                },
                success: function (data) {

                    console.log(data)
                    that.name = data.data.name
                    that.sex = data.data.sex
                    that.age = data.data.age
                    that.level = data.data.sysLv
                },
                error: function (message) {
                    alert('failed ' + message)
                }
            })
        },
        updateUser: function () {
            $.ajax({
                type: 'POST',
                url: ctxPath + 'user',
                dataType: 'json',
                data: {
                    account: this.selectUser,
                    name: this.name,
                    sex: this.sex,
                    age: this.age,
                    sysLv: this.level
                },
                success: function (data) {

                    console.log('update success')
                },
                error: function (message) {
                    alert('failed ' + message)
                }
            })
        },
        deleteUser: function () {
            $.ajax({
                type: 'DELETE',
                url: ctxPath + 'user',
                dataType: 'json',
                data: {
                    account: this.selectUser
                },
                success: function (data) {

                    console.log('delete success')
                },
                error: function (message) {
                    alert('failed ' + message)
                }
            })
        }
    }
})