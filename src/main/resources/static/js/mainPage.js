/**
 * mainPage.js
 */

var mainPageNavVue = new Vue({
    el : '#homeaiNav',
    data : {
        src: ''
    },
    methods : {
        loadModule : function(url) {
            this.src = ctxPath + url;
        }
    }
})