package ajaxerrortest.xmlcommands;

import com.aviarc.core.state.State;
import com.aviarc.framework.xml.command.AbstractXMLCommand;

public class TestExecutionException extends AbstractXMLCommand {
    private static final long serialVersionUID = 0L;
    
    public TestExecutionException() {}

    @Override
    public void doInitialize(InitializationContext ctx) {
        // Read XML attributes etc
    }

    @Override
    public void run(State s) {
      throw new com.aviarc.core.exceptions.ExecutionException("test execution exception");
    }
}
