package ajaxerrortest.xmlcommands;

import com.aviarc.core.exceptions.CommandException;
import com.aviarc.core.state.State;
import com.aviarc.framework.xml.command.AbstractXMLCommand;

public class TestThrowError extends AbstractXMLCommand {
    private static final long serialVersionUID = 0L;
    
    public TestThrowError() {}

    @Override
    public void doInitialize(InitializationContext ctx) {
    }

    @Override
    public void run(State s) {
        throw new CommandException("test throw error");
    }
}
