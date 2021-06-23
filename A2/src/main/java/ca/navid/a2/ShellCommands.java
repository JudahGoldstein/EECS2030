package ca.navid.a2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * Spring Shell methods goes in this class. This allows you to interact with your application at runtime.
 */
@ShellComponent
public class ShellCommands {

    private static final Logger logger = LoggerFactory.getLogger(ShellCommands.class);

    /**
     * clears cache
     * @return message to echo back to the console
     */
    @ShellMethod("Flush the cache ... ")
    public String cacheflush()
    {
        Singleton.getInstance().clearCache();
        return "cache flushed";
    }

}
