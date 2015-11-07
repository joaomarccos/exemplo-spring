package br.com.recursive.exemplo.spring.negocio.services;

import br.com.recursive.exemplo.spring.entidades.Pessoa;
import javax.inject.Named;
import org.springframework.stereotype.Service;

/**
 *
 * @author douglasgabriel
 */
@Service
@Named
public interface PessoaService {
    
    public void salvar (Pessoa pessoa);
    
}
