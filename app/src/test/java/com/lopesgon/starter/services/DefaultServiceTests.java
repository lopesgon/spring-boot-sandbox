package com.lopesgon.starter.services;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import com.lopesgon.starter.entities.Default;
import com.lopesgon.starter.repositories.DefaultRepository;
import com.lopesgon.starter.services.impl.DefaultServiceImpl;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


class DefaultServiceTests {

	private DefaultServiceImpl defaultService;
	
	@Mock
	private DefaultRepository defaultRepository;

	private Default dflt;

	@BeforeEach
	public void before() {
		this.defaultRepository = Mockito.mock(DefaultRepository.class);
		this.defaultService = new DefaultServiceImpl(this.defaultRepository);
		this.dflt = getDefault();
	}

	@Test
	void getDefaultTest() {
		// given
		when(defaultRepository.getOne(anyLong())).thenReturn(this.dflt);

		// when
		Default result = defaultService.getDefault(1L);

		// then
		Assert.assertEquals("Mocked Name", result.getName());
	}

	private Default getDefault() {
		return Default.builder()
			.name("Mocked Name")
			.active(true)
			.build();
	}

}
