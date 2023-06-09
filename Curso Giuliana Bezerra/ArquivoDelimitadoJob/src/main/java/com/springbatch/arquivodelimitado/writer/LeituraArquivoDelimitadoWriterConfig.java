package com.springbatch.arquivodelimitado.writer;

import com.springbatch.arquivodelimitado.entity.ClienteDAO;
import com.springbatch.arquivodelimitado.repository.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbatch.arquivodelimitado.dominio.Cliente;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class LeituraArquivoDelimitadoWriterConfig implements ItemWriter<Cliente> {

	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public void write(List<? extends Cliente> list) throws Exception {
		ModelMapper modelMapper = new ModelMapper();

		List<ClienteDAO> clienteDAOList = new ArrayList<>();

		for (Cliente cliente : list) {
			ClienteDAO clienteDAO = modelMapper.map(cliente, ClienteDAO.class);
			clienteDAOList.add(clienteDAO);
		}

		clienteRepository.saveAll(clienteDAOList);
	}
}
