package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferServiceImpl;

@Configuration
public class AccConfig {
	
	@Bean(value = "accountRepository")
	public InMemoryAccountRepository repo()
	{
		return new InMemoryAccountRepository();
	}
	@Bean(value="transferService")
	public TransferServiceImpl trans()
	{
		return new TransferServiceImpl(repo());
	}
}
