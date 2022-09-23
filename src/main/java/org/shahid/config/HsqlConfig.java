package org.shahid.config;

import org.hsqldb.server.Server;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;

@Configuration
public class HsqlConfig {

    /**
     * This configuration is required to start HSQL server
     * with spring boot app.
     * Other application could connect to HSQL server using below
     * jdbc url
     * mem  - jdbc:hsqldb:hsql://<Ip Address>:<port>/<dbname>
     * file - jdbc:hsqldb:hsql://<Ip Address>/<dbname>;file:<database/path>
     * @param props
     * @return
     * @throws IOException
     * @throws AclFormatException
     */
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server hsqlServer(@Value("classpath:/hsqldb.properties") Resource props) throws IOException, AclFormatException {
        Server bean = new Server();
        bean.setProperties(PropertiesLoaderUtils.loadProperties(props));
        return bean;
    }
}
