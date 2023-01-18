package ec.edu.insteclrg.service.crud;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.insteclrg.dto.ServicioDTO;
import ec.edu.insteclrg.persistence.ServiceRepository;
import ec.edu.insteclrg.service.GenericCrudServiceImpl;

@Service
public class ServiceService extends GenericCrudServiceImpl<ec.edu.insteclrg.domain.Service, ServicioDTO> {

	@Autowired
	private ServiceRepository repository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public Optional<ec.edu.insteclrg.domain.Service> find(ServicioDTO dto) {
		return repository.findById(dto.getId());
	}

	@Override
	public ServicioDTO mapToDto(ec.edu.insteclrg.domain.Service domain) {
		return modelMapper.map(domain, ServicioDTO.class);
	}

	@Override
	public ec.edu.insteclrg.domain.Service mapToDomain(ServicioDTO dto) {
		return modelMapper.map(dto, ec.edu.insteclrg.domain.Service.class);
	}

}
