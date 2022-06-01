package br.com.wellington.aplicacaojhipster.repository;

import br.com.wellington.aplicacaojhipster.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
