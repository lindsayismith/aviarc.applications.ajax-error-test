package ajaxerrortest.xmlcommands;

import com.aviarc.core.runtimevalues.RuntimeValue;
import com.aviarc.core.state.State;
import com.aviarc.framework.xml.command.AbstractXMLCommand;
import com.aviarc.framework.xml.compilation.CompiledElementAttribute;

public class SendAjaxErrorResponse extends AbstractXMLCommand {
    private static final long serialVersionUID = 0L;
    private RuntimeValue<String> _message;
    
    public SendAjaxErrorResponse() {}

    @Override
    public void doInitialize(InitializationContext ctx) {
        _message = ctx.getElementContext().getAttribute("message").getRuntimeValue();
    }

    @Override
    public void run(State s) {
        
        s.getRequestState().getCurrentResponse().sendError(com.aviarc.core.response.Error.INTERNAL_SERVER_ERROR, 
                                                           _message.getValue(s), 
                                                           s);
    }
}
