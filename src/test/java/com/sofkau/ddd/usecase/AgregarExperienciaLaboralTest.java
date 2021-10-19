package com.sofkau.ddd.usecase;

import co.com.sofka.business.repository.DomainEventRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AgregarExperienciaLaboralTest {

    @Mock
    private DomainEventRepository repository;
}
