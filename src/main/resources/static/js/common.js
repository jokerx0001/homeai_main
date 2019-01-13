/**
 * common.js
 */
// Vue.config.devtools = true;
// project path
var ctxPath;

/**
 * load common javascript
 *
 * @param urls
 *            paths need add to load
 * @returns
 */
function homeAiLoadJs(urls) {

    var baseUrls = [ ctxPath + "js/lib/jquery-3.3.1.min.js",
            ctxPath + "js/lib/popper.min.js",
            ctxPath + "bootstrap/bootstrap.min.js",
//            ctxPath + "js/lib/vue.min.js" ];
            ctxPath + "js/lib/vue.js" ]; // DEBUG MODE


    if (urls) {
        for (i in urls) {
            urls[i] = ctxPath + urls[i];
            baseUrls.push(urls[i]);
        }
    }

    LazyLoad.js(baseUrls, function() {
    });
}