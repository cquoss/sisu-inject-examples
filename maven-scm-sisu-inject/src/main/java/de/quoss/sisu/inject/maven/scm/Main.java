package de.quoss.sisu.inject.maven.scm;

import org.apache.maven.scm.manager.ScmManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class Main {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    @Inject
    ScmManager scmManager;
    
    private void run() {
        LOGGER.info("main/run [scm-manager={}]", scmManager);
    }
    
    public static void main(final String[] args) throws Exception {
        
        new Main().run();
        
    }
    
}
