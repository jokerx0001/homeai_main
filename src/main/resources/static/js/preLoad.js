/**
 * preLoad.js
 * version 1.0
 */

/**
 * load javaScript by array
 *
 * @param urlArr
 * @returns
 */
function loadScriptByArr(urls) {

    var head = document.getElementsByTagName("head")[0];

    for (var i = 0; i < urls.length; i++) {

        head.appendChild(createScriptNode(urls[i]));
    }
}

/**
 *
 * @param url
 * @param callback
 * @returns
 */
function loadScript(url, callback) {

    var script = document.createElement("script");
    script.type = "text/javascript";

    if (script.readyState) {
        script.onreadystatechange = function() {
            if (script.readyState == "loaded" || script.readyState == "complete") {
                script.onreadystatechange = null;
                callback();
            }
        };
    } else {
        script.onload = function() {
            callback();
        };
    }

    script.src = url;
    document.getElementsByTagName("head")[0].appendChild(script);
}

function createScriptNode(url) {

    var script = document.createElement("script");
    script.type = "text/javascript";

    script.src = url;
    return script;
}