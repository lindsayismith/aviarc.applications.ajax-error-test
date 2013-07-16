/*global
YAHOO
*/

(function () {
    YAHOO.namespace("qmuPortal");
    var qmuPortal = YAHOO.qmuPortal;
    var Toronto = YAHOO.com.aviarc.framework.toronto;

    qmuPortal.SetReturnValue = function () {
        
    };

    YAHOO.lang.extend(qmuPortal.SetReturnValue, Toronto.framework.DefaultActionImpl, {
        run: function (state) {
            var theValue = this.getAttribute('value', state);
            var theType = this.getAttribute('type', state);
            
            if (theType === 'boolean'){
                theValue = parseBoolean(theValue);
            } else if (theType === 'integer'){
                theValue = parseInt(theValue);
            }
            state.getExecutionState().setReturnValue(theValue);
        }
    });
})();
