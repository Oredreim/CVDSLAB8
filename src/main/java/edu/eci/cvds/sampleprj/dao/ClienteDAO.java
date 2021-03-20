package edu.eci.cvds.sampleprj.dao;

import edu.eci.cvds.samples.entities.Cliente;
import java.util.*;
import org.mybatis.guice.transactional.Transactional;

public interface ClienteDAO {

    public Cliente load(long id) throws PersistenceException;
}