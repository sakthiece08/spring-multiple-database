package org.teqmonic.springmultipledatabase.secondary.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.teqmonic.springmultipledatabase.primary.model.Employee;
import org.teqmonic.springmultipledatabase.secondary.model.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
